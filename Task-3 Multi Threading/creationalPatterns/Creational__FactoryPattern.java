package creationalPatterns;
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

//Phone Factory
public class Creational__FactoryPattern {
	public static void main(String[] args) throws Exception{
		PhoneManufacturer redmi = new PhoneManufacturer();
		OSFactory google = new AndroidOSFactory();
		redmi.setOSFactory(google);
		OS os = redmi.getOS();
		System.out.println(os);
		
		
	}

}
