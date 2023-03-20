import java.util.Scanner;

public class ___8__NumberFormatEx {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		int index=0,sum=0,students=10;
		int marks;
			while(index<students) {
				try {
					System.out.println("Enter the marks of the student-"+(index+1)+" : ");
					marks =Integer.parseInt(scanner.next());
					sum+=marks; 
					index++; 
				}
				catch(NumberFormatException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Average is : "+(sum/students));
	}
}
