class ComplexDataTypeTemplate{
	int variableInsideClass = 1;
}


public class ProofForPassing {

	public static void printPrimitiveValue(int x){
		x=20;
		System.out.println("Primitive from Called function "+x);
	}
	
	public static void printComplexValue(int arr[]) {
		int i, n =arr.length;
		for(i=0;i<n;i++)
			arr[i]*=10;
		
		System.out.println("\nComplex from called function");
		for(i=0;i<n;i++)
			System.out.print(arr[i]+"  ");
	}
	
	public static void complexPassByValue(int val){
		val = 10;
		System.out.println("Pass by value is : "+val);
	}
	
	public static void complexPassByReference(ComplexDataTypeTemplate val){
		System.out.println("Pass by value is : "+val);
	}
	
	public static void passByValue(int val) {
		val = val+5;
		System.out.println("\nPassed By Value "+ val);
	}
	public static void passByReference(ComplexDataTypeTemplate val) {
		val.variableInsideClass+=100;
		System.out.println("Passed By Reference " + val.variableInsideClass);
	}
	
	
	public static void main(String[] args) {
		int i=10;
		System.out.println("Primitive from Main before passing "+i);
		printPrimitiveValue(i);
		System.out.println("Primitive from Main after passing "+i);
		
		int array[] = {1,2,3,4,5};
		System.out.println("\nComplex from Main before passing");
		for(int ele: array)
			System.out.print(ele+"  ");
		printComplexValue(array);
		System.out.println("\nComplex from Main after passing");
		for(int ele: array)
			System.out.print(ele+"  ");
		System.out.println();
		
		ComplexDataTypeTemplate c= new ComplexDataTypeTemplate();
		int n = c.variableInsideClass;
		passByValue(n);
		System.out.println("Instance variable after passing by value "+ c.variableInsideClass);
		
		passByReference(c);
		System.out.println("Instance variable after passing by reference "+ c.variableInsideClass);
	}

}
