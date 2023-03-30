package ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/**
 * Demonstrating JDBC for SQL - exercise 2
 * @author Kavyapriya
 */

public class exercise2 {
	/**
	 * Loaded the driver, Connection Established, Queries Executed, Connection closed
	 * 
	 * Statement class - to access database. Executes static SQL queries
	 * PreparedStatement class - to access database and execute queries with dynamic parameters with ' ? '
	 * 
	 * @param args not used
	 */
	public static void main(String args[]) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (java.lang.ClassNotFoundException e) {
			System.out.print("ClassNotFoundException: ");
			System.out.println(e.getMessage());
		}
		Connection connection = null;
		String tableName = "COFFEE";
		
		try{
			connection = DriverManager.getConnection("jdbc:mysql://localhost/acedb", "root", "1234567890");

			HashMap<String, Integer> map = new HashMap<>();
			map.put("Colombian", 1);
			map.put("French_Roast", 1);
			map.put("Espresso", 1);
			map.put("Colombian_Decaf", 1);
			map.put("French_Roast_Decaf", 1);

			connection.setAutoCommit(false);
			
			try( PreparedStatement updateSales = connection.prepareStatement("update "+ tableName +" set WEEKLY_SALES = ? where COFFEE_NAME like ?");
					PreparedStatement updateTotal = connection.prepareStatement("update "+ tableName +" set TOTAL_SALES = TOTAL_SALES + ? where COFFEE_NAME like ?");
				){
				for(String coffee : map.keySet()) {
					updateSales.setInt(1, map.get(coffee));
					updateSales.setString(2, coffee);
					updateSales.executeUpdate();
					
					updateTotal.setInt(1, map.get(coffee));
					updateTotal.setString(2, coffee);
					updateTotal.executeUpdate();
	
					connection.commit();
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			connection.setAutoCommit(true);

			String query = "select * from "+ tableName;
			
			try(Statement statement = connection.createStatement();
					ResultSet rs = statement.executeQuery(query);){
				while (rs.next()) {
					String c = rs.getString("COFFEE_NAME");
					int s = rs.getInt("WEEKLY_SALES");
					int t = rs.getInt("TOTAL_SALES");
					System.out.println(c + " " + s + " " + t);
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			connection.close();
		} catch (SQLException exception) {
			System.out.println("SQLException: " + exception.getMessage());
			if (connection != null) {
				try {
					System.out.println("Transaction is being rolled back");
					connection.rollback();
					connection.close();
				} catch (SQLException sqlException) {
					System.out.print("SQLException: ");
					System.out.println(sqlException.getMessage());
				}
			}
		}
		
	}
}
