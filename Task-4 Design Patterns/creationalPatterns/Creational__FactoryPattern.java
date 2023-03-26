package creationalPatterns;
//Problem :  when an object needs to be created, but the class does not know what kind of object it should create
//Solution: Define an interface for creating objects, but let subclasses to decide which class to instantiate 

interface Manufacturer{
}
class PhoneManufacturer implements Manufacturer{
	private OSFactory osFactory;
	private OS os;
	
	public void setOSFactory(OSFactory osFactory) {
		this.osFactory =osFactory;
	}
	public OS getOS() {
		this.os = osFactory.makeOS();
		return os;
	}
}

interface Factory{
	
}
abstract class OSFactory implements Factory{
	public abstract OS makeOS();
}
class iOSFactory extends OSFactory{
	iOSFactory(){ }
	public iOS makeOS() {
		return new iOS();
	}
}
class AndroidOSFactory extends OSFactory{
	public AndroidOSFactory() { }
	public AndroidOS makeOS() {
		return new AndroidOS();
	}
}
class WindowsOSFactory extends OSFactory{
	public WindowsOSFactory() { }
	public WindowsOS makeOS() {
		return new WindowsOS();
	}
}

abstract class OS{ }
class iOS extends OS{ }
class AndroidOS extends OS{ }
class WindowsOS extends OS{ }

class PoorvikaContainer{
	public static PhoneManufacturer getPhone() throws Exception{
		
		PhoneManufacturer manufacturer= new PhoneManufacturer();
		OSFactory osFactory = new iOSFactory();
		//dependency injection
		manufacturer.setOSFactory(osFactory);
		
		return manufacturer;
	}
}

public class Creational__FactoryPattern {
	public static void main(String[] args) throws Exception{
		
		PhoneManufacturer redmi = PoorvikaContainer.getPhone();
		
		System.out.println(redmi.getOS());
		
		
	}

}
