package be.pxl.computersystems.decimaalnaarbinairhexadecimaaloctaal;

import java.util.Random;
import java.util.Scanner;

public class DecimaalNaarBinairHexadecimaalOctaal {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		String ANSI_RESET = "\033[0m";
		String ANSI_RED = "\033[1;31m";
		String ANSI_GREEN = "\033[1;32m";

		int willekeurigGetal = rand.nextInt(256);
		
		System.out.println("Het binair getal voor " + willekeurigGetal + " is : ");
		String binairGetal = keyboard.nextLine();
		
		int binairNaarDecimaalGetal = Integer.parseInt(binairGetal, 2);
		String binairOplossing = Integer.toBinaryString(willekeurigGetal);
		
		if (binairNaarDecimaalGetal == willekeurigGetal) {
			System.out.println(ANSI_GREEN + "Correct" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + String.format("Fout, de oplossing moest %s zijn", binairOplossing) + ANSI_RESET);
		}
		
		System.out.println("Het hexadecimaal getal voor " + willekeurigGetal + " is : ");
		String hexadecimaalGetal = keyboard.nextLine();
		
		int hexadecimaalNaarDecimaalGetal = Integer.parseInt(hexadecimaalGetal, 16);
		String hexadecimaalOplossing = Integer.toHexString(willekeurigGetal);
		
		if (hexadecimaalNaarDecimaalGetal == willekeurigGetal) {
			System.out.println(ANSI_GREEN + "Correct" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + String.format("Fout, de oplossing moest %s zijn", hexadecimaalOplossing) + ANSI_RESET);
		}
		
		System.out.println("Het octaal getal voor " + willekeurigGetal + " is : ");
		String octaalGetal = keyboard.nextLine();
		
		int octaalNaarDecimaalGetal = Integer.parseInt(octaalGetal, 8);
		String octaalOplossing = Integer.toOctalString(willekeurigGetal);
		
		if (octaalNaarDecimaalGetal == willekeurigGetal) {
			System.out.println(ANSI_GREEN + "Correct" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + String.format("Fout, de oplossing moest %s zijn", octaalOplossing) + ANSI_RESET);
		}
		
		keyboard.close();
	}
}