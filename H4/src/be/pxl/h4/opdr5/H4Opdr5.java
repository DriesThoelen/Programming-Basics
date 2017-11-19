package be.pxl.h4.opdr5;

import java.util.Scanner;

public class H4Opdr5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een getal in; om te stoppen : geef een getal kleiner of gelijk aan 100");
		int getal = keyboard.nextInt();
	
		while (getal > 100) {
			int driedubbelgetal;
			driedubbelgetal = getal * 3;
			System.out.printf("%1s%10s\n", getal, driedubbelgetal);
			System.out.println("Geef een getal in; om te stoppen : geef een getal kleiner of gelijk aan 100");
			getal = keyboard.nextInt();
			}
		keyboard.close();
		}
}