package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("[ ");
		for (int tall : tabell) {
			System.out.print(tall + " ");
		}
		System.out.println("]");
		
		//throw new UnsupportedOperationException("skrivUt ikke implementert");

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
		

		
		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		


	// c)
	public static int summer(int[] tabell) {

		//Utvidet for-l�kke
		int sumUtvid = 0;
		for (int tall : tabell) {
			sumUtvid = sumUtvid + tall; 
		}
		//For-l�kke
		int sumFor = 0;
		for (int a=0; a<tabell.length; a++) {
			sumFor += tabell[a];
		}
		 //While-l�kke
		int sumWhile= 0;
		int b=0;
		while (b<tabell.length) {
			sumWhile = sumWhile + tabell[b];
			b++;   //Denne m� st� nederst fordi denne sier b+1
		}
		return sumWhile;
		
		//throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

	//bruke ei l�kke istaden for � s�ke ettte verdien og printe ut tabellen
		
		boolean tallFinnes =false;
		int b=0;
		while ((b<tabell.length) && !tallFinnes) {
				if (tall == tabell[b]) {
					tallFinnes = true; 
				} 
			b++; 
		}
		return tallFinnes;
	}
		
		


	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int [] reverserTabell = new int[tabell.length];
		
		int reverser = tabell.length -1;
		for(int c = 0; c < tabell.length; c++) {
			reverserTabell[c] = tabell[reverser];
			reverser--;
		}
		return reverserTabell;
		//throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyLengde = tabell1.length + tabell2.length;
		int [] nyTabell = new int [nyLengde];
		
		for(int d = 0; d < tabell1.length; d++) {
			nyTabell[d]=tabell1[d];
		}
		for (int e = 0; e < tabell2.length; e++) {
			nyTabell[tabell1.length + e]=tabell2[e]; 
		}
		return nyTabell;
		//throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
