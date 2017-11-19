package be.pxl.h7.exoef8;

import java.util.Scanner;

public class H7ExOef8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		char[] juisteAntwoorden = new char[5];
		char[] deelnemerAntwoorden = new char[5];
		int aantalDeelnemers = 0;
		int deelnemerIngevoerdeTijdInSeconden = 0;
		int[] categorieën = new int[4];
		StringBuilder afdruk = new StringBuilder();

		for (int vraag = 0; vraag < juisteAntwoorden.length; vraag++) {
			System.out.printf("Geef het juiste antwoord van vraag nr. %d in %n", vraag + 1);
			juisteAntwoorden[vraag] = keyboard.nextLine().toUpperCase().charAt(0);
		}


		System.out.println("Geef het deelnemernummer in");
		int deelnemernummer = keyboard.nextInt();

		while (deelnemernummer != 0) {

			keyboard.nextLine();
			
			for (int vraag = 0; vraag < deelnemerAntwoorden.length; vraag++) {
				System.out.printf("Geef het antwoord die de deelnemer %d heeft ingegeven op vraag %d %n", deelnemernummer, vraag + 1);
				deelnemerAntwoorden[vraag] = keyboard.nextLine().toUpperCase().charAt(0);
			}
			
			System.out.printf("Geef de tijd in die de deelnemer %d nodig had om alle vragen op te lossen %n", deelnemernummer);
			deelnemerIngevoerdeTijdInSeconden = keyboard.nextInt();

			int puntenDeelnemer = berekenPuntenDeelnemer(juisteAntwoorden, deelnemerAntwoorden, deelnemerIngevoerdeTijdInSeconden, categorieën);
			String deelnemerTijdInMinutenEnSeconden = berekenDeelnemerTijdInMinutenEnSeconden(deelnemerIngevoerdeTijdInSeconden);
			
			afdruk.append(String.format("%-10s %-10d %9s   %-2d ptn %n", ((aantalDeelnemers + 1) + ".").toString(), deelnemernummer, deelnemerTijdInMinutenEnSeconden, puntenDeelnemer));

			aantalDeelnemers++;
			
			System.out.println("Geef het deelnemernummer in");
			deelnemernummer = keyboard.nextInt();
		}

		System.out.println(afdruk);
		
		for (int categorie = 0; categorie < categorieën.length; categorie++) {
			double percentageCategorie = ((double) categorieën[categorie] / aantalDeelnemers) * 100;
			System.out.printf("Aantal deelnemers categorie %d : %d. Procentueel aandeel categorie %d : %.2f %%. %n", categorie + 1, categorieën[categorie], categorie + 1, percentageCategorie);
		}
		
		keyboard.close();
	}

	public static int berekenPuntenDeelnemer(char[] juisteAntwoorden, char[] deelnemerAntwoorden, int deelnemerIngevoerdeTijdInSeconden, int[] categorieën) {
		int puntenDeelnemer = 10;

		for (int vraag = 0; vraag < juisteAntwoorden.length; vraag++) {
			if (deelnemerAntwoorden[vraag] == juisteAntwoorden[vraag]) {
				puntenDeelnemer += 3;
			} else {
				if (deelnemerAntwoorden[vraag] == 'E') {
					puntenDeelnemer += 0;
				} else {
					puntenDeelnemer -= 1;
				}
			}
		}
		
		if (deelnemerIngevoerdeTijdInSeconden < 100) {
			puntenDeelnemer += 5;
			categorieën[0] += 1;
			
		} else {
			if ((deelnemerIngevoerdeTijdInSeconden >= 100) && (deelnemerIngevoerdeTijdInSeconden < 200)) {
				puntenDeelnemer += 2;
				categorieën[1] += 1;
			} else {
				if ((deelnemerIngevoerdeTijdInSeconden >= 200) && (deelnemerIngevoerdeTijdInSeconden < 300)) {
					puntenDeelnemer += 0;
					categorieën[2] += 1;
				} else {
					puntenDeelnemer -= 5;
					categorieën[3] += 1;
				}
			}
		}

		return puntenDeelnemer;
	}

	public static String berekenDeelnemerTijdInMinutenEnSeconden(int deelnemerIngevoerdeTijdInSeconden) {
		StringBuilder deelnemerTotaleTijdInMinutenEnSeconden = new StringBuilder();
		int deelnemerTotaleTijdInMinuten = deelnemerIngevoerdeTijdInSeconden / 60;
		int deelnemerTotaleTijdInSeconden = deelnemerIngevoerdeTijdInSeconden % 60;
		
		deelnemerTotaleTijdInMinutenEnSeconden.append(String.format("%2d m %2d sec", deelnemerTotaleTijdInMinuten, deelnemerTotaleTijdInSeconden));
		
		return deelnemerTotaleTijdInMinutenEnSeconden.toString();
	}
}