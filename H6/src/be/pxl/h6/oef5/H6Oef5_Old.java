package be.pxl.h6.oef5;

public class H6Oef5_Old {

	public static void main(String[] args) {
		
		double getal = 123456789;
		int deler = 100000000;
		
		System.out.printf("%20s\n", "1. gewoon");
		
		for(int count = 0; count < 9; count++) {
			double afdrukgetal = (int)getal / deler;
			System.out.printf("%20.6f\n", afdrukgetal);
			deler = deler / 10;
		}
		
		System.out.println();
		System.out.printf("%-20s\n", "2. links");
		
		getal = 123456789;
		deler = 100000000;
		
		for(int count = 0; count < 9; count++) {
			double afdrukgetal = (int)getal / deler;
			System.out.printf("%-20.6f\n", afdrukgetal);
			deler = deler / 10;
		}
		
		System.out.println();
		System.out.printf("%20s\n", "3. rechts (met nul)");
		
		getal = 123456789;
		deler = 100000000;
		
		for(int count = 0; count < 9; count++) {
			double afdrukgetal = (int)getal / deler;
			System.out.printf("%020.6f\n", afdrukgetal);
			deler = deler / 10;
		}
		
		System.out.println();
		System.out.printf("%20s\n", "4. rechts met 3 dec");
		
		
		getal = 123456789;
		deler = 100000000;
		
		for(int count = 0; count < 9; count++) {
			double afdrukgetal = (int)getal / deler;
			System.out.printf("%20.3f\n", afdrukgetal);
			deler = deler / 10;
		}
		
		System.out.println();
		System.out.printf("%20s\n", "5. gewoon (6de cijfer na komma)");
		
		getal = 123456789;
		deler = 100000000;
		int delerNaGetalZes = 10;
		
		for(int count = 0; count < 9; count++) {
			double afdrukgetal = (int)getal / deler;
			if (count > 4) {
				afdrukgetal = afdrukgetal / delerNaGetalZes;
				delerNaGetalZes *= 10;
			}
			System.out.printf("%20.6f\n", afdrukgetal);
			deler = deler / 10;
		}
		
		System.out.println();
		System.out.printf("%-20s\n", "6. links (6de cijfer na komma)");
		
		getal = 123456789;
		deler = 100000000;
		delerNaGetalZes = 10;
		
		for(int count = 0; count < 9; count++) {
			double afdrukgetal = (int)getal / deler;
			if (count > 4) {
				afdrukgetal = afdrukgetal / delerNaGetalZes;
				delerNaGetalZes *= 10;
			}
			System.out.printf("%-20.6f\n", afdrukgetal);
			deler = deler / 10;
		}
		
		System.out.println();
		System.out.printf("%20s\n", "7. rechts (met nul) (6de cijfer na komma)");
		
		getal = 123456789;
		deler = 100000000;
		delerNaGetalZes = 10;
		
		for(int count = 0; count < 9; count++) {
			double afdrukgetal = (int)getal / deler;
			if (count > 4) {
				afdrukgetal = afdrukgetal / delerNaGetalZes;
				delerNaGetalZes *= 10;
			}
			System.out.printf("%020.6f\n", afdrukgetal);
			deler = deler / 10;
		}
		
		System.out.println();
		System.out.printf("%20s\n", "8. rechts met 3 dec (6de cijfer na komma)");
		
		getal = 123456789;
		deler = 100000000;
		delerNaGetalZes = 10;
		
		for(int count = 0; count < 9; count++) {
			double afdrukgetal = (int)getal / deler;
			if (count > 4) {
				afdrukgetal = afdrukgetal / delerNaGetalZes;
				delerNaGetalZes *= 10;
			}
			System.out.printf("%20.3f\n", afdrukgetal);
			deler = deler / 10;
		}
	}
}