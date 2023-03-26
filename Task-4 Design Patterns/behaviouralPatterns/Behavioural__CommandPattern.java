package behaviouralPatterns;
//Scenario : Complex Implementation details and objects are visible
//Solution : encapsulate a complex implementations as a request in an object, allow saving the requests in a queue for quick access

abstract class Command{
	public abstract void execute();
}

class VRGameCommand extends Command{
	SetupBox box; TV tv; Remote remote; VRGame vrgame;
	
	VRGameCommand(SetupBox box, TV tv, Remote remote, VRGame vrgame){
		this.box = box; 
		this.tv = tv; 
		this.remote = remote; 
		this.vrgame = vrgame;
	}
	@Override
	public void execute() {
		tv.turnOn();
		box.avMode2();
		remote.increaseVolume();
		vrgame.ttGame();
	}
	
}

class NewsCommand extends Command{
	SetupBox box; TV tv; Remote remote; Channel channel;
	
	NewsCommand(SetupBox box, TV tv, Remote remote, Channel channel){
		this.box = box; 
		this.tv = tv; 
		this.remote = remote; 
		this.channel = channel;
	}
	@Override
	public void execute() {
		tv.turnOn();
		box.avMode1();
		remote.decreaseVolume();
		channel.newsChannel();
	}
	
}

class SetupBox{
	public void avMode1() {
		System.out.println("Switching to AV mode 1");
	}
	public void avMode2() {
		System.out.println("Switching to AV mode 2");
	}
}
class TV{
	public void turnOn() {
		System.out.println("Turning tv on..");
	}
	public void turnOff() {
		System.out.println("Turning tv off..");
	}
}
class Remote{
	public void increaseVolume() {
		System.out.println("Increasing tv volume");
	}
	public void decreaseVolume() {
		System.out.println("Decreasing tv volume");
	}
}
class Channel{
	public void newsChannel(){
		System.out.println("Switched to news channel..");
	}
	public void serialChannel(){
		System.out.println("Switched to serial channel..");
	}
}
class VRGame{
	public void archeryGame() {
		System.out.println("Archery game is selected..");
	}
	public void ttGame() {
		System.out.println("Table tennis game is selected..");
	}
}

class GenieRemote{
	
	Command genie[] = new Command[5];
	
	public GenieRemote() {
		for(int i=0;i<genie.length;i++) {
			genie[i] = new Command() {
				@Override
				public void execute() { System.out.println("To be set slot.. ");}
			};
		}
	}
	
	public void setRemote(int slot, Command command) {
		genie[slot] = command;
	}
	public void remoteFunction(int slot) {
		genie[slot].execute();
	}
}

public class Behavioural__CommandPattern {
	public static void main(String[] args) {
		
		GenieRemote maid = new GenieRemote();
		maid.setRemote(1,new VRGameCommand(new SetupBox(), new TV(), new Remote(), new VRGame()));
		maid.setRemote(2,new NewsCommand(new SetupBox(), new TV(), new Remote(), new Channel()));
		
		maid.remoteFunction(1);
	}

}
