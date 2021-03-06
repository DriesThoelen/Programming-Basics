package be.pxl.computersystems.binairnaarfloatgetallen;

import java.util.Random;
import java.util.Scanner;

public class BiniarNaarFloatGetallen {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		String ANSI_RESET = "\033[0m";
		String ANSI_RED = "\033[1;31m";
		String ANSI_GREEN = "\033[1;32m";

		int willekeurigGeheelGetal = rand.nextInt(256);
		float willekeurigKommaGetal = rand.nextFloat();
		float willekeurigGetal = willekeurigGeheelGetal + willekeurigKommaGetal;

		String binairWillekeurigGetal = GetBinary32(willekeurigGetal);
		
		System.out.println("Het binair getal voor " + binairWillekeurigGetal + " is : ");
		Float binairNaarFloatGetal = keyboard.nextFloat();

		float binairOplossing = GetFloat32(binairWillekeurigGetal);

		if (binairNaarFloatGetal == binairOplossing) {
			System.out.println(ANSI_GREEN + "Correct" + ANSI_RESET);
		} else {
			System.out.println(
					ANSI_RED + String.format("Fout, de oplossing moest %s zijn", binairOplossing) + ANSI_RESET);
		}

		keyboard.close();
	}

	private static float GetFloat32(String Binary) {
		int intBits = Integer.parseInt(Binary, 2);
		float myFloat = Float.intBitsToFloat(intBits);
		return myFloat;
	}

	private static String GetBinary32(float value) {
		int intBits = Float.floatToIntBits(value);
		String binary = Integer.toBinaryString(intBits);
		return binary;
	}
}
