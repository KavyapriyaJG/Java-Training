class A{
	A(){
		System.out.println("Cons of A called..");
	}
}
class B{
	B(){
		System.out.println("Cons of B called..");
	}
}
class C extends A{
	B obj = new B();
	{
	System.out.println("SOP of C..");
	}
}

public class ClassesExperiment {
	
	public static void main(String[] args) {
		C objRef = new C();
	}

}

/*
*Order of execution
*	1. Static block
*	2. Static properties
*	3. Properties
*	4. Super class cons-super();
*	5. The class's constructor
*/