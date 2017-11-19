package be.pxl.h5.opdr4;

public class H5Opdr4b {

	public static void main(String[] args) {
		int a = 9;
		int b = 2;
		int c = 5;
		double opl1;
		double opl2;
		double opl3;

		opl1 = c - a / b + 9;
		opl2 = 4 * a / c / b;
		opl3 = 4.0 * a / c / b;

		System.out.println(opl1);
		System.out.println(opl2);
		System.out.println(opl3);
	}
}