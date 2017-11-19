package be.pxl.h5.opdr4;

public class H5Opdr4f {

	public static void main(String[] args) {
		int i1, iwaarde;
		float f1, f2, f3, fwaarde;

		iwaarde = 22;
		fwaarde = 4.9F;

		f1 = iwaarde;
		i1 = (int) fwaarde;
		f2 = (float) ((5 + 6) / 2);
		f3 = (float) (5 + 6) / 2;

		System.out.println("f wordt? " + f1);
		System.out.println("i wordt? " + i1);
		System.out.println("f wordt? " + f2);
		System.out.println("f wordt? " + f3);
	}
}