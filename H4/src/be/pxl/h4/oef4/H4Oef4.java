package be.pxl.h4.oef4;

import java.util.Calendar;
import java.util.Scanner;

public class H4Oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Calendar date = Calendar.getInstance();

		System.out.println("releasejaar van de film?");
		int releasejaar = keyboard.nextInt();
		
		int huidigJaar = date.get(Calendar.YEAR);

		int leeftijdfilm = (huidigJaar - releasejaar);

		System.out.println("rating van de film?");
		int rating = keyboard.nextInt();

		int basisprijs;

		basisprijs = 5;

		int tebetalenprijs;

		tebetalenprijs = basisprijs;

		if (leeftijdfilm < 2) {
			tebetalenprijs = basisprijs + 1;
		}
		if (rating > 3) {
			tebetalenprijs = basisprijs + 2;

		} else {
			if (rating > 2) {
				tebetalenprijs = basisprijs + 1;
			}
		}

		if (tebetalenprijs > 7) {
			tebetalenprijs = 7;
		}

		System.out.println("prijs van de film : " + tebetalenprijs);
		keyboard.close();
	}
}