package be.pxl.h7.exoef1;

import java.util.Scanner;

public class H7ExOef1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Geef het aantal waaruit de rij moeten bestaan");
		int n = keyboard.nextInt();
		
		int[] a = new int[n];
		
		int count;
		
		for(count = 0; count < a.length; count++) {
			System.out.println("Geef een getal in");
			int getal = keyboard.nextInt();
			a[count] = getal;
		}
		
		System.out.print("int[] a = { ");
		for(int aReeksgetal : a) {
				System.out.print(aReeksgetal + " ");
		}
		System.out.println("}");
		
		int[] aNaVerschuiving = new int[n];
		
		for(count = 0; count < aNaVerschuiving.length; count++) {
			if (count != aNaVerschuiving.length - 1) {
				aNaVerschuiving[count] = a[count + 1];
			} else {
				aNaVerschuiving[count] = a[0];
			}
		}
		
		System.out.print("int[] a (na verschuiving) = { ");
		for(int aReeksgetalNaVerschuiving : aNaVerschuiving) {
				System.out.print(aReeksgetalNaVerschuiving + " ");
		}
		System.out.println("}");
		
		keyboard.close();

	}
}