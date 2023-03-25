package bridge;

/**
 * Problem : A class tries to grow in more than 1 dimension can create multiple combination of its sub classes. 
 * Solution: Differentiate into hierarchies of growth and placing a bridge of the composite part to those hierarchies. 
 * @author Kavyapriya
 *
 */
public class MBBSAspirant {
	public static void main(String[] args) {
		
		CoachingInstitute center = new Kota(new Repeaters());
		center.getTutored();
		center.getTested();
	}

}
