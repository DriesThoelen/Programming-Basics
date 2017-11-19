package be.pxl.h6.exoef4;

public class H6ExOef4 {

	public static void main(String[] args) {
		StringBuilder tekstBuilder = new StringBuilder();

		tekstBuilder.setLength(26);

		for (int count = 0; count < 26; count++) {
			tekstBuilder.setCharAt(count, (char) (count + 97));
		}

		System.out.println(tekstBuilder);

		for (int count = 0; count < 26; count++) {
			if (count % 2 != 0) {
				tekstBuilder.setCharAt(count, (char) (count + 65));
			}
		}
		
		System.out.println(tekstBuilder);
		
		tekstBuilder.replace(tekstBuilder.indexOf("H"), (tekstBuilder.indexOf("H") + 1), "X");
		
		System.out.println(tekstBuilder);

	}

}
