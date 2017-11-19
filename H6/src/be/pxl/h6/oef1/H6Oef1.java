package be.pxl.h6.oef1;

import java.util.Random;

public class H6Oef1 {

	public static void main(String[] args) {

		Random rand = new Random();

		for (char reeksnummer = 'A'; reeksnummer <= 'F'; reeksnummer++) {
			System.out.println("reeks " + reeksnummer);
			for (int count = 1; count <= 5; count++) {
				int getal1 = rand.nextInt(20 - 0 + 1);
				int getal2 = rand.nextInt(getal1 + 1);
				
//				int getal2 = rand.nextInt(20 - 0 + 1);
//
//				if (getal1 < getal2) {
//					System.out.println(count + ")" + "  " + getal2 + " - " + getal1 + " = ");
//				} else {
//					System.out.println(count + ")" + "  " + getal1 + " - " + getal2 + " = ");
//				}
				
				System.out.println(count + ")" + "  " + getal1 + " - " + getal2 + " = ");
			}
			System.out.println();
		}
	}
}