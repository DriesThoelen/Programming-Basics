package be.pxl.h5.oef4;

import java.util.Scanner;

public class H5Oef4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een hoeveelheid seconden in");
		int ingevoerdeSeconden = keyboard.nextInt();

		int aantalMinuten = ingevoerdeSeconden / 60;
		int aantalSeconden = ingevoerdeSeconden % 60;
		int aantalUren = aantalMinuten / 60;
		aantalMinuten -= (aantalUren * 60);

		System.out.println(aantalUren + " uren " + aantalMinuten + " minuten " + aantalSeconden + " seconden");

		keyboard.close();
	}
}