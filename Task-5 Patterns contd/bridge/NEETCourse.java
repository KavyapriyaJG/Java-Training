package bridge;

/**
 * interface NEET course that has abstract methods like issueBooks and getMethodOfTeaching
 * @author Kavyapriya
 */
interface NEETCourse {
	void issueBooks();
	void getMethodOfTeaching();
}

/**
 * Regulars class that implements NEETCourse
 * @author Kavyapriya
 *
 */
class Regulars implements NEETCourse{
	@Override
	public void issueBooks() {
		System.out.println("NCERT text books issued...");
	}
	@Override
	public void getMethodOfTeaching() {
		System.out.println("Classes start after school timings...");
	}
}

/**
 * Repeaters class that implements NEETCourse
 * @author Kavyapriya
 *
 */
class Repeaters implements NEETCourse{
	@Override
	public void issueBooks() {
		System.out.println("NCERT text books + Study materials issued...");
	}
	@Override
	public void getMethodOfTeaching() {
		System.out.println("Online distance education / Full time In-school coaching...");
	}
	
}