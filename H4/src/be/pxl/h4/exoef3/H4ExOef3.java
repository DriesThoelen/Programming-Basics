package be.pxl.h4.exoef3;

public class H4ExOef3 {

	public static void main(String[] args) {
		for (int count = 1; count < 101; count++) {
			int kwcount = count * count;
			System.out.printf("%10s%10s\n", count, kwcount);
		}
	}
}