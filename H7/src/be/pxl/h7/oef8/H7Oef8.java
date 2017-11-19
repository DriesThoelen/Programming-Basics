package be.pxl.h7.oef8;

import java.util.Scanner;

public class H7Oef8 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String[] sterrenbeeld = { "waterman", "vissen", "ram", "stier", "tweelingen", "kreeft", "leeuw", "maagd", "weeschaal", "schorpioen", "boogschutter", "steenbok" };
		
		System.out.println("Geef je naam in");
		String naam = keyboard.nextLine();
		
//		while (!naam.equals("/")){
		
		// UITBREIDING while (!naam.equals("\\")){, dubbele \\ want \ enkel is een "escape", verwacht een tweede teken.
		
		while (!naam.equals("\\")){
			System.out.println("Geef je voornaam in");
			String voornaam = keyboard.nextLine();
			
			System.out.println("Geef je geboortedag in");
			int geboortedag = keyboard.nextInt();
			
			System.out.println("Geef je geboortemaand in");
			int geboortemaand = keyboard.nextInt();
			
			int sterrenbeeldnummer = bepaalSterrenbeeldNummer(geboortedag, geboortemaand);
			
			String naamvoornaam = samenvoegenNaamVoornaam(naam, voornaam);
			
			System.out.printf("%s %s %n", naamvoornaam, sterrenbeeld[sterrenbeeldnummer]);
			
			keyboard.nextLine();
			
			System.out.println("Geef je naam in");
			naam = keyboard.nextLine();
		}
		
		keyboard.close();
	}
	
	public static int bepaalSterrenbeeldNummer(int geboortedag, int geboortemaand) {
		int sterrenbeeldnummer = -1;
		
		if (geboortedag > 21) {
			sterrenbeeldnummer = (geboortemaand - 1);
		} else {
			if (geboortemaand == 1) {
				sterrenbeeldnummer = 11;
			} else {
				sterrenbeeldnummer = (geboortemaand - 2);
			}
		}
		
		return sterrenbeeldnummer;
	}
	
	public static String samenvoegenNaamVoornaam (String naam, String voornaam) {
		StringBuilder naamvoornaamBuilder = new StringBuilder();
		
		naamvoornaamBuilder.append(voornaam.substring(0,1).toUpperCase() + ". " + naam.toUpperCase());
		
		String naamvoornaam = naamvoornaamBuilder.toString();
		
		return naamvoornaam; 
	}
}