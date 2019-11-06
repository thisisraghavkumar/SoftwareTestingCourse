package core;

import java.lang.Exception;

public class Power {
	/**
	 Params = integer a and b, where
	 1<= a <=10
	 1<= b <=10
	 Returns = a raised to power b 
	 * @throws Exception 
	 */
	public static double calc(int a, int b) throws Exception {
		if(a<=0 || a>10)
				throw new Exception("a is out of bounds");
		if(b<=0 || b>10)
				throw new Exception("b is out of bounds");
		double res = 1.0;
		for(int i=0;i<b;i++) {
			res = res*a;
		}
		return res;
	}
}
