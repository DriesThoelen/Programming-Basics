package be.pxl.h6.oef7;

import java.awt.Point;

public class H6Oef7 {

	public static void main(String[] args) {
		Point p1 = new Point();

		p1.setLocation(5, 8);
		// OF p1.move(5, 8);

		Point p2 = new Point(p1);

		System.out.print("p1.equals(p2) -> " + p1.equals(p2));

		if (p1.equals(p2)) {
			System.out.print(" -> dus dezelfde waarde voor x en y" + "\n");
		} else {
			System.out.print(" -> dus niet dezelfde waarde voor x en y" + "\n");
		}

		System.out.print("p1 == p2 -> " + (p1 == p2));
				
		if (p1 == p2) {
			System.out.print(" -> dus hetzelfde Point-Object" + "\n");
		} else {
			System.out.print(" -> dus niet hetzelfde Point-Object" + "\n");
		}
		
		p2.translate(2, 3);

		double xp1 = p1.getX();
		double yp1 = p1.getY();
		double xp2 = p2.getX();
		double yp2 = p2.getY();

		System.out.println("de x en y voor p1 zijn : " + (int) xp1 + "-" + (int) yp1);
		System.out.println("de x en y voor p2 zijn : " + (int) xp2 + "-" + (int) yp2);
	}
}