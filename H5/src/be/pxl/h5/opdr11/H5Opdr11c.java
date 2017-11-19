package be.pxl.h5.opdr11;

public class H5Opdr11c {

	public static void main(String[] args) {
		int a;
		int b;

//		a = 5;
//		b = 3;
//		if (a < b)
//			a = 2 * a;
//		b = a + b;

//		a = 5;
//		b = 3;
//		if (a < b) {
//			a = 2 * a;
//			b = a + b;
//		}

//		a = 3;
//		b = 5;
//		if (a < b)
//			a = 2 * a;
//		b = a + b;

		a = 3;
		b = 5;
		if (a < b) {
			a = 2 * a;
			b = a + b;
		}

		System.out.println(a);
		System.out.println(b);
	}
}