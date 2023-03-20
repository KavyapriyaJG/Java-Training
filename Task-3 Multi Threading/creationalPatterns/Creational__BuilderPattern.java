package creationalPatterns;

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

		public BuildHouse buildBedRoom(Hall hall) {
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
		House ishwaryam = new House.BuildHouse().buildBedRoom(new BedRoom()).buildKitchen(new Kitchen()).buildHouse();

		System.out.println(ishwaryam);
	}
}
