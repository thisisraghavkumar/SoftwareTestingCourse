package core;

public class Truck extends Vehicle {
	final private int load;
	
	public Truck(String s, int numWheels, double maxSpeed, int capacity) {
		super(s, numWheels, maxSpeed);
		this.load = capacity;
	}
	
	public int getCapacity() {
		return this.load;
	}
	
	public void honk() {
		System.out.print("Make way for truck ");
		System.out.print(this.getId());
		System.out.print(", running at ");
		System.out.print(this.getSpeed());
		System.out.print(" mph, carrying ");
		System.out.print(this.getCapacity());
		System.out.println(" quintals of cargo.");
	}
}
