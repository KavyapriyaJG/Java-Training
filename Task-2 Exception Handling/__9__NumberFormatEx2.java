import java.util.Scanner;

class PriyaDefinedException extends Exception{
	PriyaDefinedException(String st){
		super(st);
	}
}
class NegativeRangeException extends PriyaDefinedException{
	NegativeRangeException(){
		super("Mark can't be negative");
	}
	
}
class NotValidMarkException extends PriyaDefinedException{
	NotValidMarkException(){
		super("Mark can't exceed 100");
	}
	
}

public class __9__NumberFormatEx2 {
	static void checkRange(int n) throws PriyaDefinedException {
		if(n<0)
			throw new NegativeRangeException();
		else if(n>100)
			throw new NotValidMarkException();
		
	}
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		int numb,index,sum,students=10;
		int marks;
		
			index=0; sum=0;
			while(index<students) {
				try {
					System.out.println("Enter the marks of the student-"+(index+1)+" : ");
					marks =Integer.parseInt(scanner.next());
					checkRange(marks);
					sum+=marks; 
					index++; 
				}
				catch(NumberFormatException e) {
					e.printStackTrace();
				}
				catch(PriyaDefinedException pde) {
					pde.printStackTrace();
				}
				
			}
			System.out.println("Average is : "+ (sum/students));
		
		
	}
}
