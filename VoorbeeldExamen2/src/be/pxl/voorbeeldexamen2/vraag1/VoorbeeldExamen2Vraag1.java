package be.pxl.voorbeeldexamen2.vraag1;

import java.util.Random;
import java.util.Scanner;

public class VoorbeeldExamen2Vraag1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		int aantalWillekeurigeGetallen;
		int somWillekeurigeGetallen = 0;
		int veelvoudgetal;
		
		do {
			System.out.println("Geef het aantal getallen dat random zal berekend worden:");
			aantalWillekeurigeGetallen = keyboard.nextInt();
		} while(aantalWillekeurigeGetallen <= 1);
			
		int[] willekeurigeGetallen = new int[aantalWillekeurigeGetallen];
		
		do {
			System.out.println("Geef het veelvoud op:");
			veelvoudgetal = keyboard.nextInt();
		} while(veelvoudgetal >= 10);
		
		
		for (int count = 0; count < willekeurigeGetallen.length; count++) {
			willekeurigeGetallen[count] = rand.nextInt(100 / veelvoudgetal) * veelvoudgetal + veelvoudgetal;
		}
		
		System.out.println("De gegenereerde getallen zijn:");
		
		for(int willekeurigGetal : willekeurigeGetallen) {
			System.out.printf("%d ", willekeurigGetal);
			somWillekeurigeGetallen += willekeurigGetal;
		}
		
		System.out.println();
		
		int gemiddeldeWillekeurigeGetallen = somWillekeurigeGetallen / aantalWillekeurigeGetallen;
		
		int[] willekeurigeGetallenSpecialeAfdruk = new int[aantalWillekeurigeGetallen];
		
		if (aantalWillekeurigeGetallen % 2 != 0) {
			int count = 0;
			
			for (int reversecount = aantalWillekeurigeGetallen - 1; reversecount >= 0; reversecount--) {
				willekeurigeGetallenSpecialeAfdruk[reversecount] = willekeurigeGetallen[count];
				count++;
			}
		} else {
			for (int count = 0; count < willekeurigeGetallen.length; count++) {
				willekeurigeGetallenSpecialeAfdruk[count] = willekeurigeGetallen[count];
			}
		}
		
		System.out.println("De array in speciale afdruk:");
		
		for(int willekeurigGetalSpecialeAfdruk : willekeurigeGetallenSpecialeAfdruk) {
			System.out.printf("%d ", willekeurigGetalSpecialeAfdruk);
		}
		
		System.out.println();
		System.out.println("De getallen die kleiner zijn dan het gemiddelde (= " + gemiddeldeWillekeurigeGetallen + "):");
		
		for(int willekeurigeGetalKleinerDanGemiddelde : willekeurigeGetallen) {
			if (willekeurigeGetalKleinerDanGemiddelde < gemiddeldeWillekeurigeGetallen) {
				System.out.printf("%d ", willekeurigeGetalKleinerDanGemiddelde);
			}
		}
		
		System.out.println();
		
		keyboard.close();
	}
}