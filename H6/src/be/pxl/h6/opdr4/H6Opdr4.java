package be.pxl.h6.opdr4;

public class H6Opdr4 {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("This is my first line of text");
		StringBuilder s2 = new StringBuilder("This is my second line of text");

		System.out.println(s1);
		System.out.println(s2);

		s1.append(" and this is what I added.");
		System.out.println(s1);

		s2.reverse();
		System.out.println(s2);
		
		int indexs1 = s1.indexOf(" ");
		
//		String string1 = null;

//		while (indexs1 != -1) {
//			string1 = s1.substring(0, indexs1 + 1).replaceAll(" ", "") + s1.substring(indexs1 + 1);
//			indexs1 = s1.indexOf(" ", indexs1 + 1);
//		}
		
//		System.out.println(string1);
		
		while (indexs1 != -1) {
			s1.deleteCharAt(indexs1);
			indexs1 = s1.indexOf(" ");
		}
		
		System.out.println(s1);
		
		int indexs2 = s2.indexOf("t");
		
//		String string2 = null;
		
//		while (indexs2 != -1) {
//			string2 = s2.substring(0, indexs2 + 1).replaceAll("t", "tt") + s2.substring(indexs2 + 1);
//			indexs2 = s2.indexOf("t", indexs2 + 1);
//		}
		
//		System.out.println(string2);
				
		while (indexs2 != -1) {
			s2.insert(indexs2, "t");
			indexs2 = s2.indexOf("t", indexs2 + 2);
		}
		
		System.out.println(s2);
	}
}