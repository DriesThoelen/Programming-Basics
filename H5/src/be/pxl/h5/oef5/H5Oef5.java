package be.pxl.h5.oef5;

import java.util.Scanner;

public class H5Oef5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een geldbedrag in euro's in (geen eurocenten)");
		int geldBedrag = keyboard.nextInt();

		int aantalBriefjesVan20 = geldBedrag / 20;
		int restBedrag = geldBedrag % 20;

		System.out.println("Aantal briefjes van 20 : " + aantalBriefjesVan20);
		System.out.println("Restbedrag : " + "€ " + restBedrag);

		keyboard.close();
	}
}