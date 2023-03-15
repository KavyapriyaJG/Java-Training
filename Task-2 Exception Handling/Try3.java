public class Try3 {
	public static void main(String[] args) {
		Sample3 sample = new Sample3();
		sample.method1();
	}
}

class Sample3{
	public void method1() {
		method2();
		System.out.println("Caller function");
	}
	public void method2() {
		try{
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("Exception caught in method 2 : "+e);
		}
		finally {
			System.out.println("Finally in method 2");
		}
	}
}
