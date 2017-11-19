package be.pxl.h6.oef5;

public class H6Oef5Klassikaal {

	public static void main(String[] args) {
		System.out.printf("%20s %-20s %20s %20s %n", "1. gewoon", "2. links", "3. rechts (met nul)", "4. rechts met 3 dec");
		double getal = 0;
		
		System.out.println();
		for (int i = 1; i <= 9; ++i) {
			getal += i;
			System.out.printf("%20f %-20f %020f %20.3f %n", getal, getal, getal, getal);
			getal *= 10;
		}
		
		System.out.printf("%n %50s %n %n", "uitbreiding");
		
		System.out.printf("%20s %-20s %20s %20s %n", "1. gewoon", "2. links", "3. rechts (met nul)", "4. rechts met 3 dec");
		
		getal = 0;
		double dec = 0;
		
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				getal *= 10;
				getal += i;
			} else {
				dec = i;
				for (int j = 6; j <= i; j++) {
					dec /= 10;
				}
				getal += dec;
			}
			System.out.printf("%20f %-20f %020f %20.3f %n", getal, getal, getal, getal);
		}
	}
}