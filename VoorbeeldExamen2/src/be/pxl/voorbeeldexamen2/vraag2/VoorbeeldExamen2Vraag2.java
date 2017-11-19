package be.pxl.voorbeeldexamen2.vraag2;

import java.util.Random;
import java.util.Scanner;

public class VoorbeeldExamen2Vraag2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();

		String[] roman = { "XL", "X", "IX", "V", "IV", "I" };
		int[] waarde = { 40, 10, 9, 5, 4, 1 };
		int[] categorie = new int[4];
		int somWillekeurigGetal = 0;
		int willekeurigAantalLijnen;
		int willekeurigGegenereerdGetal;
		int willekeurigGetal = 0;
		int vorigWillekeurigGetal = 0;

		System.out.print("Geef letter: ");
		char letter = keyboard.nextLine().charAt(0);

		System.out.println();

		for(char reeksLetter = 'a'; reeksLetter <= letter; reeksLetter++) {
			System.out.println("Reeks " + reeksLetter);
			willekeurigAantalLijnen = rand.nextInt(3);
			for(int aantalLijnen = 0; aantalLijnen <= willekeurigAantalLijnen; aantalLijnen++) {
				willekeurigGegenereerdGetal = rand.nextInt(48) + 1;
				while ((willekeurigGegenereerdGetal < vorigWillekeurigGetal) && (vorigWillekeurigGetal < 49)) {
					willekeurigGegenereerdGetal = rand.nextInt(49 - vorigWillekeurigGetal) + vorigWillekeurigGetal + 1;
				}
				if (vorigWillekeurigGetal != 49) {
					willekeurigGetal = willekeurigGegenereerdGetal;
				} else {
					willekeurigGetal = 49;
				}
				somWillekeurigGetal += willekeurigGetal;
				System.out.println("Het romeinse cijfer voor " + willekeurigGetal + " is " + zetOmNaarRomeinsCijfer(willekeurigGetal, roman, waarde));
				vorigWillekeurigGetal = willekeurigGetal;
			}
			if (somWillekeurigGetal < 50) {
				categorie[0] += 1;
			} else {
				if ((somWillekeurigGetal > 50) && (somWillekeurigGetal < 70)) {
					categorie[1] += 1;
				} else {
					if ((somWillekeurigGetal > 70) && (somWillekeurigGetal < 90)) {
						categorie[2] += 1;
					} else {
						categorie[3] += 1;
					}
				}
			}
			somWillekeurigGetal = 0;
			willekeurigGetal = 0;
			vorigWillekeurigGetal = 0;
			willekeurigAantalLijnen = 0;
			System.out.println();
		}
		
		System.out.println("Aantal reeksen met som van gegenereerde getallen minder dan 50: " + categorie[0]);
		System.out.println("Aantal reeksen met som van gegenereerde getallen tussen 50 en 70: " + categorie[1]);
		System.out.println("Aantal reeksen met som van gegenereerde getallen tussen 70 en 90: " + categorie[2]);
		System.out.println("Aantal reeksen met som van gegenereerde getallen van 90 of meer: " + categorie[3]);
		
		keyboard.close();
	}

	public static String zetOmNaarRomeinsCijfer(int willekeurigGetal, String[] roman, int[] waarde) {
		StringBuilder romeinsCijferBuilder = new StringBuilder();

		int tiental = (willekeurigGetal / 10) * 10;
		int eenheid = willekeurigGetal % 10;
		
		for(int count = 0; count < waarde.length - 4; count++) {
			if(waarde[count] == tiental) {
				romeinsCijferBuilder.append(roman[count]);
			} else {
				if((waarde[count] > tiental) && (waarde[count + 1] != tiental)) {
					for(int aantalKeerTiental = 0; aantalKeerTiental < (tiental / 10); aantalKeerTiental++) {
						romeinsCijferBuilder.append(roman[count + 1]);
					}
				}
			}
		}
		
		for(int count = 2; count < waarde.length - 3; count++) {
			if(waarde[count] == eenheid) {
				romeinsCijferBuilder.append(roman[count]);
			} else {
				if(waarde[count] > eenheid) { 
					if (waarde[count + 1] <= eenheid) {
						romeinsCijferBuilder.append(roman[count + 1]);
						for(int aantalKeerEenheid = 0; aantalKeerEenheid < eenheid - waarde[count + 1]; aantalKeerEenheid++) {
							romeinsCijferBuilder.append(roman[count + 3]);
						}
					} else {
						if (waarde[count + 2] <= eenheid) {
							romeinsCijferBuilder.append(roman[count + 2]);
							for(int aantalKeerEenheid = 0; aantalKeerEenheid < eenheid - waarde[count + 2]; aantalKeerEenheid++) {
								romeinsCijferBuilder.append(roman[count + 3]);
							}
						} else {
							for(int aantalKeerEenheid = 0; aantalKeerEenheid < eenheid; aantalKeerEenheid++) {
								romeinsCijferBuilder.append(roman[count + 3]);
							}
						}
					}
				}
			}
		}
		
//		int tiental = willekeurigGetal / 10;
//		int eenheid = willekeurigGetal % 10;

//		if (tiental != 0) {
//			if (tiental < 4) {
//				for (int count = 0; count < tiental; count++) {
//					romeinsCijferBuilder.append("X");
//				}
//			} else {
//				romeinsCijferBuilder.append("XL");
//			}
//		}
//		
//		switch (eenheid) {
//		case 1:
//			romeinsCijferBuilder.append("I");
//			break;
//		case 2:
//			romeinsCijferBuilder.append("II");
//			break;
//		case 3:
//			romeinsCijferBuilder.append("III");
//			break;
//		case 4:
//			romeinsCijferBuilder.append("IV");
//			break;
//		case 5:
//			romeinsCijferBuilder.append("V");
//			break;
//		case 6:
//			romeinsCijferBuilder.append("VI");
//			break;
//		case 7:
//			romeinsCijferBuilder.append("VII");
//			break;
//		case 8:
//			romeinsCijferBuilder.append("VIII");
//			break;
//		case 9:
//			romeinsCijferBuilder.append("IX");
//			break;
//		}

		return romeinsCijferBuilder.toString();
	}
}