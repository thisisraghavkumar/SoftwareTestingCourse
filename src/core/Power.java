package core;

public class Power {
	public static double pow(int a, int b) {
		double res = 1;
		for(int i=0;i<b;i++) {
			res = res*a;
		}
		return res;
	}
}
