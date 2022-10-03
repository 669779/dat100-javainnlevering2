package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		//Lager en metode som skriver ut en matrise
		for (int[] rad: matrise) {
			for(int element: rad) { 
				System.out.print(element + "\t");
			}
				System.out.println();
		}
		

	}

	// b) 
	public static String tilStreng(int[][] matrise) {
		String utTxt="";
		for (int i=0; i<matrise.length; i++) {
			for (int j=0; j<matrise[i].length; j++) {
				utTxt = utTxt + matrise[i][j] + " ";
				
			}
			utTxt += "\n";	
		}
		return utTxt;	
	}

	// c) 
	public static int[][] skaler(int tall, int[][] matrise) {
	
//	for (int [] rad: matrise) {
//		for(int element: rad) {
//			System.out.print(element*tall + "\t");
//		}
//		
//		}
		
	
		int ant_rad = matrise.length;
		int ant_ele = matrise[0].length;
		
		int [][] nymatrise = new int [ant_rad] [ant_ele];
		
		
 	for (int i = 0; i < matrise.length; i++) {
 		
 		for (int [] ) {
 			
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

	    //int txt;
		//for (int i=0; i<matrise.length; i++) {
			//for (int j=0; j<i; j++) {
				//int h = matrise[i][j];
				//matrise[i][j] = matrise[j][i];
				//matrise[j][i] = h;
				//txt += h;
			//}
		//}
		//return txt;
		throw new UnsupportedOperationException("speile ikke implementert");
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
