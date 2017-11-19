package be.pxl.testexamen.opgave5;

import java.util.Scanner;

public class TestExamenOpgave5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef de grootte van de tabel");
		int grootte = keyboard.nextInt();
		
		int tabelGetal;
		
		for (int getal = 1; getal <= grootte; getal++) {
			System.out.print(getal + ": ");
			tabelGetal = getal;
			for (int reeks = 1; reeks <= getal; reeks++) {
				System.out.print(tabelGetal + " ");
				tabelGetal += getal;
			}
			System.out.println();
			keyboard.close();
		}
	}
}
