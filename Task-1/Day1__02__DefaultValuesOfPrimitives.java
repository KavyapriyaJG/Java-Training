public class Day1__02__DefaultValuesOfPrimitives {

	static boolean booleanMember;
	static byte byteMember;
	static char characterMember;
	static int intMember;
	static float floatMember;
	static double doubleMember;
	static short shortMember;
	static long longMember;

	Day1__02__DefaultValuesOfPrimitives() {
		System.out.println("Cons of class called..");

	}

	public static void main(String[] args) {

		System.out.println(booleanMember + " " + byteMember + " -" + characterMember + "- " + intMember);
		System.out.println(floatMember + " " + doubleMember + " " + shortMember + " " + longMember);

	}

}
