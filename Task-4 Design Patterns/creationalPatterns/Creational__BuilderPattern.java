package creationalPatterns;
//Problem : An application might need a mechanism for building complex objects that is independent from the ones that make up the object.
//Solution : Define an instance for creating an object but letting subclasses decide which class to instantiate

class House {
	BedRoom bedroom;
	Kitchen kitchen;
	Hall hall;

	public House(BedRoom bedroom, Kitchen kitchen, Hall hall) {
		this.bedroom = bedroom;
		this.kitchen = kitchen;
		this.hall = hall;
	}

	static class BuildHouse {
		BedRoom bedroom;
		Kitchen kitchen;
		Hall hall;

		public BuildHouse buildBedRoom(BedRoom bedroom) {
			this.bedroom = bedroom;
			return this;
		}

		public BuildHouse buildKitchen(Kitchen kitchen) {
			this.kitchen = kitchen;
			return this;
		}

		public BuildHouse buildHall(Hall hall) {
			this.hall = hall;
			return this;
		}

		public House buildHouse() {
			return new House(bedroom, kitchen, hall);
		}

	}

	@Override
	public String toString() {
		return "House [bedroom=" + bedroom + ", kitchen=" + kitchen + ", hall=" + hall + "]";
	}

}

class BedRoom {

}

class Kitchen {

}

class Hall {

}

public class Creational__BuilderPattern {
	public static void main(String[] args) {
		House ishwaryam = new House.BuildHouse().buildBedRoom(new BedRoom()).buildHouse();

		System.out.println(ishwaryam);
	}
}
