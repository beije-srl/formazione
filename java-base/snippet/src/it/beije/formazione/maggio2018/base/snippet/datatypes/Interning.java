package it.beije.formazione.maggio2018.base.snippet.datatypes;

public class Interning {

	int variabileistanza;
	static int variabileclasse;

	public static void main(String[] args) {
		
		String s1 = "ciao"; 
		String s2 = "ciao"; 
		String s3 = "ci" + "ao";
		System.out.println(s1==s3);
		 

		Interning n = new Interning();
		System.out.println(n.variabileistanza); 
		System.out.println(variabileclasse); 
		
		int a = 5;
		int b = -a;

		boolean c = !true; // posso solo negare un booleano(NO UN INTERO)

		System.out.println(a % 5);

		boolean isInterning = n instanceof Interning;
		System.out.println(isInterning);

		boolean and = true & false; // da false perche true è 1 e invece false è
									// 0 quindi con l'AND darà 0

		int andInt = 10 & 2;
		System.out.println(andInt); // con i numeri interi non posso usare le
									// doppie && e ||

		String ternario = a == 5 ? "vero" : "false"; // Operatore ternario

		float floatSum = a + 5.4f; // convertito al tipo di dato decimale che
									// stiamo usando. Se uso un float il tipo
									// intero diventa di tipo float e posso
									// metterlo dentro una varibile di tipo
									// float e double.
									// Per uno di tipo double l'intero diventa
									// double

		short y = 4;
		short z = 5;
		double x = y + z; // short promosso a intero e poi castato in un double.
						

		short q = 4;
		q++; //q è sempre uno short 
	}

}
