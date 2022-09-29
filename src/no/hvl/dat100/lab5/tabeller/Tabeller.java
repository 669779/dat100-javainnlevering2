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

		for (int i = 0; i<tabell.length; i++) {
			tekst = tekst + tabell[i];
			if (i< tabell.length-1) {
				tekst = tekst + ",";
			}
			
		}
		
		
		tekst = tekst + "]";
		
		return tekst;
		

		
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int summer(int[] tabell) {
		int sumFor = 0;
		for (int a=0; a<tabell.length; a++) {
			sumFor = sumFor + tabell[a];
		}
		
		
		int sumUtvid = 0;
		for (int tall : tabell) {
			sumUtvid = sumUtvid + tall;
					
		}
		
		int sumWhile = 0;
		int b = 0;
		while (b < tabell.length) {
			sumWhile = sumWhile + tabell[b];
			b++;
		}
		return sumWhile; 
		
		//throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		//bruke en løkke for å søke etter verdien og printe ut
		
		boolean tallFinnes = false;
		int b = 0;
		while (b < tabell.length && ) {
			sumWhile = sumWhile + tabell[b];
			b++;
		}
		return funnet;
		
		
		for (int tall = 0; tall!=tabell; tall++) {
			if (tall)
		}
		
		int c = 0;
		boolean tallFinnes;
		if (c==1 || c==4 || c== 6) {
			tallFinnes = true;
		} else {
			tallFinnes = false;
		}
		
		return tallFinnes;
		//throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

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
