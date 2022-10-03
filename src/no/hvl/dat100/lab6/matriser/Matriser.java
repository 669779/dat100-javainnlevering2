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

		// TODO
		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
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

		// TODO
		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
