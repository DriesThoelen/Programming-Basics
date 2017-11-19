package be.pxl.h5.opdr9;

public class H5Opdr9 {

	public static void main(String[] args) {
		int x = 30;
		int y = 40;
		int a = 10;
		int b = 5;

		System.out.println(x + 2 < y || !(y == 40 && a * 2 > 5));
		System.out.println(!(x + y < 10 || a == 9) && b > 3);
		System.out.println(x + y != 100 || (a == 1 && b > 3));
	}
}