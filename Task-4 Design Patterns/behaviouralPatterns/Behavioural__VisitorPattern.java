package behaviouralPatterns;
//separate operational functionalities from a class. new visitors can be added in future
//Visitor lets you define a new operation without changing the classes of the elements on which it operates.

import java.util.Scanner;

class Human{
	String name;
	String address;
	int age;
	float salary;
	public Human(String name, String address, int age, float salary) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}
}
class Tenant extends Human{
	float rent;
	public Tenant(String name, String address, int age, float salary, float rent) {
		super(name,address,age,salary);
		this.rent = rent;
	}
	
	public void visit(bankTransaction bt) {
		bt.pay(this.rent, this);
		new CurrentBalance(this).showBalance();
	}

}
class Parent extends Human{
	float schoolFee;
	public Parent(String name, String address, int age, float salary, float schoolFee) {
		super(name, address, age, salary);
		this.schoolFee = schoolFee;
	}
	public void visit(bankTransaction bt) {
		bt.pay(this.schoolFee, this);
		new CurrentBalance(this).showBalance();
	}
	
}
interface bankTransaction{
	public abstract void pay(float amount, Human man);
}
class TransactRent implements bankTransaction{
	@Override
	public void pay(float amount, Human man) {
		man.salary-=amount;
		System.out.println("Rent payed to house owner : "+ amount);
	}
}
class TransactSchoolFee implements bankTransaction{
	@Override
	public void pay(float amount, Human man) {
		man.salary-=amount;
		System.out.println("Annual school fee paid : "+ amount);
	}
}
class SaveInBank implements bankTransaction{
	@Override
	public void pay(float amount, Human man) {
		man.salary-=amount;
		System.out.println("Money added to bank: "+ amount);
	}
}
class CurrentBalance{
	Human citizen;
	public CurrentBalance(Human citizen) {
		this.citizen = citizen;
	}
	public void showBalance() {
		System.out.println("Current balance is : "+citizen.salary);
	}
}
public class Behavioural__VisitorPattern {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		Parent govind = new Parent("Govindarajan","Porur, Chennai", 60, 80_000, 50_000);
//		System.out.println("Choose among the following: TransactRent | TransactSchoolFee | SaveInBank");
//		String transactionOption = scanner.next();
//		bankTransaction amount = (bankTransaction)Class.forName(transactionOption).getConstructor().newInstance();
		bankTransaction amount = new TransactSchoolFee();
		govind.visit(amount);
		
		scanner.close();
		
	}
}
