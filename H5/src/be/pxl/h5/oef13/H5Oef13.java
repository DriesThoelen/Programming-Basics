package be.pxl.h5.oef13;

import java.util.Scanner;

public class H5Oef13 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef een getal in tussen 1 en 100");
		int getal = keyboard.nextInt();

		while ((getal <= 1) || (getal >= 100)) {
			if (getal < 1) {
				System.out.println("Fout! Het getal moet groter zijn dan 1");
			} else {
				System.out.println("Fout! Het getal moet kleiner zijn dan 100");
			}

			System.out.println("Geef een getal in tussen 1 en 100");
			getal = keyboard.nextInt();
		}

		System.out.println(getal);
		keyboard.close();
	}
}