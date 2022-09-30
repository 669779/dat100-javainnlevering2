package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("[ ");
		for (int tall : tabell) {
			System.out.print(tall + " ");
		}
		System.out.println("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {

	
		String tekst = "[";	
		for (int i=0; i<tabell.length; i++) {
			tekst = tekst + tabell[i];
			if (i<tabell.length-1) {
				tekst = tekst + ",";
			}
			
		}
			
		tekst = tekst + "]";
		return tekst;
	}
	
	// c)
	public static int summer(int[] tabell) {

		//Utvidet for-lokke
		int sumUtvid = 0;
		for (int tall : tabell) {
			sumUtvid = sumUtvid + tall; 
		}
		//For-lokke
		int sumFor = 0;
		for (int a=0; a<tabell.length; a++) {
			sumFor += tabell[a];
		}
		 //While-lokke
		int sumWhile= 0;
		int b=0;
		while (b<tabell.length) {
			sumWhile = sumWhile + tabell[b];
			b++;   //Denne m� st� nederst fordi denne sier b+1
		}
		return sumWhile;
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean tallFinnes =false;
		int b = 0;
		while ((b<tabell.length) && !tallFinnes) {
				if (tall == tabell[b]) {
					tallFinnes = true; 
				} 
			b++; 
		}
		return tallFinnes;
	}
		

	// e) Bodil
	public static int posisjonTall(int[] tabell, int tall) { 
		for (int c=0; c<tabell.length; c++) {
			if (tabell[c]==tall) {
				return c;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g) Bodil
	public static boolean erSortert(int[] tabell) {
		
		for (int d=0; d<tabell.length-1; d++) {
			if (tabell[d] > tabell[d+1]) {
				return false;
			}
		}
		return true;
		//throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
