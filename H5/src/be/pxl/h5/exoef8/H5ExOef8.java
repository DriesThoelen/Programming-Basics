package be.pxl.h5.exoef8;

public class H5ExOef8 {

	public static void main(String[] args) {
		int getal1 = 103;
		int getal2 = 102;
		int getal3 = 101;
		
		int kleinsteGetal;
		int middelsteGetal;
		int grootsteGetal;
		
		
		if (getal1 < getal2) {
			if (getal1 < getal3) {
				if (getal2 < getal3) {
					//System.out.println(getal1 + "<" + getal2 + "<" + getal3);
					kleinsteGetal = getal1;
					middelsteGetal = getal2;
					grootsteGetal = getal3;
				} else {
					//System.out.println(getal1 + "<" + getal3 + "<" + getal2);
					kleinsteGetal = getal1;
					middelsteGetal = getal3;
					grootsteGetal = getal2;
				}
			} else {
				if (getal2 < getal3) {
					//System.out.println(getal2 + "<" + getal3 + "<" + getal1 + "IMPOSSIBLE : want getal1 is kleiner dan getal2 maar groter dan getal3");
					kleinsteGetal = getal2;
					middelsteGetal = getal3;
					grootsteGetal = getal1;
					System.out.println("IMPOSSIBLE : want getal1 is kleiner dan getal2 maar groter dan getal3");
				} else {
					//System.out.println(getal3 + "<" + getal1 + "<" + getal2);
					kleinsteGetal = getal3;
					middelsteGetal = getal1;
					grootsteGetal = getal2;
				}
			}
		} else {
			if (getal1 < getal3) {
				if (getal2 < getal3) {
					//System.out.println(getal2 + "<" + getal1 + "<" + getal3);
					kleinsteGetal = getal2;
					middelsteGetal = getal1;
					grootsteGetal = getal3;
				} else {
					//System.out.println(getal3 + "<" + getal2 + "<" + getal1 + "IMPOSSIBLE : want getal1 is kleiner dan getal3 maar groter dan getal2");
					kleinsteGetal = getal3;
					middelsteGetal = getal2;
					grootsteGetal = getal1;
					System.out.println("IMPOSSIBLE : want getal1 is kleiner dan getal3 maar groter dan getal2");
				}
			} else {
				if (getal2 < getal3) {
					//System.out.println(getal2 + "<" + getal3 + "<" + getal1);
					kleinsteGetal = getal2;
					middelsteGetal = getal3;
					grootsteGetal = getal1;
				} else {
					//System.out.println(getal3 + "<" + getal2 + "<" + getal1);
					kleinsteGetal = getal3;
					middelsteGetal = getal2;
					grootsteGetal = getal1;
				}
			}
		}
		System.out.println(kleinsteGetal + "<" + middelsteGetal + "<" + grootsteGetal);
	}
}