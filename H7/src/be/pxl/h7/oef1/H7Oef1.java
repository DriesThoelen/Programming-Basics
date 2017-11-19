package be.pxl.h7.oef1;

import java.util.Scanner;

public class H7Oef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[] getallen = new int[15];
		int count;
		int somGetallen = 0;
		int aantalKleinerDanGemiddelde = 0;
		
		for(count = 0; count < getallen.length; count++) {
			System.out.println("Geef een geheel getal in");
			int getal = keyboard.nextInt();
			getallen[count] = getal;
			somGetallen += getallen[count];
		}
		
		double gemiddelde = (double)somGetallen / count;
		System.out.printf("%s %.1f %n", "Gemiddelde : ", gemiddelde);
		
		for(count = 0; count < getallen.length; count++) {
			if (getallen[count] < gemiddelde) {
				aantalKleinerDanGemiddelde++;
			}
		}
		
		System.out.println("Getallen kleiner dan het gemiddelde :" + aantalKleinerDanGemiddelde);
		double percentagekleinerDanGemiddelde = ((double) aantalKleinerDanGemiddelde / count) * 100;
		System.out.printf("%s %.2f %s %n", "Percentage kleiner dan het gemiddelde :", percentagekleinerDanGemiddelde, "%");
		
		keyboard.close();
	}
}