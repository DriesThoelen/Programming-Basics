package be.pxl.h6.oef5;

public class H6Oef5 {

	public static void main(String[] args) {
		double getal = 123456789;
		int deler = 100000000;
		
		System.out.printf("%20s %-20s %20s %20s %n", "1. gewoon", "2. links", "3. rechts (met nul)", "4. rechts met 3 dec");
		for(int count = 1; count <= 9; count++) {
			double afdrukgetal = (int)getal / deler;
			System.out.printf("%20.6f %-20.6f %020.6f %20.3f %n", afdrukgetal, afdrukgetal, afdrukgetal, afdrukgetal);
			deler = deler / 10;
		}
		
		getal = 123456789;
		deler = 100000000;
		double delerNaGetalZes = 10;
		
		System.out.printf("%n %50s %n %n", "uitbreiding");
		
		System.out.printf("%20s %-20s %20s %20s %n", "1. gewoon", "2. links", "3. rechts (met nul)", "4. rechts met 3 dec");
		for(int count = 1; count <= 9; count++) {
			double afdrukgetal = (int)getal / deler;
			if (count > 5) {
				afdrukgetal = afdrukgetal / delerNaGetalZes;
				delerNaGetalZes *= 10;
			}
			System.out.printf("%20.6f %-20.6f %020.6f %20.3f %n", afdrukgetal, afdrukgetal, afdrukgetal, afdrukgetal);
			deler = deler / 10;
		}
	}
}