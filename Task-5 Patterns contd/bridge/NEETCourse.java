package bridge;

interface NEETCourse {
	public abstract void issueBooks();
	public abstract void getMethodOfTeaching();
}

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