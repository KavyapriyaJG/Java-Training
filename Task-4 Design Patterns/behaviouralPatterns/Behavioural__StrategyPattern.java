package behaviouralPatterns;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

abstract class Developer{
	public abstract void techStack();
}
class FrontendDev extends Developer{
	@Override
	public void techStack() {
		System.out.println("HTML, CSS, Js, ReactJs");
	}
	public void getUserPerspective() {
		System.out.println("Worked with UX people and researched on usability of application");
	}
	
}
class BackendDev extends Developer{
	@Override
	public void techStack() {
		System.out.println("Java, SpringBoot, NodeJS, SQL ...");
	}
	public void useDesignPatterns() {
		System.out.println("Has knowledge of Creational, Behavioural, Structural Design patterns");
	}
}

class Fresher{
	Developer candidate;
	public Developer hireFresher() {
		return candidate;
	}
}

public class Behavioural__StrategyPattern {
	public static void main(String[] args) throws Exception{
			Scanner scanner = new Scanner(System.in);
			Fresher ace = new Fresher();
			System.out.print("Enter your role: ");
			String role = scanner.next();
			ace.candidate = (Developer)Class.forName(role).newInstance();
			
			ace.hireFresher().techStack();
			scanner.close();
	}
}
