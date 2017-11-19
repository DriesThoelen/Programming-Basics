package be.pxl.h5.exoef15;

import java.util.Scanner;

public class H5ExOef15 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int vermenigvuldiger;
		int maximumWaardeVermenigvuldigtal;
		int uitkomst;

		for (int count1 = 1; count1 < 6; count1++) {
			System.out.println("Geef de vermenigvuldiger in");
			vermenigvuldiger = keyboard.nextInt();
			System.out.println("Geef de maximum waarde van het vermenigvuldigtal in");
			maximumWaardeVermenigvuldigtal = keyboard.nextInt();

			System.out.println("Oefening " + count1);
			for (int count2 = 0; count2 <= maximumWaardeVermenigvuldigtal; count2++) {
				uitkomst = count2 * vermenigvuldiger;
				System.out.println(count2 + "x" + vermenigvuldiger + " = " + uitkomst);
			}
		}

		keyboard.close();
	}
}