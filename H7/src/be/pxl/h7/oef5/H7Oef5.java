package be.pxl.h7.oef5;

import java.awt.Point;
import java.awt.Rectangle;

public class H7Oef5 {

	public static void main(String[] args) {
		
		int[] x = { 1, 1, 2, 4, 0 };
		int[] y = { 1, 0, 2, 1, 2 };
		Point[] punt = new Point[x.length];
		
		for (int count = 0; count < y.length; count++) {
			punt[count] = new Point(x[count], y[count]); 
		}
		
		Rectangle[] rect = new Rectangle[5];
		
		for(int count = 0; count < punt.length; count++) {
			rect[count] = new Rectangle(x[count], y[count], 1, 3);
		}
		
		for(int rechthoeknummer = 0; rechthoeknummer < rect.length; rechthoeknummer++) {
			System.out.printf("%s %d%s %2s %d %4s %d %4s %d %4s %d %n", "Rechthoek nummer", rechthoeknummer + 1, ":", "x =", (int)rect[rechthoeknummer].getX(), "y =", (int)rect[rechthoeknummer].getY(), "h =", (int)rect[rechthoeknummer].getHeight(), "b =", (int)rect[rechthoeknummer].getWidth());
		}
		
		rect[4].setBounds(0, 0, 3, 2);
		
		for (int rechthoeknummer = 0; rechthoeknummer < rect.length; rechthoeknummer++) {
			System.out.printf("%s %d %s", "Rechthoek nummer", rechthoeknummer + 1, "bevat:");
			for (int puntnummer = 1; puntnummer < punt.length; puntnummer++) {
				if (rect[rechthoeknummer].contains(punt[puntnummer - 1])) {
					System.out.printf("%s %s %d %s", "", "punt nr", puntnummer, "");
				}
			}
			System.out.println();
		}
		
		System.out.printf("%s", "Rechthoeken die rechthoek nr 5 snijden:");
		for(int rechthoeknummer = 0; rechthoeknummer < rect.length; rechthoeknummer++) {
			if ((rect[4].intersects(rect[rechthoeknummer])) && (rechthoeknummer != 4)) {
				System.out.printf("%s %s %d %s", "", "rechthoek nr", rechthoeknummer + 1, "");
			}
		}
	}
}