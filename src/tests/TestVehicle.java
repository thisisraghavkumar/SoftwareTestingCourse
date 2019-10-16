package tests;

import core.Vehicle;
import core.Car;
import core.Truck;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestVehicle {
	private Vehicle v1 = new Car("DL50",6,120);
	private Vehicle v2 = new Truck("HR11",12,100,10);
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	// executed such that system output responses can be tested
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}
	
	// executed such that system output responses can be tested
	@After
	public void restoreStreams() {
		System.setOut(originalOut);
	}
	
	//test to check setting speed for car
	@Test
	public void TestSetSpeed() {
		assertTrue(v1.setSpeed(70));
		assertEquals("Speed of car is not set to 70.",v1.getSpeed(),70.0, 0);
		assertFalse(v2.setSpeed(150));
		assertEquals("Speed of truck is changed from 0.",v2.getSpeed(), 0, 0);
	}
	
	//test to check the honk function
	@Test
	public void TestHonk() {
		assertTrue(v1.setSpeed(25));
		String carMessage = "Make way for car DL50, running at 25.0 mph, carrying 6 passengers.";
		assertTrue(v2.setSpeed(40));
		String truckMessage = carMessage+"\nMake way for truck HR11, running at 40.0 mph, carrying 10 quintals of cargo.";
		v1.honk();
		assertEquals("Honk message is incorrect for car v1.", carMessage, outContent.toString().strip());
		v2.honk();
		assertEquals("Honk message is incorrect for truck v2.", truckMessage, outContent.toString().strip());
	}
}
