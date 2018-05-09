package it.beije.formazione.maggio2018.base.snippet.datatypes;

import java.util.Date;

public class Letterali {
	
	private static Date d1;
	
	public static void main(String[] args) {
		
		String variabileUno = "variabile";
		int variabileDue = 5;
		short variabile = (short)1000000; //cast implicito per farlo short
		boolean variabileTre = true;
		double variabileQuattro = 5.4;
		float variabileCinque = (float) 5.4; //oppure aggiungo una f alla fine 5.4f
		char variabileSei ='a';
		char variabileSette = 12; // per il codice ASCII stampa un carattere.
		char variabileOtto = 30;
		char variabileNove=(char) (variabileSette + variabileOtto); //il + lo trasforma in un int. 
		int uno = Integer.MAX_VALUE;
		int due = 1;
		
		System.out.println(uno);
		System.out.println(due);
		int tre = uno + due;
		
		System.out.println(tre); //Si verifica overflow
		
		int cinque= 5;
		long l=10;
		System.out.println(cinque+l);
	
		
		int variabileBinaria = 0B10010;
		System.out.println(variabileBinaria);
		
		//0 è un ottale quindi il 19 non è ottale perciò è sbagliato
		int x= 019;
		System.out.println(x);
		
	}
		private static void lostReferences() {
		//2 modi di assegnare i tipi references;
		d1 = new Date(); 
		Date d2=d1;
		}

}
