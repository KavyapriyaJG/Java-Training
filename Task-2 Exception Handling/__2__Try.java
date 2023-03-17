public class __2__Try {
	public static void main(String[] args) {
		Sample sample = new Sample();

		sample.method1();
	}
}

class Sample {
	public void method1() {
		method2();
		System.out.println("Caller function");
	}

	public void method2() {
		try {
			int kavya = 101/0;
			//return;
		} catch (Exception e) {
			System.out.println("Exception caught in method 2 : " + e);
		} finally {
			System.out.println("Finally in method 2");
		}
	}
}
