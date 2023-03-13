
public class DefaultValuesOfPrimitives {

	boolean bl;
	byte by;
	char c;
	int i;
	float f;
	double d;
	short s;
	long l;
	
	DefaultValuesOfPrimitives(){
		{
			System.out.println("Cons of class called..");
		}
		
	}

	public static void main(String[] args) {
		
		DefaultValuesOfPrimitives objRef = new DefaultValuesOfPrimitives();
		
		System.out.println(objRef.bl+" "+objRef.by+" "+objRef.c+" "+objRef.i+" "+objRef.f+" "+objRef.d+" "+objRef.s+" "+objRef.l);

	}

}
