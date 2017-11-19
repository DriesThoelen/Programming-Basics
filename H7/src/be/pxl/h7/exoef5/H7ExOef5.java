package be.pxl.h7.exoef5;

import java.util.Scanner;

public class H7ExOef5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int[][] tabel = new int[4][3];
		int[] somRij = new int[4];
		
		for(int rij = 0; rij < tabel.length; rij++) {
			for(int kolom = 0; kolom < tabel[rij].length; kolom++) {
				System.out.printf("Geef een getal in voor rij %d kolom %d %n", rij + 1, kolom + 1);
				tabel[rij][kolom] = keyboard.nextInt();
			}
		}
		
		for(int rij = 0; rij < tabel.length; rij++) {
			for(int kolom = 0; kolom < tabel[rij].length; kolom++) {
				 somRij[rij] += tabel[rij][kolom];
			}
		}
		
		for(int rij = 0; rij < tabel.length; rij++) {
			System.out.printf("Som van rij %d = %d %n", rij + 1, somRij[rij]);
		}
		
		keyboard.close();
	}
}