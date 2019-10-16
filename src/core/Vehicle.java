package core;

public abstract class Vehicle {
	private int numWheels;
	private double speed;
	private double maxSpeed;
	private boolean state;
	final private String id;
	
	public Vehicle(String s, int n, double maxS) {
		this.id = s;
		this.numWheels = n;
		this.maxSpeed = maxS;
		this.state = false;
	}
	
	public String getId() {
		return this.id;
	}
	
	public int getNumWheels() {
		return this.numWheels;
	}
	public void setNumWheels(int n) {
		this.numWheels = n;
	}
	
	public boolean isRunning() {
		return this.state;
	}
	
	public boolean turnOn() {
		if(this.state == false) {
			this.state = true;
			return true;
		}
		System.out.println("Vehicle is already running.");
		return false;
	}
	public boolean turnOff() {
		if(this.state == true) {
			this.state = false;
			return true;
		}
		System.out.println("Vehicle is not running.");
		return false;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	public boolean setSpeed(double s) {
		if(s <= this.maxSpeed) {
			this.speed = s;
			return true;
		}
		return false;
	}
	
	public double getMaxSpeed() {
		return this.maxSpeed;
	}
	public void setMaxSpeed(double n) {
		this.maxSpeed = n;
	}
	
	public void honk() {
		System.out.println("Make way");
	}
	
	abstract public int getCapacity();
}
 
