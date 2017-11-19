package be.pxl.computersystems.binairhexadecimaaloctaalnaardecimaal;

import java.util.Random;
import java.util.Scanner;

public class BinairHexadecimaalOctaalNaarDecimaal {

		public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			Random rand = new Random();
			
			String ANSI_RESET = "\033[0m";
			String ANSI_RED = "\033[1;31m";
			String ANSI_GREEN = "\033[1;32m";

			int willekeurigGetal = rand.nextInt(256);
			
			String binairWillekeurigGetal = Integer.toBinaryString(willekeurigGetal);
			
			System.out.println("Het decimaal getal voor " + binairWillekeurigGetal + " (binair) is : ");
			int binairNaarDecimaalGetal = keyboard.nextInt();
			
			int binairOplossing = Integer.parseInt(binairWillekeurigGetal, 2);
			
			if (binairNaarDecimaalGetal == binairOplossing) {
				System.out.println(ANSI_GREEN + "Correct" + ANSI_RESET);
			} else {
				System.out.println(ANSI_RED + String.format("Fout, de oplossing moest %d zijn", binairOplossing) + ANSI_RESET);
			}
			
			willekeurigGetal = rand.nextInt(256);
			
			String hexadecimaalWillekeurigGetal = Integer.toHexString(willekeurigGetal);
			
			System.out.println("Het decimaal getal voor " + hexadecimaalWillekeurigGetal + " (hexadecimaal) is : ");
			int hexadecimaalNaarDecimaalGetal = keyboard.nextInt();
			
			int hexadecimaalOplossing = Integer.parseInt(hexadecimaalWillekeurigGetal, 16);
			
			if (hexadecimaalNaarDecimaalGetal == hexadecimaalOplossing) {
				System.out.println(ANSI_GREEN + "Correct" + ANSI_RESET);
			} else {
				System.out.println(ANSI_RED + String.format("Fout, de oplossing moest %d zijn", hexadecimaalOplossing) + ANSI_RESET);
			}
			
			willekeurigGetal = rand.nextInt(256);
			
			String octaalWillekeurigGetal = Integer.toOctalString(willekeurigGetal);
			
			System.out.println("Het decimaal getal voor " + octaalWillekeurigGetal + " (octaal) is : ");
			int octaalNaarDecimaalGetal = keyboard.nextInt();
			
			int octaalOplossing = Integer.parseInt(octaalWillekeurigGetal, 8);
			
			if (octaalNaarDecimaalGetal == octaalOplossing) {
				System.out.println(ANSI_GREEN + "Correct" + ANSI_RESET);
			} else {
				System.out.println(ANSI_RED + String.format("Fout, de oplossing moest %d zijn", octaalOplossing) + ANSI_RESET);
			}
			
			keyboard.close();
		}
	}
