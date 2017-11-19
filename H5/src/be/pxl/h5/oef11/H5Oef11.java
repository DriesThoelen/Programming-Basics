package be.pxl.h5.oef11;

import java.util.Scanner;

public class H5Oef11 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int getal;
		int som = 0;
		int negatiefGetal = 0;
		
		System.out.println("Geef een getal verschillend van 0 in (geef 0 in om te stoppen)");
		getal = keyboard.nextInt();
		
		while (getal != 0) {
			som = som + getal;
			System.out.println(som);

			if (getal < 0) {
				negatiefGetal++;
			}

			System.out.println("Geef een getal verschillend van 0 in (geef 0 in om te stoppen)");
			getal = keyboard.nextInt();
		}

		System.out.println("aantal strikt negatieve getallen : " + negatiefGetal);
		keyboard.close();
	}
}