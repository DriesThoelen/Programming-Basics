package be.pxl.h7.oef6;

import java.util.Scanner;

public class H7Oef6_Invoer {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		int student;
		int vak;
		int totaalvak = 0;
		String[] vakken = { "Nederlands", "Wiskunde", "Fysica", "Chemie" };
		String[] studenten = { "Jan", "Piet", "Klaas", "Bert", "An" };
		double[] gemiddelde = new double[vakken.length];
		int[] laagstescores = new int[studenten.length];
		int[] laagstscorendeStudent = new int[studenten.length];
		
		int[][] cijfersStudenten = new int[studenten.length][vakken.length];
		
		for(student = 0; student < cijfersStudenten.length; student++) {
			for(vak = 0; vak < cijfersStudenten[student].length; vak++) {
				System.out.printf("%s %s %s %s %n", "Geef het cijfer in voor het vak", vakken[vak], "behaald door", studenten[student]);
				cijfersStudenten[student][vak] = keyboard.nextInt();
				laagstescores[student] = 21;
			}
		}
		
		for(student = 0; student < cijfersStudenten.length; student++) {
			for(vak = 0; vak < cijfersStudenten[student].length; vak++) {
				if (cijfersStudenten[student][vak] < laagstescores[vak]) {
					laagstescores[vak] = cijfersStudenten[student][vak];
					laagstscorendeStudent[vak] = student;
				}
			}
		}
		
		for(vak = 0; vak < cijfersStudenten[vak].length; vak++) {
			totaalvak = 0;
			for(student = 0; student < cijfersStudenten.length; student++) {
				totaalvak = totaalvak + cijfersStudenten[student][vak];
				gemiddelde[vak] = (double) totaalvak / studenten.length;
			}
		}
		
		for(vak = 0; vak < cijfersStudenten[vak].length; vak++) {
			System.out.printf("Gemiddelde %s = %.1f %n", vakken[vak], gemiddelde[vak]);
			System.out.printf("Laagste score %s = %d behaald door %s %n", vakken[vak], laagstescores[vak], studenten[laagstscorendeStudent[vak]]);
		}
		
		keyboard.close();
	}
}