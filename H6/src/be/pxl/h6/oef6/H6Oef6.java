package be.pxl.h6.oef6;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

public class H6Oef6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		df.setRoundingMode(RoundingMode.HALF_UP);

		System.out.println("Geef de naam van de verkoper in");
		String naamVerkoper = keyboard.nextLine();
		
		double hoogte = 0;
		double breedte = 0;
		
//		do {
//			System.out.println("Geef de hoogte in");
//			hoogte = keyboard.nextDouble();
//		} while ((hoogte < 2) || (hoogte > 6.5));
//
//		do {
//			System.out.println("Geef de breedte in");
//			breedte = keyboard.nextDouble();
//		} while ((breedte < 2) || (breedte > 8));
		
		System.out.println("Geef de hoogte in");
		hoogte = keyboard.nextDouble();
		
		while (!isGeldigHoogte(hoogte)) {
			System.out.println("Foutieve hoogte, Geef de hoogte in");
			hoogte = keyboard.nextDouble();
		} 

		System.out.println("Geef de breedte in");
		breedte = keyboard.nextDouble();
		
		while (!isGeldigBreedte(breedte)) {
			System.out.println("Foutieve breedte, Geef de breedte in");
			breedte = keyboard.nextDouble();
		} 
		
		keyboard.nextLine();
		
		System.out.println("Wenst de klant een speciale kleur?");
		String antwoordSpecialeKleur = keyboard.nextLine();
		
		double oppervlaktePoort = berekenOppervlakte(hoogte, breedte);
		
		double gewichtPoort = berekenGewicht(oppervlaktePoort);
		
		String typeMotor = berekenTypeMotor(gewichtPoort);
		
		double prijsMotor = berekenPrijsMotor(typeMotor);
		
		double prijsPoort = berekenPrijsPoort(oppervlaktePoort, prijsMotor, antwoordSpecialeKleur);
		
		String offertenummer = berekenOffertenummer(naamVerkoper, prijsPoort);
		
		System.out.println("Offertenummer : " + offertenummer);
		System.out.println("Oppervlakte poort : " + oppervlaktePoort + " m²");
		System.out.println("Gewicht poort : " + gewichtPoort + " kg");
		System.out.println("Type motor : " + typeMotor);
		System.out.println("Totaalprijs poort : " + "€ " + df.format(prijsPoort));
		
		
		keyboard.close();
	}
	
	public static boolean isGeldigHoogte (double hoogte) {
		 return (hoogte <= 6.5) && (hoogte >= 2);
	}
	
	public static boolean isGeldigBreedte (double breedte) {
		 return (breedte <= 8) && (breedte >= 2);
	}
	
	public static double berekenOppervlakte(double hoogte, double breedte) {
		double oppervlaktePoort = hoogte * breedte;
		
		return oppervlaktePoort;
	}
	
	public static double berekenGewicht(double oppervlaktePoort) {
		double gewicht = oppervlaktePoort * 11;
		
		return gewicht;
	}
	
	public static double berekenPrijsMotor(String typeMotor) {
		double prijsMotor;
		
		if (typeMotor.equalsIgnoreCase("A101")) {
			prijsMotor = 120;
		} else {
			if (typeMotor.equalsIgnoreCase("A105")) {
				prijsMotor = 220.5;
			} else {
				prijsMotor = 250.5;
			}
		}
		
		return prijsMotor;
	}
	
	public static String berekenTypeMotor(double gewichtPoort) {
		String typeMotor;
		
		if (gewichtPoort < 150) {
			typeMotor = "A101";
		} else {
			if (gewichtPoort <= 300) {
				typeMotor = "A105";
			} else {
				typeMotor = "X300";
			}
		}
		
		return typeMotor;
	}
	
	public static double berekenPrijsPoort(double oppervlaktePoort, double prijsMotor, String antwoordSpecialeKleur) {
		double toeslagSpecialeKleur = 0;
		double prijsPoort = oppervlaktePoort * 113.5 + prijsMotor;
		
		if (antwoordSpecialeKleur.equalsIgnoreCase("Ja")) {
			toeslagSpecialeKleur = prijsPoort * 0.10;
		}
		
		prijsPoort = oppervlaktePoort * 113.5 + prijsMotor + toeslagSpecialeKleur;
		
		return prijsPoort;
	}
	
	public static String berekenOffertenummer(String naamVerkoper, double prijsPoort) {
		StringBuilder offertenummerBuild = new StringBuilder();
		StringBuilder prijsPoortBuild = new StringBuilder();
		Calendar date = Calendar.getInstance();
		
		int huidigJaar = date.get(Calendar.YEAR);
		
		offertenummerBuild.append(huidigJaar); 
		offertenummerBuild.append("_");
		offertenummerBuild.append(naamVerkoper.toUpperCase());
		offertenummerBuild.append("_");
		offertenummerBuild.append(prijsPoortBuild.append(prijsPoort).reverse());
		
		String offertenummer = offertenummerBuild.toString();
		
		return offertenummer;
	}
}