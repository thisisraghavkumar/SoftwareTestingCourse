package core;

public class Management {

	public static void main(String[] args) {
		Car c = new Car("DL4050", 4, 60);
		Truck t = new Truck("HR1005", 12, 40, 100);
		Vehicle v;
		v = c;
		v.setSpeed(10);
		c.honk();
		t.honk();
		v.setSpeed(100);
		v.honk();
	}

}
