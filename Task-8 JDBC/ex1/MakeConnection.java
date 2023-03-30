package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Demonstrating JDBC for SQL
 * @author Kavyapriya
 */

public class MakeConnection {
	ResultSet resultSet;
	String tableName = "employee";
	
	/**
	 * Constructor loads in DriverManager, creates a statement, queries executed with execute Update
	 * 
	 * execute() - returns boolean - resultSet received or not - for DDL
	 * executeQuery() - returns resultSet - contents of table - select statement
	 * executeUpdate() - returns int - no of rows affected - for DML 
	 */
	MakeConnection() {
		try {
			//Driver class loaded
			Class.forName("com.mysql.cj.jdbc.Driver");	
		}catch (java.lang.ClassNotFoundException e) {
			System.out.print("ClassNotFoundException: ");
			System.out.println(e.getMessage());
		}
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/acedb", "root", "1234567890"); 
			Statement statement = connection.createStatement();){
		
			//Inserting records to the table
			statement.executeUpdate("insert into "+ tableName +" values (2306,'kavya', 'dev', 1)");
			statement.executeUpdate("insert into "+ tableName +" values (2309,'priya', 'QA', 10)");
			statement.executeUpdate("insert into "+ tableName +" values (1298,'govind', 'Cloud Engineer', 5)");
			
			//Table with contents fetched
			resultSet = statement.executeQuery("select * from "+ tableName);
			
			//Table with contents printed on Console
			while (resultSet.next())
				System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) +" " +resultSet.getString(3) + " " + resultSet.getInt(4));
		
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
