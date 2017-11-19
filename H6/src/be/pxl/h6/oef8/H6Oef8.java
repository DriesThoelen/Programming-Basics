package be.pxl.h6.oef8;

import java.awt.Point;
import java.awt.Rectangle;

public class H6Oef8 {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(1, 2, 20, 30);
		Point punt = new Point(5, 5);
		
		System.out.print("rect.contains(punt) -> " + rect.contains(punt));
		if (rect.contains(punt)) {
			System.out.print(" -> dus Point punt bevindt zich in Rectangle rect" + "\n");
		} else {
			System.out.print(" -> dus Point punt bevindt zich niet in Rectangle rect" + "\n");
		}
		
		punt.translate(40, 50);
		
		Rectangle rect2 = new Rectangle((int)punt.getX(), (int)punt.getY(), 100, 110);
		double xrect2 = rect2.getX();
		double yrect2 = rect2.getY();
		
		System.out.println("de x en y voor rect2 zijn : " + (int)xrect2 + "-" + (int)yrect2);
		
		System.out.print("rect2.contains(punt) -> " + rect2.contains(punt));
		if (rect2.contains(punt)) {
			System.out.print(" -> dus Rectangle rect bevindt zich in Rectangle rect2" + "\n");
		} else {
			System.out.print(" -> dus Rectangle rect bevindt zich niet in Rectangle rect2" + "\n");
		}
		
		/*
		 * kr.grow(20, 10); // eerste horizontaal, dan vertikaal, breedte is nu
		 * 60, hoogtee 50 niet alleen de rechthoek wordt groter gemaakt, het 
		 * hoekpunt verplaatst zich ook.
		 */
		
		rect.setSize(rect.width + 40, rect.height + 80);
		
		double hrect = rect.getHeight();
		double hrect2 = rect.getHeight();
		
		System.out.println("De hoogte van Rectangle rect bedraagt " + hrect);
		System.out.println("De hoogte van Rectangle rect2 bedraagt " + hrect2);
		
		if (hrect == hrect2) {
			System.out.println("De hoogten van Rectangles rect en rect2 zijn gelijk");
		} else {
			System.out.println("De hoogten van Rectangles rect en rect2 zijn niet gelijk");
		}
	}
}