package be.pxl.testexamen.opgave7;

import java.util.Scanner;

public class TestExamenOpgave7 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int beginGetal = 0;
		int eindGetal;
		
		do {
			System.out.println("geef een even getal in");
			eindGetal = keyboard.nextInt();
		} while (eindGetal % 2 != 0);
		
		while (beginGetal < eindGetal) {
			beginGetal++;
			System.out.println(beginGetal + "/" + eindGetal);
			eindGetal--;
		}
		keyboard.close();
	}
}