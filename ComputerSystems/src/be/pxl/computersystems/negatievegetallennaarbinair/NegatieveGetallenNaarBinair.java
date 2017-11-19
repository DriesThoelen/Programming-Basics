package be.pxl.computersystems.negatievegetallennaarbinair;

import java.util.Random;
import java.util.Scanner;

public class NegatieveGetallenNaarBinair {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		String ANSI_RESET = "\033[0m";
		String ANSI_RED = "\033[1;31m";
		String ANSI_GREEN = "\033[1;32m";

		int willekeurigGetal = rand.nextInt(256);
		int willekeurigNegatiefGetal = willekeurigGetal - 2 * willekeurigGetal;
		
		System.out.println("Het binair getal (2-component) voor " + willekeurigNegatiefGetal + " is : ");
		String binairGetal = keyboard.nextLine();
		
		String binairOplossing = Integer.toBinaryString(willekeurigNegatiefGetal);
		if (willekeurigGetal < 128) {
			binairOplossing = binairOplossing.replace("111111111111111111111111", "");
		} else {
			binairOplossing = binairOplossing.replace("11111111111111111111111", "");
		}
		
		if (binairGetal.equals(binairOplossing)) {
			System.out.println(ANSI_GREEN + "Correct" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + String.format("Fout, de oplossing moest %s zijn", binairOplossing) + ANSI_RESET);
		}
		
		keyboard.close();
	}
}