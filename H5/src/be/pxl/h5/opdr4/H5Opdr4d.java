package be.pxl.h5.opdr4;

public class H5Opdr4d {

	public static void main(String[] args) {
		int x, z;
		double y1;
		double y2;
		double y3;

		x = 7;
		z = 2;
		y1 = x / z;
		System.out.println(y1);

		y2 = (double) x / z;
		System.out.println(y2);

		y3 = (double) (x / z);
		System.out.println(y3);
	}
}