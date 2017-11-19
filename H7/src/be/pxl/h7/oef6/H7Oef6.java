package be.pxl.h7.oef6;

public class H7Oef6 {

	public static void main(String[] args) {
		int [][] cijfersStudenten = { {12, 4, 12, 9}, {14, 5, 9, 11}, {8, 9, 7, 12}, {7, 12, 11, 10}, {11, 18, 10, 14} };
		
		double[] gemiddelde = new double[4];
		int student;
		int vak;
		int totaalvak = 0;
		int[] laagstescores = { 20, 20, 20, 20 };
		int[] laagstscorendeStudent = new int[4];
		String[] vakken = { "Nederlands", "Wiskunde", "Fysica", "Chemie" };
		String[] studenten = { "Jan", "Piet", "Klaas", "Bert", "An" };
		
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
				gemiddelde[vak] = (double) totaalvak / (student + 1);
			}
		}
		
		for(vak = 0; vak < cijfersStudenten[vak].length; vak++) {
			System.out.printf("Gemiddelde %s = %.1f %n", vakken[vak], gemiddelde[vak]);
			System.out.printf("Laagste score %s = %d behaald door %s %n", vakken[vak], laagstescores[vak], studenten[laagstscorendeStudent[vak]]);
		}
		
	}
}