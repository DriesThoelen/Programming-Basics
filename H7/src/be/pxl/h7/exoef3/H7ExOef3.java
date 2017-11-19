package be.pxl.h7.exoef3;

import java.util.Scanner;

public class H7ExOef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geef een positief geheel getal in");
		String getal = keyboard.nextLine();
		
		while (!(getal.matches("[0-9]+"))) {
			System.out.println("Foutieve ingave, geef een POSITIEF (dus niet negatief) GEHEEL (dus geen decimalen) GETAL (dus geen letters of tekens) in;");
			getal = keyboard.nextLine();
		}
		
		String[] getalGesplitst = getal.split("");
		
		StringBuilder getalNaarWoordBuilder = new StringBuilder();
		
		for(String getalNaarWoord : getalGesplitst) {
			/*if (getalNaarWoord.equals("0")) {
				getalNaarWoordBuilder.append("nul ");
			} else {
				if (getalNaarWoord.equals("1")) {
					getalNaarWoordBuilder.append("een ");
				} else {
					if (getalNaarWoord.equals("2")) {
						getalNaarWoordBuilder.append("twee ");
					} else {
						if (getalNaarWoord.equals("3")) {
							getalNaarWoordBuilder.append("drie ");
						} else {
							if (getalNaarWoord.equals("4")) {
								getalNaarWoordBuilder.append("vier ");
							} else {
								if (getalNaarWoord.equals("5")) {
									getalNaarWoordBuilder.append("vijf ");
								} else {
									if (getalNaarWoord.equals("6")) {
										getalNaarWoordBuilder.append("zes ");
									} else {
										if (getalNaarWoord.equals("7")) {
											getalNaarWoordBuilder.append("zeven ");
										} else {
											if (getalNaarWoord.equals("8")) {
												getalNaarWoordBuilder.append("acht ");
											} else {
												getalNaarWoordBuilder.append("negen ");
											}	
										}	
									}	
								}
							}
						}
					}
				}
			}*/
			
			switch (getalNaarWoord) {
			case "0":
				getalNaarWoordBuilder.append("nul ");
				break;
			case "1":
				getalNaarWoordBuilder.append("een ");
				break;
			case "2":
				getalNaarWoordBuilder.append("twee ");
				break;
			case "3":
				getalNaarWoordBuilder.append("drie ");
				break;
			case "4":
				getalNaarWoordBuilder.append("vier ");
				break;
			case "5":
				getalNaarWoordBuilder.append("vijf ");
				break;
			case "6":
				getalNaarWoordBuilder.append("zes ");
				break;
			case "7":
				getalNaarWoordBuilder.append("zeven ");
				break;
			case "8":
				getalNaarWoordBuilder.append("acht ");
				break;
			case "9":
				getalNaarWoordBuilder.append("negen ");
				break;
			default:
				System.out.println("Ongeldig teken");
				break;
			}
		}
		
		System.out.println(getalNaarWoordBuilder);
		
		keyboard.close();
	}
}