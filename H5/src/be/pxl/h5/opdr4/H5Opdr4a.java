package be.pxl.h5.opdr4;

public class H5Opdr4a {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		int c = 6;
		int opl1;
		int opl2;
		int opl3;
		int opl4;

		opl1 = c - a / b + 9;
		opl2 = 4 * a / c / b;
		opl3 = 4 * (a / c) / b;
		opl4 = a - c % 4 / b;

		System.out.println(opl1);
		System.out.println(opl2);
		System.out.println(opl3);
		System.out.println(opl4);
	}
}