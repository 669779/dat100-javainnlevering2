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

		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int summer(int[] tabell) {
		//Utvidet for-løkke
		int sumUtvid = 0;
		for (int tall : tabell) {
			sumUtvid = sumUtvid + tall; 
		}
		//For-løkke
		int sumFor = 0;
		for (int a=0; a<tabell.length; a++) {
			sumFor = sumFor + tabell[a];
		}
		 //While-løkke
		int sumWhile= 0;
		int b=0;
		while (b<tabell.length) {
			sumWhile = sumWhile + tabell[b];
			b++;   //Denne må stå nederst fordi denne sier b+1
		}
		return sumWhile;
		
		//throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
	//bruke ei løkke istaden for å søke ettte verdien og printe ut tabellen
		
		boolean tallFinnes =false;
		int b=0;
		while ((b<tabell.length) && !tallFinnes) {
				if (tall == tabell[b]) {
					tallFinnes = true; 
				} 
			b++; 
		}
		return tallFinnes;

		
		
		//throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	//public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		//throw new UnsupportedOperationException("posisjonTall ikke implementert");

	

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
