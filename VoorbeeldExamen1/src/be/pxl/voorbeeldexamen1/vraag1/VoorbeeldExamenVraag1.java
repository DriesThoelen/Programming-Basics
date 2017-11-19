package be.pxl.voorbeeldexamen1.vraag1;

import java.util.Scanner;

public class VoorbeeldExamenVraag1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int temperatuur;
		int somTemperatuur = 0;
		int aantalDagen = 1;
		double gemiddeldeTemperatuur;
		int laagsteTemperatuur = Integer.MAX_VALUE;
		StringBuilder neerslagBuilder = new StringBuilder();
		StringBuilder afdruk = new StringBuilder();
		String weervoorspelling = null;

		System.out.println("Geef regen in");
		String neerslag = keyboard.nextLine();

		neerslagBuilder.append(String.format("%s ", neerslag));
		
		while ((aantalDagen <= 7) && (!(neerslag.equalsIgnoreCase("overvloed")))) {			
			System.out.println("Geef temperatuur in");
			temperatuur = keyboard.nextInt();

			if (temperatuur < laagsteTemperatuur) {
				laagsteTemperatuur = temperatuur;
			}

			somTemperatuur += temperatuur;

			afdruk.append(String.format("%3d \t %11d \t    %8s %n", aantalDagen, temperatuur, neerslag));

			aantalDagen++;

			keyboard.nextLine();
			
			if (aantalDagen <= 7) {
				System.out.println("Geef regen in");
				neerslag = keyboard.nextLine();

				neerslagBuilder.append(String.format("%s ", neerslag));
			}
		} 

		gemiddeldeTemperatuur = somTemperatuur / aantalDagen;

		if (neerslagBuilder.indexOf("overvloed") == -1) {
			if (laagsteTemperatuur >= 15) {
				if (laagsteTemperatuur > gemiddeldeTemperatuur * 0.20) {
					if (neerslagBuilder.indexOf("veel") == -1) {
						weervoorspelling = "we gaan op tweedaagse";
					} else {
						weervoorspelling = "we gaan op daguitstap";
					}
				} else {
					weervoorspelling = "we gaan op daguitstap";
				}
			} else {
				weervoorspelling = "we gaan op daguitstap";
			}
		} else {
			weervoorspelling = "we blijven thuis";
		}
		
		System.out.printf("%3s \t %11s \t    %8s %n", "dag", "temperatuur", "neerslag");
		System.out.print(afdruk);
		System.out.println(weervoorspelling);

		keyboard.close();
	}
}