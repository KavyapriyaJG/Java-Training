class ObjectDataTypeTemplate {
	int variableInsideClass = 1;
}

public class Day2__01__ProofForPassing {

	public static void printPrimitiveValue(int x) {
		x = 20;
		System.out.println("Called function " + x);
	}

	public static void printArrayValue(int arr[]) {
		int index, length = arr.length;
		for (index = 0; index < length; index++)
			arr[index] *= 10;

		System.out.println("\nArray from called function");
		for (index = 0; index < length; index++)
			System.out.print(arr[index] + "  ");
	}

	public static void passByValue(int val) {
		val = val + 5;
		System.out.println("\nPassed By Value " + val);
	}

	public static void passByReference(ObjectDataTypeTemplate val) {
		val.variableInsideClass += 100;
		System.out.println("Passed By Reference " + val.variableInsideClass);
	}

	public static void main(String[] args) {
		int i = 10;
		System.out.println("Primitive from Main before passing " + i);
		printPrimitiveValue(i);
		System.out.println("After passing " + i);
		

		int array[] = { 1, 2, 3, 4, 5 };
		System.out.println("\nArray from Main before passing");
		for (int ele : array)
			System.out.print(ele + "  ");
		printArrayValue(array);
		System.out.println("\nAfter passing");
		for (int ele : array)
			System.out.print(ele + "  ");
		System.out.println();

		
		ObjectDataTypeTemplate object = new ObjectDataTypeTemplate();
		int n = object.variableInsideClass;
		passByValue(n);
		System.out.println("After passing by value " + object.variableInsideClass);

		passByReference(object);
		System.out.println("After passing by reference " + object.variableInsideClass);
	}

}
