class Student {
	String name;
	int rollNumber;
	Student(String name, int rollNumber){
		this.name = name;
		this.rollNumber = rollNumber;
	}
}
class Exam extends Student{
	int mark1;
	int mark2;
	int mark3;
	
	Exam(int mark1, int mark2, int mark3, String name, int rollNumber){
		super(name, rollNumber);
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
}
class Result extends Exam{
	int totalMark;
	
	Result(int mark1, int mark2, int mark3, String name, int rollNumber){
		super(mark1, mark2, mark3, name, rollNumber);
		totalMark =0;
	}
	
	public int calculateTotalMarks() {
		totalMark = mark1+mark2+mark3;
		return totalMark;
	}
}

public class School {
	public static void main(String[] args) {
		System.out.println("Welcome to School");
		Result kavya = new Result(100,45,90,"Kavya",2306);
		System.out.println("Result is : "+kavya.calculateTotalMarks());
	}
}
