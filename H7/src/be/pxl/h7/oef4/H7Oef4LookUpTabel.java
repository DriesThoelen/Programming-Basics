package be.pxl.h7.oef4;

import java.util.Scanner;

public class H7Oef4LookUpTabel {

	public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);

			String[] kandidaten = { null, "An Janssen", "Bart Vriends", "Andries Michels", "Inge Kaas" };
			
			int aantalStemmen = 0;
			int[] stemmen = new int[kandidaten.length];
			double[] percentagesAandeelStemmen = new double[kandidaten.length];

			System.out.println("Geef je stem in voor student van het jaar (1 = An Janssen, 2 = Bart Vriends, 3 = Andries Michels, 4 = Inge Kaas)");
			int stem = keyboard.nextInt();
			
			while (stem != 0) {

				stemmen[stem] = stemmen[stem] + 1;
						
				aantalStemmen++;
				
				System.out.println("Geef je stem in voor student van het jaar (1 = An Janssen, 2 = Bart Vriends, 3 = Andries Michels, 4 = Inge Kaas)");
				stem = keyboard.nextInt();
			}

			for (int kandidaat = 1; kandidaat < stemmen.length; kandidaat++) {
				percentagesAandeelStemmen[kandidaat] = ((double) stemmen[kandidaat] / aantalStemmen) * 100;
				System.out.printf("%s, %d %s, %.1f %s %n", kandidaten[kandidaat], stemmen[kandidaat], "stem(men)", percentagesAandeelStemmen[kandidaat], "% van het totaal aantal stemmen");
			}

			keyboard.close();
		}
}