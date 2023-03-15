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

public class NumberFormatEx2 {
	static void checkRange(int n) throws PriyaDefinedException {
		if(n<0)
			throw new NegativeRangeException();
		else if(n>100)
			throw new NotValidMarkException();
		
	}
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		int numb,index,sum,students=10;
		int marks[] = new int[3];
		
		while(students-- >0) {
			System.out.println("Enter the 3 subject marks of Student "+ (10-students));
			index=0; sum=0;
			while(index<3) {
				try {
					marks[index] =Integer.parseInt(scanner.next());
					checkRange(marks[index]);
					sum+=marks[index]; 
					index++; 
				}
				catch(NumberFormatException e) {
					e.printStackTrace();
				}
				catch(PriyaDefinedException pde) {
					pde.printStackTrace();
				}
				
			}
			System.out.println("Average is : "+ (sum/3));
		}
		
	}
}
