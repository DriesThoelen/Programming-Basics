package be.pxl.testexamen.opgave4;

import java.util.Scanner;

public class TestExamenOpgave4 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Geef code student in; dit is een geheel getal tussen 1 en 7 (grenzen inclusief)");
		int codeStudent = keyboard.nextInt();
		
		double basisInschrijvingsGeld = 585;
		
		switch (codeStudent) {
		case 3 :
			basisInschrijvingsGeld = basisInschrijvingsGeld + (basisInschrijvingsGeld * 0.10);
			break;
		case 4 :
		case 5 :
			basisInschrijvingsGeld = basisInschrijvingsGeld + (basisInschrijvingsGeld * 0.30);
		case 6 :
		case 7 :
			basisInschrijvingsGeld = basisInschrijvingsGeld + (basisInschrijvingsGeld * 0.40);
		default:
			basisInschrijvingsGeld = basisInschrijvingsGeld + 20;
		}
		System.out.println("Het inschrijvingsgeld voor een student met code " + codeStudent + " is gelijk aan " + basisInschrijvingsGeld);
		keyboard.close();
	}
}