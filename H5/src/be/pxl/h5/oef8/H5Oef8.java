package be.pxl.h5.oef8;

import java.util.Scanner;

public class H5Oef8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef het resultaat op 20 punten in");
		int resultaat1 = keyboard.nextInt();
		
		System.out.println("Geef het resultaat op 20 punten in");
		int resultaat2 = keyboard.nextInt();
		
		System.out.println("Geef het resultaat op 20 punten in");
		int resultaat3 = keyboard.nextInt();

		double percentage = ((double)resultaat1 +  (double)resultaat2 + (double)resultaat3) / 3 /20 * 100;

		if (percentage < 60) {
			System.out.printf("%1s%25s\n", (int)percentage + "%", "onvoldoende");
		} else {
			if (percentage < 70) {
				System.out.printf("%1s%25s\n", (int)percentage + "%", "voldoende");
			} else {
				if (percentage < 80) {
					System.out.printf("%1s%25s\n", (int)percentage + "%", "onderscheiding");
				} else {
					if (percentage < 90) {
						System.out.printf("%1s%25s\n", (int)percentage + "%", "grote onderscheiding");
					} else {
						System.out.printf("%1s%25s\n", (int)percentage + "%", "grootste onderscheiding");
					}
				}
			}
		}

		keyboard.close();
	}
}