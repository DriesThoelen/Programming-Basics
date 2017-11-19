package be.pxl.h7.oef2;

import java.util.Random;

public class H7Oef2 {

	public static void main(String[] args) {
		Random rand = new Random();
		long[] getallen = new long[500];
		long somGroterDan100 = 0;
		
		for(int count = 0; count < getallen.length; count++) {
			long getal = rand.nextInt();
			getallen[count] = getal;
			if (getallen[count] > 100) {
				somGroterDan100 += getallen[count];
			}
		}
		System.out.println("Som elementen van array groter dan 100 : " + somGroterDan100);
	}
}