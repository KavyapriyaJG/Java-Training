class KavyaDefinedException extends Exception{  //checked exception
	@Override
	public String toString() {
		return "Sorry It is a KavyaDefinedException";
	}
	
}

public class __4__UserDefinedEx {
	public static void main(String[] args){
		try {
			throw new KavyaDefinedException();
		}
		catch(KavyaDefinedException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block..");
		}

	}

}
