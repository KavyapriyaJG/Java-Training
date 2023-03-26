package behaviouralPatterns;
//Problem : separate operational functionalities from a class
//Solution: define a new operation without changing the classes of the elements on which it operates. new visitor functions can be added in future

import java.util.Scanner;

abstract class Human{
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
	}
	
}
class Pensioner extends Human{
	float pension;
	public Pensioner(String name, String address, int age, float salary, float pension) {
		super(name, address, age, salary);
		this.pension = pension;
	}
	public void visit(bankTransaction bt) {
		bt.pay(this.pension, this);
		new CurrentBalance(this).showBalance();
	}
	
}
interface bankTransaction{
	public abstract void pay(float amount, Parent man);
	public abstract void pay(float amount, Tenant man);
	public abstract void pay(float amount, Pensioner man);
	
}
class Transact implements bankTransaction{
	public void pay(float amount, Parent man) {
		man.salary-=amount;
		System.out.println("Rent payed to house owner : "+ amount);
	}
	public void pay(float amount, Tenant man) {
		man.salary-=amount;
		System.out.println("Annual school fee paid : "+ amount);
	}
	public void pay(float amount, Pensioner man) {
		man.salary+=amount;
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
		bankTransaction amount = new Transact();
		govind.visit(amount);
		
		scanner.close();
		
	}
}
