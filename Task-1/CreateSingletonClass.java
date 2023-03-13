class Singleton{

	private static Singleton s1 = new Singleton();
	
	String fullname;
	private Singleton() {
		System.out.println("Singleton constructor called ");
	}
	public static Singleton getInstance() {
		return s1;
	}
	public void printName() {
		System.out.println("This is a singleton class of "+fullname);
	}
}

//--CAUSES ERROR SINCE TRYING TO ACCESS SINGLETON VIA SUPER CONS
//class SingletonSubClass extends Singleton{
//	
//}

//--CAN ACCESS IF BASE CLASS CONS IS PROTECTED OR NOMOD OR PUBLIC
//class subClass extends Singleton{
//	//CONS MODIFIER ACCESS CAN BE = or > access than base class)
//	protected subClass(String name) {
//		super(name);
//	}
//	
//}

public class CreateSingletonClass {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		s.fullname = "kavya";
		s.printName();
		
		Singleton s2 = Singleton.getInstance();
		s2.fullname = "priya";
		s2.printName();
		
		//--CAN ACCESS IF INSTANCE IS NOT PRIVATE BUT STATIC	
		//Singleton.s1.printName();
		
		//--CAN ACCESS IF CONS IS PUBLIC, PROTECTED(OUTSIDE PKG SUB CLASS), NOMOD(WITHIN PKG)
		//Singleton ss = new Singleton("name");
	}
}