package be.pxl.voorbeeldexamen1.vraag3;

import java.util.Scanner;

public class VoorbeeldExamenVraag3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int maximaalAantalKarakters;
		int tekstregel;
		int rest = 0;
		int spatie;
		
		System.out.print("Tekst : ");
		String tekst = keyboard.nextLine();
		
		System.out.print("Maximaal aantal karakters (negatief stopt): ");
		maximaalAantalKarakters = keyboard.nextInt();
		
		while(maximaalAantalKarakters > 0) {
			int tekstgedeelte = 0;
			int aantalkeren = 0;
			StringBuilder koppeltekenBuilder = new StringBuilder();
			
			for (int count = 0; count < maximaalAantalKarakters; count++) {
				koppeltekenBuilder.append("-");
			}
			
			System.out.println(koppeltekenBuilder);
			
			tekst = tekst.trim();
			String[] tekstgesplitst = tekst.split(" ");
			StringBuilder tekstBuilder = new StringBuilder();
			
			for(tekstregel = 0; tekstregel < ((double) tekst.length() / (double) maximaalAantalKarakters); tekstregel++) {
				rest = maximaalAantalKarakters;
				StringBuilder regelBuilder = new StringBuilder();
				
				if (tekstgesplitst[tekstgedeelte].length() < maximaalAantalKarakters) {
					spatie = 1;
				} else {
					spatie = 0;
				}
				
				while((rest >= tekstgesplitst[tekstgedeelte].length()) && (tekstgedeelte + 1 < tekstgesplitst.length)) {
					rest -= tekstgesplitst[tekstgedeelte].length() + spatie;
					
					if (rest > 0) {
						if (rest < tekstgesplitst[tekstgedeelte + 1].length()) {
							regelBuilder.append(String.format("%s", tekstgesplitst[tekstgedeelte]));
							tekstgedeelte++;
							spatie = 0;
						} else {
							regelBuilder.append(String.format("%s ", tekstgesplitst[tekstgedeelte]));
							tekstgedeelte++;
							spatie = 1;
						}
					} else {
						regelBuilder.append(String.format("%s", tekstgesplitst[tekstgedeelte]));
						tekstgedeelte++;
						spatie = 0;
					}
				}
				
				if (tekstgesplitst[tekstgedeelte].length() < maximaalAantalKarakters) {
					if (tekstregel < ((double) tekst.length() / (double) maximaalAantalKarakters) - 1) {
						tekstBuilder.append(String.format("%"+maximaalAantalKarakters+"s", regelBuilder));
						tekstBuilder.append("\n");
					} else {
						regelBuilder.append(String.format("%s", tekstgesplitst[tekstgedeelte]));
						tekstBuilder.append(String.format("%"+maximaalAantalKarakters+"s", regelBuilder));
						tekstBuilder.append("\n");
					}
				} else {
					if (tekstgedeelte + 1 < tekstgesplitst.length) {
						if (rest == maximaalAantalKarakters) {
							regelBuilder.append(String.format("%s", tekstgesplitst[tekstgedeelte]));
						} else {
							regelBuilder.append(String.format("%n %s", tekstgesplitst[tekstgedeelte]));
						}
						tekstBuilder.append(String.format("%"+maximaalAantalKarakters+"s", regelBuilder));
						tekstBuilder.append("\n");
						tekstgedeelte++;
						spatie = 0;
					} else {
						if (aantalkeren < 1) {
							regelBuilder.append(String.format("%s", tekstgesplitst[tekstgedeelte]));
							tekstBuilder.append(String.format("%"+maximaalAantalKarakters+"s", regelBuilder));
							tekstBuilder.append("\n");
							aantalkeren = 1;
						}
					}
				}
			}
			
			System.out.print(tekstBuilder);
			
			System.out.print("Maximaal aantal karakters (negatief stopt): ");
			maximaalAantalKarakters = keyboard.nextInt();
		}
		
		keyboard.close();
	}
}
