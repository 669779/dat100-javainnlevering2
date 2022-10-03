package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		int rad = 2;
		int kolonne = 3;
		String [][] matrix = new String [rad][kolonne];
		
		System.out.println("hei");
		
		{
				
				
		}
	}

	// b) 
	public static String tilStreng(int[][] matrise) {

		String utTxt=""; //new String[][];
		for (int i=0; i<matrise.length; i++) {
			//System.out.println();
			for (int j=0; j<matrise[i].length; j++) {
				utTxt = utTxt + matrise[i][j] + " ";
				//System.out.print(matrise[i][j] + " ");
				
			}
			utTxt += "\n";	
		}
		return utTxt;
		

		
	}

	// c) 
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		boolean matriseLik = false;
		for (int i=0; i<a.length; i++) {
			for (int j=0; j< b[i].length; j++) {
		
		if (a.equals(b)) {
			matriseLik = true;
		}
		}
		}
		
		return matriseLik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int txt;
		for (int i=0; i<matrise.length; i++) {
			for (int j=0; j<i; j++) {
				int h = matrise[i][j];
				matrise[i][j] = matrise[j][i];
				matrise[j][i] = h;
				txt += h;
			}
		}
		return txt;
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
