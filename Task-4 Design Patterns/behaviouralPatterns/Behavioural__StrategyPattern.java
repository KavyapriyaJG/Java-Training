package behaviouralPatterns;
//Problem : classes differ only in their behavior
//Solution : Define a family of algorithms, encapsulate each one, and make them interchangeable

class Fresher{
	private Developer role;
	
	public void setFresherRole(Developer role) {
		this.role = role;
	}
	public Developer getFresherRole() {
		return role;
	}
}

interface Developer{
	void techStack();
}
class FrontendDev implements Developer{
	@Override
	public void techStack() {
		System.out.println("HTML, CSS, Js, ReactJs");
	}
	public void getUserPerspective() {
		System.out.println("Worked with UX people and researched on usability of application");
	}
	
}
class BackendDev implements Developer{
	@Override
	public void techStack() {
		System.out.println("Java, SpringBoot, NodeJS, SQL ...");
	}
	public void useDesignPatterns() {
		System.out.println("Has knowledge of Creational, Behavioural, Structural Design patterns");
	}
}



public class Behavioural__StrategyPattern {
	public static void main(String[] args) throws Exception{
			Fresher ace = new Fresher();	
			ace.setFresherRole(new BackendDev());
			
			ace.getFresherRole().techStack();
	}
}
