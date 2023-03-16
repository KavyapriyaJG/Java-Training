import java.util.Scanner;

public class ___8__NumberFormatEx {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		int index,sum,students=10;
		int marks[] = new int[3];
		
		while(students-- >0) {
			System.out.println("Enter the 3 subject marks of Student "+ (10-students));
			index=0; sum=0;
			while(index<3) {
				try {
					marks[index] =Integer.parseInt(scanner.next());
					sum+=marks[index]; 
					index++; 
				}
				catch(NumberFormatException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Average is : "+(sum/3));
		}
	}
}
