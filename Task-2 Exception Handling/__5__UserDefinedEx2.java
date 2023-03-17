public class __5__UserDefinedEx2 {
	
	public static void method1() throws KavyaDefinedException{
		throw new KavyaDefinedException();
	}
	
	public static void main(String[] args) throws KavyaDefinedException {
		method1();
	}
}
