package be.pxl.h6.exoef3;

import java.util.Random;
import java.util.Scanner;

public class H6ExOef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		StringBuilder geencrypteerdeTekst = new StringBuilder();
		
		System.out.println("Geef een tekst in");
		String tekst = keyboard.nextLine();
		
		int encryptiegetal = (rand.nextInt(11) + 1) * 2;
		
		geencrypteerdeTekst.setLength(tekst.length());
		
		for(int count = 0; count < tekst.length(); count++) {
			geencrypteerdeTekst.setCharAt(count, (char)(tekst.charAt(count) + encryptiegetal));
		}
		
		System.out.println(geencrypteerdeTekst);
		
		keyboard.close();

	}
}