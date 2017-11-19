package be.pxl.h7.exoef7;

public class H7ExOef7 {

	public static void main(String[] args) {
		String[][] strips = { {"De Chninkel", "Vanhamme"}, {"Kuifje in Tibet", "Herge"}, {"Maus", "Spiegelmann"}, {"Kuifje en de blauwe lotus", "Herge"}, {"Largo Winch: de erfgenamen", "Vanhamme"} };
		int[][] enquete = { { 105, 35, 5 }, { 66, 21, 12 }, { 44, 36, 56 }, { 56, 12, 12 }, { 29, 10, 9 } };
		int[] stripTotaalAantalStemmen = new int[enquete.length];
		int hoogsteStripTotaalAantalStemmen = 0;
		int hoogsteStripTotaalAantalStemmenStrip = 0;
		int hoogsteStripTotaalAantalStemmenAuteur = 0;
		
		for(int strip = 0; strip < enquete.length; strip++) {
			for(int klas = 0; klas < enquete[strip].length; klas++) {
				stripTotaalAantalStemmen[strip] += enquete[strip][klas];
			}
		}
		
		for(int strip = 0; strip < strips.length; strip++) {
				System.out.printf("%s, %s, totaal aantal behaalde stemmen = %d %n", strips[strip][0], strips[strip][1], stripTotaalAantalStemmen[strip]);
				if (stripTotaalAantalStemmen[strip] > hoogsteStripTotaalAantalStemmen) {
					hoogsteStripTotaalAantalStemmen = stripTotaalAantalStemmen[strip];
					hoogsteStripTotaalAantalStemmenStrip = strip;
					hoogsteStripTotaalAantalStemmenAuteur = strip + 1;
				}
		}
		
		System.out.printf("de strip met het hoogst aantal stemmen is %s van auteur %s", strips[hoogsteStripTotaalAantalStemmenStrip][hoogsteStripTotaalAantalStemmenStrip].toUpperCase(),strips[hoogsteStripTotaalAantalStemmenStrip][hoogsteStripTotaalAantalStemmenAuteur].toUpperCase());
	}
}