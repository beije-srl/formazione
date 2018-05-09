package datatypes;

import java.util.Date;

public class Letterali {
	private static Date d1;
	public static void main(String[] args) {
		
		String variabileUno = "variabile";
		int variabileDue = 5;
		short variabile = (short)1000000; //troppo grande per lo short questo int questo gli devo dare un cast implicito per farlo short
		boolean variabileTre = true;
		double variabileQuattro = 5.4;
		float variabileCinque = (float) 5.4; //con un cast esplicito il compilatore non lo vede come un double oppure aggiungo una f alla fine 5.4f
		char variabileSei ='a';
		char variabileSette = 12; // per il codice ASCII stampa un carattere. Posso mettere numero dallo 0 fino alle 
		char variabileOtto = 30;
		char variabileNove=(char) (variabileSette + variabileOtto); //il + lo trasforma in un int. quano faccio una somma di due interi il risutato + o un int o la classe superiore a int
	
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
		private static void d() {
		//2 modi di assegnare i tipi references;
		d1 = new Date(); // se lo inizializzo dichiaro e lo inizializzo qui posso usarlo solo nel metodo invece fuori dal metodo cioè lo dichiaro nel campo mantego il referimento e non lo perdo
		Date d2=d1;
		}

}
