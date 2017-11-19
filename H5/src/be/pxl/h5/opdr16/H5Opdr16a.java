package be.pxl.h5.opdr16;

import java.util.Scanner;

public class H5Opdr16a {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef de vermenigvuldiger");
		int vermenigvuldiger = keyboard.nextInt();

		System.out.println("Tot welk getal moet de tafel afgedrukt worden?");
		int limiet = keyboard.nextInt();

		toonTafel(vermenigvuldiger, limiet);

		keyboard.close();

	}

	public static void toonTafel(int vermenigvuldiger, int limiet) {
			for(int count = 1; count <= limiet; count++) {
				int vermenigvuldiging;
				vermenigvuldiging = count * vermenigvuldiger;
				System.out.println(count + " x " + vermenigvuldiger + " = " + vermenigvuldiging);
			}
		}
}