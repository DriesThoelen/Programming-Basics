package be.pxl.h6.exoef1;

import java.util.Random;
import java.util.Scanner;

public class H6ExOef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		int willekeurigGetal = rand.nextInt(10) + 1;
		int kansen = 4;

		System.out.println("Raad het getal. Nog " + kansen + " kansen over om juist te raden.");
		int ingevoerdGetal = keyboard.nextInt();
		
		while ((ingevoerdGetal != willekeurigGetal) && (kansen > 1)) {
			if (ingevoerdGetal < willekeurigGetal) {
				System.out.println("hoger");
				kansen--;
			} else {
					System.out.println("lager");
					kansen--;
			}
			
			System.out.println("Raad het getal. Nog " + kansen + " kansen over om juist te raden.");
			ingevoerdGetal = keyboard.nextInt();
		}
		
		if (ingevoerdGetal == willekeurigGetal) {
			System.out.println("proficiat, getal geraden");
		} else {
			System.out.println("helaas, het getal was " + willekeurigGetal);
		}

		keyboard.close();
	}
}
