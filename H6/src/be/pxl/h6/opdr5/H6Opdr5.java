package be.pxl.h6.opdr5;

public class H6Opdr5 {

	public static void main(String[] args) {
		for(double meter = 1; meter <= 20; meter = meter + 0.5) {
			double voet = meter * 3.2808399;
			System.out.printf("%4.0f meter = %4.2f voet %n", meter, voet);
		}
	}
}