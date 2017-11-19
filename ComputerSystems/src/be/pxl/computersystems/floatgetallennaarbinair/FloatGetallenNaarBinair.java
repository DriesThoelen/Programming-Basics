package be.pxl.computersystems.floatgetallennaarbinair;

import java.util.Random;
import java.util.Scanner;

public class FloatGetallenNaarBinair {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		String ANSI_RESET = "\033[0m";
		String ANSI_RED = "\033[1;31m";
		String ANSI_GREEN = "\033[1;32m";

		int willekeurigGeheelGetal = rand.nextInt(256);
		float willekeurigKommaGetal = rand.nextFloat();
		float willekeurigGetal = willekeurigGeheelGetal + willekeurigKommaGetal;

		System.out.println("Het binair getal voor " + willekeurigGetal + " is : ");
		String binairGetal = keyboard.nextLine();

		String binairOplossing = GetBinary32(willekeurigGetal);

		float binairNaarFloatGetal = GetFloat32(binairGetal);
		
		if (binairNaarFloatGetal == willekeurigGetal) {
			System.out.println(ANSI_GREEN + "Correct" + ANSI_RESET);
		} else {
			System.out.println(ANSI_RED + String.format("Fout, de oplossing moest %s zijn", binairOplossing) + ANSI_RESET);
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
