class A {
	A() {
		System.out.println("Cons of A called..");
	}
}

class B {
	B() {
		System.out.println("Cons of B called..");
	}
}

class C extends A {
	B obj = new B();
	{
		System.out.println("SOP of C..");
	}
}

public class Day2__10__ClassesExperiment {

	public static void main(String[] args) {
		C objRef = new C();
	}

}