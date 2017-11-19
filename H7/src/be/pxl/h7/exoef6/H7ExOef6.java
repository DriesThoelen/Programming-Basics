package be.pxl.h7.exoef6;

public class H7ExOef6 {

	public static void main(String[] args) {
		int[][] enquete = { { 25, 36, 55, 46, 38 }, { 35, 45, 54, 65, 1}, { 75, 66, 44, 10, 5 }, { 23, 33, 45, 50, 49 } };
		String[] vragen = { "Vraag1", "Vraag2", "Vraag3", "Vraag4" };
		double hoogsteGewogenGemiddelde = 0;
		int hoogsteGewogenGemiddeldeVraag = -1;
	
		double[] gewogengemiddelde = new double[4];
		
		for(int vraag = 0; vraag < enquete.length; vraag++) {
			for(int antwoord = 0; antwoord < enquete[vraag].length; antwoord++) {
				gewogengemiddelde[vraag] += (double)enquete[vraag][antwoord] * (antwoord + 1);
			}
			gewogengemiddelde[vraag] /= 200;
		}
		
		for(int vraag = 0; vraag < enquete.length; vraag++) {
			if (gewogengemiddelde[vraag] > hoogsteGewogenGemiddelde) {
				hoogsteGewogenGemiddelde = gewogengemiddelde[vraag];
				hoogsteGewogenGemiddeldeVraag = vraag;
			}
		}
		
		for(int vraag = 0; vraag < enquete.length; vraag++) {
				System.out.printf("Het gewogen gemiddelde voor %s is %.2f %n", vragen[vraag], gewogengemiddelde[vraag]);
		}
		
		System.out.printf("Het hoogste gewogen gemiddelde bedraagt %.2f; Dit is het gewogen gemiddelde van %s %n", hoogsteGewogenGemiddelde, vragen[hoogsteGewogenGemiddeldeVraag]);
	}
}