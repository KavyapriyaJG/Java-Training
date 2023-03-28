package bridge;
/**
 * Coaching Institue abstract class that has some state variables and abstract methods like getTutored and getTested
 * @author Kavyapriya
 *
 */
public abstract class CoachingInstitute {
	String id;
	String institute_name;
	String location;
	
	//Bridge 
	NEETCourse course;
	
	public CoachingInstitute(NEETCourse course) {
		this.course = course;
	}
	
	public abstract void getTutored();
	public abstract void getTested();
}

/**
 * Kota class extends the Coaching Institute abstract class
 * @author Kavyapriya
 *
 */
class Kota extends CoachingInstitute{

	public Kota(NEETCourse course) {
		super(course);
	}

	@Override
	public void getTutored() {
		System.out.println("Kota's expensive and exclusive study materials issued and taught....");
	}

	@Override
	public void getTested() {
		System.out.println("Online tests conducted Daily... Test reports compared for whole of India...");
	}
	
}

/**
 * GreenPark class extends the Coaching Institute abstract class
 * @author Kavyapriya
 *
 */
class GreenPark extends CoachingInstitute{
	public GreenPark(NEETCourse course) {
		super(course);
	}

	@Override
	public void getTutored() {
		System.out.println("Green park's study materials issued...");	
	}

	@Override
	public void getTested() {
		System.out.println("Weekly test conducted... Cummulative tests for month conducted.. Test reports sent to Parents...");
	}
}
