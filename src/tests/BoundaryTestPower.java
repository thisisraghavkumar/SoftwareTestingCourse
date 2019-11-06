package tests;

import core.Power;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoundaryTestPower {

	private int a;
	private int b;
	
	@Test
	public void bvc() throws Exception{
		b=5;
		a=1;
		assertEquals(Power.calc(a, b), 1, 0);
		a=2;
		assertEquals(Power.calc(a, b), 32, 0);
		a=10;
		assertEquals(Power.calc(a, b), 100000, 0);
		a=9;
		assertEquals(Power.calc(a, b), 59049, 0);
		a=5;
		assertEquals(Power.calc(a, b), 3125, 0);
		b=1;
		assertEquals(Power.calc(a, b), 5, 0);
		b=2;
		assertEquals(Power.calc(a, b), 25, 0);
		b=10;
		assertEquals(Power.calc(a, b), 9765625, 0);
		b=9;
		assertEquals(Power.calc(a, b), 1953125, 0);
	}
	
	@Test(expected=Exception.class)
	public void robust_a_min_minus() throws Exception {
		b=5;
		a=0;
		Power.calc(a, b);
	}
	
	@Test(expected=Exception.class)
	public void robust_a_max_plus() throws Exception {
		b=5;
		a=11;
		Power.calc(a, b);
	}
	
	@Test(expected=Exception.class)
	public void robust_b_min_minus() throws Exception {
		b=0;
		a=5;
		Power.calc(a, b);
	}
	
	@Test(expected=Exception.class)
	public void robust_b_max_plus() throws Exception {
		b=11;
		a=5;
		Power.calc(a, b);
	}
	
	@Test
	public void worstCase() throws Exception{
		a=1;
		b=5;
		assertEquals(Power.calc(a, b), 1, 0);
		b=1;
		assertEquals(Power.calc(a, b), 1, 0);
		b=2;
		assertEquals(Power.calc(a, b), 1, 0);
		b=10;
		assertEquals(Power.calc(a, b), 1, 0);
		b=9;
		assertEquals(Power.calc(a, b), 1, 0);
		
		a=2;
		b=5;
		assertEquals(Power.calc(a, b), 32, 0);
		b=1;
		assertEquals(Power.calc(a, b), 2, 0);
		b=2;
		assertEquals(Power.calc(a, b), 4, 0);
		b=10;
		assertEquals(Power.calc(a, b), 1024, 0);
		b=9;
		assertEquals(Power.calc(a, b), 512, 0);
		
		a=10;
		b=5;
		assertEquals(Power.calc(a, b), 100000, 0);
		b=1;
		assertEquals(Power.calc(a, b), 10, 0);
		b=2;
		assertEquals(Power.calc(a, b), 100, 0);
		b=10;
		assertEquals(Power.calc(a, b), 10000000000d, 0);
		b=9;
		assertEquals(Power.calc(a, b), 1000000000d, 0);
		
		a=9;
		b=5;
		assertEquals(Power.calc(a, b), 59049, 0);
		b=1;
		assertEquals(Power.calc(a, b), 9, 0);
		b=2;
		assertEquals(Power.calc(a, b), 81, 0);
		b=10;
		assertEquals(Power.calc(a, b), 3486784401d, 0);
		b=9;
		assertEquals(Power.calc(a, b), 387420489d, 0);
		
		a=5;
		b=5;
		assertEquals(Power.calc(a, b), 3125, 0);
		b=1;
		assertEquals(Power.calc(a, b), 5, 0);
		b=2;
		assertEquals(Power.calc(a, b), 25, 0);
		b=10;
		assertEquals(Power.calc(a, b), 9765625, 0);
		b=9;
		assertEquals(Power.calc(a, b), 1953125, 0);
		
	}
}
