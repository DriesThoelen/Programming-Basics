package be.pxl.h6.exoef7;

import java.util.Calendar;
import java.util.Scanner;

public class H6ExOef7 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int im;
		int iv;
		int aanvraagnr = 1;
		int aantalKopers = 0;
		int aantalKopersSocialeWoning = 0;
		int hoogsteInkomen = 0;
		boolean alleenstaande = false;
		boolean hoogsteInkomenAlleenstaandeMan = false;
		boolean hoogsteInkomenAlleenstaandeVrouw = false;
		boolean hoogsteInkomenGezin = false;
		String code = null;
		String nm = null;
		String nv = null;
		StringBuilder afdruk = new StringBuilder();

		do {
			System.out.println("Geef in of de betrokken koper in een sociale woning woont en zo ja vanaf welk jaar d.m.v een code (J gevolgd door jaartal of N)");
			code = keyboard.nextLine();
		} while (!(controleerCode(code)));

		while (!(code.equalsIgnoreCase("STOP"))) {

			String antwoordSocialeWoning = code.substring(0, 1);
			if (antwoordSocialeWoning.equalsIgnoreCase("J")) {
				aantalKopersSocialeWoning++;
			}

			do {
				System.out.println("Geef de achternaam en voornaam van de man in (gescheiden door een underscore) (indien niet van toepassing, voer xx in)");
				nm = keyboard.nextLine();
			} while (!(controleerNaamMan(nm)));

			do {
				System.out.println("Geef de achternaam en voornaam van de vrouw in (gescheiden door een underscore) (indien niet van toepassing, voer xx in)");
				nv = keyboard.nextLine();
			} while (!(controleerNaamVrouw(nv)));

			if (!(nm.equalsIgnoreCase("xx"))) {
				System.out.println("Geef het inkomen van de man in");
				im = keyboard.nextInt();
			} else {
				im = 0;
			}

			if (!(nv.equalsIgnoreCase("xx"))) {
				System.out.println("Geef het inkomen van de vrouw in");
				iv = keyboard.nextInt();
			} else {
				iv = 0;
			}

			if ((nm.equalsIgnoreCase("xx")) && (nv.equalsIgnoreCase("xx"))) {
				System.out.println("Foutieve ingave. Minstens één naam is vereist. Invoer start opnieuw.");

				keyboard.nextLine();

				System.out.println("Geef in of de betrokken koper in een sociale woning woont en zo ja vanaf welk jaar d.m.v een code (J gevolgd door jaartal of N)");
				code = keyboard.nextLine();
			} else {
				StringBuilder familienaam = new StringBuilder();
				if ((nm.equalsIgnoreCase("xx")) || (nv.equalsIgnoreCase("xx"))) {
					alleenstaande = true;
					if (nm.equalsIgnoreCase("xx")) {
						if (iv > hoogsteInkomen) {
							hoogsteInkomen = iv;
							hoogsteInkomenAlleenstaandeMan = false;
							hoogsteInkomenAlleenstaandeVrouw = true;
							hoogsteInkomenGezin = false;
						}
						String[] nvarray = nv.split("_");
						familienaam.append("Mevrouw " + nvarray[1].substring(0, 1).toUpperCase() + ". " + nvarray[0].substring(0, 1).toUpperCase() + nvarray[0].substring(1).toLowerCase());
					} else {
						if (im > hoogsteInkomen) {
							hoogsteInkomen = im;
							hoogsteInkomenAlleenstaandeMan = true;
							hoogsteInkomenAlleenstaandeVrouw = false;
							hoogsteInkomenGezin = false;
						}
						String[] nmarray = nm.split("_");
						familienaam.append("Mijnheer " + nmarray[1].substring(0, 1).toUpperCase() + ". " + nmarray[0].substring(0, 1).toUpperCase() + nmarray[0].substring(1).toLowerCase());
					}
				} else {
					alleenstaande = false;
					if (im + iv > hoogsteInkomen) {
						hoogsteInkomen = im + iv;
						hoogsteInkomenAlleenstaandeMan = false;
						hoogsteInkomenAlleenstaandeVrouw = false;
						hoogsteInkomenGezin = true;
					}
					String[] nvarray = nv.split("_");
					String[] nmarray = nm.split("_");
					familienaam.append("De Heer en Mevrouw " + nmarray[1].substring(0, 1).toUpperCase() + ". " + nmarray[0].substring(0, 1).toUpperCase() + nmarray[0].substring(1).toLowerCase() + "-" + nvarray[0].substring(0, 1).toUpperCase() + nvarray[0].substring(1).toLowerCase());
				}
				System.out.println("Geef het aantal kinderen in");
				int ak = keyboard.nextInt();

				int prioriteitsnummer = berekenPrioriteitsnummer(code, im, iv, ak);
				StringBuilder bouwleningStad = new StringBuilder();
				bouwleningStad = berekenBouwleningStad(alleenstaande, code, im, iv, ak, bouwleningStad);

				StringBuilder prioriteit = new StringBuilder();
				prioriteit.setLength(5);

				for (int count = 0; count < prioriteitsnummer; count++) {
					prioriteit.setCharAt(count, '*');
				}

				afdruk.append(String.format("%-10s %-40s %-10s %s %n", (aanvraagnr + ".").toString(), familienaam, prioriteit, bouwleningStad));

				aanvraagnr++;
				aantalKopers++;
			}

			keyboard.nextLine();

			System.out.println("Geef in of de betrokken koper in een sociale woning woont en zo ja vanaf welk jaar d.m.v een code (J gevolgd door jaartal of N)");
			code = keyboard.nextLine();

		}

		if (aantalKopers != 0) {
			System.out.println(afdruk);

			double percentageKopersSocialeWoning = ((double) aantalKopersSocialeWoning / (double) aantalKopers) * 100;

			System.out.printf("%s %.1f %% %n", "Percent kopers in een sociale woning :", percentageKopersSocialeWoning);

			System.out.println("Hoogste inkomen : " + hoogsteInkomen + "€");
			if (hoogsteInkomenAlleenstaandeMan == true) {
				System.out.println("Het hoogste inkomen behoort toe tot een alleenstaande man.");
			} else {
				if (hoogsteInkomenAlleenstaandeVrouw == true) {
					System.out.println("Het hoogste inkomen behoort toe tot een alleenstaande vrouw.");
				} else {
					if (hoogsteInkomenGezin == true) {
						System.out.println("Het hoogste inkomen behoort toe tot een gezin.");
					}
				}
			}
		}

		keyboard.close();
	}

	public static boolean controleerCode(String code) {

		if ((code.substring(0, 1).equalsIgnoreCase("N") && (code.length() == 1))
				|| ((code.substring(0, 1).equalsIgnoreCase("J")) && (code.substring(1).matches("[0-9]+")))
				|| (code.equalsIgnoreCase("STOP"))) {
			return true;
		} else {
			System.err.println("Foutieve ingave. Code moet bestaan uit N of J gevolgd door jaartal.");
			return false;
		}
	}

	public static boolean controleerNaamMan(String nm) {

		if ((nm.equalsIgnoreCase("XX")) || (nm.matches("[a-z]+_[a-z]+")) || (nm.matches("[A-Z]+_[A-Z]+"))
				|| (nm.matches("[A-Z][a-z]+_[A-Z][a-z]+"))) {
			return true;
		} else {
			System.err.println("Foutieve ingave. Achternaam en voornaam man mag enkel bestaan uit hoofdletters en kleine letters en moet gescheiden worden door een underscore");
			return false;
		}
	}

	public static boolean controleerNaamVrouw(String nv) {

		if ((nv.equalsIgnoreCase("XX")) || (nv.matches("[a-z]+_[a-z]+")) || (nv.matches("[A-Z]+_[A-Z]+"))
				|| (nv.matches("[A-Z][a-z]+_[A-Z][a-z]+"))) {
			return true;
		} else {
			System.err.println("Foutieve ingave. Achternaam en voornaam vrouw mag enkel bestaan uit hoofdletters en kleine letters en moet gescheiden worden door een underscore");
			return false;
		}
	}

	public static int berekenPrioriteitsnummer(String code, int im, int iv, int ak) {

		Calendar date = Calendar.getInstance();
		int prioriteitsnummer = 0;
		int jaartal = 0;

		String antwoordSocialeWoning = code.substring(0, 1);
		if (antwoordSocialeWoning.equalsIgnoreCase("J")) {
			jaartal = Integer.valueOf((code.substring(1, 5)));
		}

		int huidigjaar = date.get(Calendar.YEAR);

		int aantalJarenInSocialeWoning = huidigjaar - jaartal;

		int gi = im + iv;

		if (antwoordSocialeWoning.equalsIgnoreCase("J") && (aantalJarenInSocialeWoning < 5)) {
			prioriteitsnummer = 5;
		} else {
			if ((gi < 2000) && (ak >= 3)) {
				prioriteitsnummer = 1;
			} else {
				if ((gi < 2000) && (ak < 3)) {
					prioriteitsnummer = 2;
				} else {
					if ((gi >= 2000) && (gi < 2500)) {
						prioriteitsnummer = 3;
					} else {
						prioriteitsnummer = 4;
					}
				}
			}
		}

		return prioriteitsnummer;
	}

	public static StringBuilder berekenBouwleningStad(boolean alleenstaande, String code, int im, int iv, int ak,
			StringBuilder bouwleningStad) {

		String antwoordSocialeWoning = code.substring(0, 1);

		int gi = im + iv;

		if (antwoordSocialeWoning.equalsIgnoreCase("N")) {
			if (ak >= 1 && gi < 1500) {
				bouwleningStad.setLength(antwoordSocialeWoning.length());
				bouwleningStad.append("J");
			}
		}

		return bouwleningStad;
	}
}