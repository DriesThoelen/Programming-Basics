package be.pxl.h7.opdr1;

public class H7Opdr1c {

	public static void main(String[] args) {
		int[] a = new int[6];
		int[] b = new int[6];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = i * 2;
			b[i] = a[i];
		}
		b[5] = 99;
		
		for(int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] = %2d b[%d] = %2d %n", i, a[i], i, b[i]);
		}

	}
}