package be.pxl.h7.oef3;

import java.util.Scanner;

public class H7Oef3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int aantalPositieveGetallen = 0;
		int aantalNegatieveGetallen = 0;
		int kleinsteNegatieveGetal = Integer.MAX_VALUE;
		int[] getallen = new int[10];
		int[] posTemporary = new int[10];
		int[] negTemporary = new int[10];

		for (int count = 0; count < getallen.length; count++) {
			System.out.println("Geef een getal in");
			int getal = keyboard.nextInt();
			getallen[count] = getal;
			if (getallen[count] < 0) {
				negTemporary[0 + aantalNegatieveGetallen] = getallen[count];
				if (getallen[count] < kleinsteNegatieveGetal) {
					kleinsteNegatieveGetal = getallen[count];
				}
				aantalNegatieveGetallen++;
			} else {
				posTemporary[0 + aantalPositieveGetallen] = getallen[count];
				aantalPositieveGetallen++;
			}
		}
		
		int[] pos = new int[aantalPositieveGetallen];
		int[] neg = new int[aantalNegatieveGetallen];
		
		for(int i = 0; i < aantalPositieveGetallen; i++) {
			pos[i] = posTemporary[i];
		}
		
		for(int j = 0; j < aantalNegatieveGetallen; j++) {
			neg[j] = negTemporary[j];
		}
		
		if (aantalPositieveGetallen != 0) {
			System.out.printf("int[%d] pos =  {", aantalPositieveGetallen);
			
			for(int positiefGetal : pos) {
					System.out.printf(" %d ", positiefGetal);
			}
			
			System.out.println("}");
			
		} else {
			System.out.println("De array pos[] is leeg");
		}
		
		if (aantalNegatieveGetallen != 0) {
			System.out.printf("int[%d] neg =  {", aantalNegatieveGetallen);
			
			for(int negatiefGetal : neg) {
					System.out.printf(" %d ", negatiefGetal);
			}
			
			System.out.println("}");
			
		} else {
			System.out.println("De array neg[] is leeg");
		}
		
		System.out.println("Kleinste getal van array neg : " + kleinsteNegatieveGetal);
		
		keyboard.close();
	}
}