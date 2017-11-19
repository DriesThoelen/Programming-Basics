package be.pxl.h5.oef15;

import java.util.Scanner;

public class H5Oef15 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int temperatuur;
		int totaalTemperatuur = 0;
		int hoogsteTemperatuur = Integer.MIN_VALUE;
		int gemiddeldeTemperatuur;

		for (int dag = 1; dag <= 10; dag++) {
			System.out.println("Geef de temperatuur germeten om 12u 's middags op dag " + dag);
			temperatuur = keyboard.nextInt();

			if (temperatuur > hoogsteTemperatuur) {
				hoogsteTemperatuur = temperatuur;
			}

			totaalTemperatuur += temperatuur;
		}

		gemiddeldeTemperatuur = totaalTemperatuur / 10;
		System.out.println("hoogste temperatuur : " + hoogsteTemperatuur + " °C");
		System.out.println("gemiddelde temperatuur: " + gemiddeldeTemperatuur + " °C");
		
		keyboard.close();
	}
}