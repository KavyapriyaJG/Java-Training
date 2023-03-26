package creationalPatterns;
//Problem : Multiple points of access for an object could cause inconsistency
//Solution : provide instantiation only once

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Electricity {
	private static Electricity instance;
	String electricalAppliance;
	
	private Electricity() {
		System.out.println("Electricity connection created..");
	}

	synchronized public static Electricity getConnection() {
		if (instance == null)
			instance = new Electricity();
		return instance;
	}
	
	public void switchOn(String appliance) {
		System.out.println("The electrical appliance "+appliance+" is swiched on...");
	}
}

public class Creational__SingletonPattern {
	public static void main(String[] args) {
		ExecutorService thread = Executors.newFixedThreadPool(3);

		thread.execute(() -> {
			Electricity fan = Electricity.getConnection();
			fan.switchOn("fan");
		});
		thread.execute(() -> {
			Electricity bulb = Electricity.getConnection();
			bulb.switchOn("bulb");
		});
		thread.execute(() -> {
			Electricity tv = Electricity.getConnection();
			tv.switchOn("tv");
		});

		thread.shutdown();
	}
}
