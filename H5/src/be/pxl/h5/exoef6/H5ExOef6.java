package be.pxl.h5.exoef6;

import java.util.Scanner;

public class H5ExOef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef het gewicht van de brief in gram");
		int gewicht = keyboard.nextInt();
		double prijs;
		
		if (gewicht <= 20) {
			prijs = 0.3;
		} else {
			if (gewicht <= 50) {
				prijs = 0.5;
			} else {
				if (gewicht <= 150) {
					prijs = 0.7;
				} else {
					if (gewicht <= 250) {
						prijs = 1.0;
					} else {
						prijs = 1.9;
					}
				}
			}
		}
		System.out.println("Vereiste frankering : " + "€ " + prijs);
		
		keyboard.close();
	}
}