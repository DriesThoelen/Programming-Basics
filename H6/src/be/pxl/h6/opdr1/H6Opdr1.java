package be.pxl.h6.opdr1;

import java.util.Random;

public class H6Opdr1 {

	public static void main(String[] args) {
		Random rand = new Random();
		
// 		int willekeurigGetal = rand.nextInt();
		
//		for (int count = 1; count <= 20; count++) {
//			int willekeurigGetal = rand.nextInt(11);
//			System.out.println(willekeurigGetal);
//		}
		
//		int count = 1;
		
/*		do {
			int willekeurigGetal = rand.nextInt(31);
			if (willekeurigGetal >= 19) {
			System.out.println(willekeurigGetal);
			count++;
			}
		} while (count <= 10);
*/ //NIET PERFORMANT GENOEG, want extra if test
		
		for (int count = 1; count <= 10; count++) {
			int willekeurigGetal = rand.nextInt(11) + 20; // .nextInt(maxWa - minWa + 1) + minWa;
			System.out.println(willekeurigGetal);		  //			30	-	20	+ 1	 + 20;
		}
		
	}
}