package be.pxl.h7.oef4;

import java.util.Scanner;

public class H7Oef4_Old {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int aantalStemmen = 0;
		int aantalStemmenAn = 0;
		int aantalStemmenAndries = 0;
		int aantalStemmenBart = 0;
		int aantalStemmenInge = 0;

		int[] stemmenTemporary = new int[9999999];

		System.out.println("Geef je stem in voor student van het jaar (1 = An Janssen, 2 = Bart Vriends, 3 = Andries Michels, 4 = Inge Kaas)");
		int stem = keyboard.nextInt();
		
		while (stem != 0) {
			stemmenTemporary[aantalStemmen] = stem;

			aantalStemmen++;
			
			System.out.println("Geef je stem in voor student van het jaar (1 = An Janssen, 2 = Bart Vriends, 3 = Andries Michels, 4 = Inge Kaas)");
			stem = keyboard.nextInt();
		}

		int[] stemmen = new int[aantalStemmen];
		int[] stemmenAnTemporary = new int[aantalStemmen];
		int[] stemmenAndriesTemporary = new int[aantalStemmen];
		int[] stemmenBartTemporary = new int[aantalStemmen];
		int[] stemmenIngeTemporary = new int[aantalStemmen];

		int count;

		for (count = 0; count < stemmen.length; count++) {
			stemmen[count] = stemmenTemporary[count];

			switch (stemmen[count]) {
			case 1:
				stemmenAnTemporary[0 + aantalStemmenAn] = stemmen[count];
				aantalStemmenAn++;
				break;
			case 2:
				stemmenBartTemporary[0 + aantalStemmenBart] = stemmen[count];
				aantalStemmenBart++;
				break;
			case 3:
				stemmenAndriesTemporary[0 + aantalStemmenAndries] = stemmen[count];
				aantalStemmenAndries++;
				break;
			case 4:
				stemmenIngeTemporary[0 + aantalStemmenInge] = stemmen[count];
				aantalStemmenInge++;
				break;
			}
		}

//		int[] stemmenAn = new int[aantalStemmenAn];
//
//		for (int countAn = 0; countAn < stemmenAn.length; countAn++) {
//			stemmenAn[countAn] = stemmenAnTemporary[countAn];
//		}
//
//		int[] stemmenAndries = new int[aantalStemmenAndries];
//
//		for (int countAndries = 0; countAndries < stemmenAndries.length; countAndries++) {
//			stemmenAndries[countAndries] = stemmenAndriesTemporary[countAndries];
//		}
//
//		int[] stemmenBart = new int[aantalStemmenBart];
//
//		for (int countBart = 0; countBart < stemmenBart.length; countBart++) {
//			stemmenBart[countBart] = stemmenBartTemporary[countBart];
//		}
//
//		int[] stemmenInge = new int[aantalStemmenInge];
//
//		for (int countInge = 0; countInge < stemmenInge.length; countInge++) {
//			stemmenInge[countInge] = stemmenIngeTemporary[countInge];
//		}

		double percentAandeelStemmenAn = ((double) aantalStemmenAn / count) * 100;
		double percentAandeelStemmenAndries = ((double) aantalStemmenAndries / count) * 100;
		double percentAandeelStemmenBart = ((double) aantalStemmenBart / count) * 100;
		double percentAandeelStemmenInge = ((double) aantalStemmenInge / count) * 100;

//		if (aantalStemmen != 0) {
//			System.out.printf("int[%d] stemmen =  {", aantalStemmen);
//
//			for (int stemGetal : stemmen) {
//				System.out.printf(" %d ", stemGetal);
//			}
//
//			System.out.println("}");
//
//		} else {
//			System.out.println("De array stemmen[] is leeg");
//		}
//
//		if (aantalStemmenAn != 0) {
//			System.out.printf("int[%d] stemmenAn =  {", aantalStemmenAn);
//
//			for (int stemGetalAn : stemmenAn) {
//				System.out.printf(" %d ", stemGetalAn);
//			}
//
//			System.out.println("}");
//
//		} else {
//			System.out.println("De array stemmenAn[] is leeg");
//		}
//
//		if (aantalStemmenAndries != 0) {
//			System.out.printf("int[%d] stemmenAndries =  {", aantalStemmenAndries);
//
//			for (int stemGetalAndries : stemmenAndries) {
//				System.out.printf(" %d ", stemGetalAndries);
//			}
//
//			System.out.println("}");
//
//		} else {
//			System.out.println("De array stemmenAndries[] is leeg");
//		}
//
//		if (aantalStemmenBart != 0) {
//			System.out.printf("int[%d] stemmenBart =  {", aantalStemmenBart);
//
//			for (int stemGetalBart : stemmenBart) {
//				System.out.printf(" %d ", stemGetalBart);
//			}
//
//			System.out.println("}");
//
//		} else {
//			System.out.println("De array stemmenBart[] is leeg");
//		}
//
//		if (aantalStemmenInge != 0) {
//			System.out.printf("int[%d] stemmenInge =  {", aantalStemmenInge);
//
//			for (int stemGetalInge : stemmenInge) {
//				System.out.printf(" %d ", stemGetalInge);
//			}
//
//			System.out.println("}");
//
//		} else {
//			System.out.println("De array stemmenInge[] is leeg");
//		}
		
		System.out.printf("%s, %d %s, %.1f %s %n", "An Janssens", aantalStemmenAn, "stem(men)", percentAandeelStemmenAn, "% van het totaal aantal stemmen");
		System.out.printf("%s, %d %s, %.1f %s %n", "Andries Michels", aantalStemmenAndries, "stem(men)", percentAandeelStemmenAndries, "% van het totaal aantal stemmen");
		System.out.printf("%s, %d %s, %.1f %s %n", "Bart Vriends", aantalStemmenBart, "stem(men)", percentAandeelStemmenBart, "% van het totaal aantal stemmen");
		System.out.printf("%s, %d %s, %.1f %s %n", "Inge Kaas", aantalStemmenInge, "stem(men)", percentAandeelStemmenInge, "% van het totaal aantal stemmen");
		
		keyboard.close();
	}
}