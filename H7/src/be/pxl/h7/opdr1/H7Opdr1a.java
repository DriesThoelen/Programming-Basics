package be.pxl.h7.opdr1;

public class H7Opdr1a {
	
	public static void main(String[] args) {
		
		int[] getallenreeks1 = new int[20];
		int[] getallenreeks2 = new int[10];
		int[] getallenreeks3 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
		boolean[] booleanreeks = {true, false, true, false, true, true, false, false};
		
		int count1;
		
		for(count1 = 0; count1 < getallenreeks1.length; count1++) {
			int getal1 = (count1 + 1) * 7;
			getallenreeks1[count1] = getal1;
		}
		
		System.out.printf("int[%d] getallenreeks1 = {", count1);
		
		for (int g1 : getallenreeks1) {
			if (g1 < getallenreeks1[19]) {
			System.out.printf(" %d,", g1);
			} else {
				System.out.printf(" %d ", g1);
			}
		}
		
		System.out.println("}");
		System.out.print("boolean[] booleanreeks = {");
		
		for (boolean b : booleanreeks) {
			System.out.printf(" %b,", b);
		}
		
		System.out.println(" }");

		int count2;
		
		for(count2 = 0; count2 < getallenreeks2.length; count2++) {
			int getal2 = count2 + (count2 + 1);
			getallenreeks2[count2] = getal2;
		}

		System.out.printf("int[%d] getallenreeks2 = {", count2);
		
		for (int g2 : getallenreeks2) {
			if (g2 < getallenreeks2[9]) {
				System.out.printf(" %d,", g2);
			} else {
				System.out.printf(" %d ", g2);
			}
		}
		
		System.out.println("}");
		System.out.print("int[] getallenreeks3 = {");
		
		for (int g3 : getallenreeks3) {
			if (g3 < getallenreeks3[9]) {
				System.out.printf(" %d,", g3);
			} else {
				System.out.printf(" %d ", g3);
			}
		}
		
		System.out.println("}");
	}
}