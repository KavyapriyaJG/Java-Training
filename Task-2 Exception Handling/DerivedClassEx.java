class BaseClass{
	int number;
	BaseClass() throws Exception{
		System.out.println("Cons of super class");
		number = 30/0;
	}
}

class DerivedClass extends BaseClass{
	DerivedClass()throws Exception{
		
	}
}

public class DerivedClassEx {
	public static void main(String[] args) throws Exception {
		BaseClass derived = new DerivedClass();
	}
}
