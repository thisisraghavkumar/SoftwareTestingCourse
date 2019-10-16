package core;

public class Car extends Vehicle {
	final private int passengers;
	
	public Car(String s, int numPassengers, double mS) {
		super(s, 4, mS);
		this.passengers = numPassengers;
	}
	
	public int getCapacity() {
		return this.passengers;
	}
	
	public void honk() {
		System.out.print("Make way for car ");
		System.out.print(this.getId());
		System.out.print(", running at ");
		System.out.print(this.getSpeed());
		System.out.print(" mph, carrying ");
		System.out.print(this.getCapacity());
		System.out.println(" passengers.");
	}
}
