package be.pxl.h7.exoef2;

import java.util.Scanner;

public class H7ExOef2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef de klascode in.");
		String klascode = keyboard.nextLine();
		
		System.out.println("Geef het betaalde voorschot in.");
		int betaaldeVoorschot = keyboard.nextInt();
		
		System.out.println("Geef het aantal studenten van de klas in.");
		int aantalStudenten = keyboard.nextInt();
		
		int[] studenten = new int[aantalStudenten + 1];
		
		int studentnr;
		
		for(studentnr = 1; studentnr < studenten.length; studentnr++) {
			studenten[studentnr] = studentnr;
		}
		
		int[] onkosten = new int[aantalStudenten + 1];
		int[] saldo = new int[aantalStudenten + 1];
		
		int count = 0;
		
		System.out.println("Geef een studentnummer op tussen 1 en " + studenten.length + ". Geef 0 in om het programma te stoppen.");
		studentnr = keyboard.nextInt();
		
		while(studentnr > aantalStudenten) {
			System.out.println("Foutieve ingave, geef een studentnummer op tussen 1 en " + studenten.length + ". Geef 0 in om het programma te stoppen.");
			studentnr = keyboard.nextInt();
		}
		
		while((studentnr != 0) && (studentnr <= aantalStudenten)) {
			System.out.println("Geef de onkosten van de student met studentnummer " + studentnr + " op.");
			int onkost = keyboard.nextInt();
			
			onkosten[studentnr] += onkost;
			
			saldo[studentnr] = betaaldeVoorschot - onkosten[studentnr];
			
			count++;
			
			System.out.println("Geef een studentnummer op tussen 1 en " + studenten.length + ". Geef 0 in om het programma te stoppen.");
			studentnr = keyboard.nextInt();
			
			while(studentnr > aantalStudenten) {
				System.out.println("Foutieve ingave, geef een studentnummer op tussen 1 en " + studenten.length + ". Geef 0 in om het programma te stoppen.");
				studentnr = keyboard.nextInt();
			}
		}
		
		if (count != 0) {
			System.out.printf("%s %s %d %s %d %s %n", klascode, "heeft", aantalStudenten, "studenten met een betaald voorschot van", betaaldeVoorschot, "euro.");
		}
			
		for(int student : studenten) {
			if ((student != 0) && (onkosten[student] != 0)) {
				if (saldo[student] < 0) {
					System.out.printf("%s %d %s %s %s %d %s %d %s %n", "Studentnummer", student, "van klas", klascode, "heeft", onkosten[student], "euro onkosten en moet dus nog", -(saldo[student]), "euro betalen.");
				} else {
					System.out.printf("%s %d %s %s %s %d %s %d %s %n", "Studentnummer", student, "van klas", klascode, "heeft", onkosten[student], "euro onkosten en krijgt dus", saldo[student], "euro terug.");
				}
			}
		}
		
		keyboard.close();
	}
}