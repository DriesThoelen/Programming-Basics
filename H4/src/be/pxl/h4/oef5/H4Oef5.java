package be.pxl.h4.oef5;

import java.util.Scanner;

public class H4Oef5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Gewicht appel?");
		int gewicht = keyboard.nextInt();

		System.out.printf("%15s%20s\n", "aantal appels", "gewicht in gram");

		// for (int appel = 1; appel < 101; appel++) {
		// int totaalgewicht = appel * gewicht;
		// System.out.printf("%10s%20s\n", appel, totaalgewicht);
		// System.out.println("        " + appel + "                  " + totaalgewicht);
		// System.out.println("\t" + appel + "\t" + totaalgewicht);		
		// }

		int appel = 1;
		while (appel < 101) {
			int totaalgewicht = appel * gewicht;
			// System.out.printf("%10s%20s\n", appel, totaalgewicht);
			// System.out.println("        " + appel + "                  " + totaalgewicht);
			System.out.println("\t" + appel + "\t" + totaalgewicht);
			appel++;
		}

		keyboard.close();
	}
}