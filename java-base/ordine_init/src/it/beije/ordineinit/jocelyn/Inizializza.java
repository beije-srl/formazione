package it.beije.ordineinit.jocelyn;

public class Inizializza {
	
	static int c;
	
	public static void numero(int a){
		System.out.println(" numero " + a);
	}
	
	
	
	static	{
		System.out.print("stampa ");
		numero(5);
	}
	
	{  System.out.print("stampa "); numero(7); }
	
	
	public Inizializza(String parola){
		System.out.println("Costruttore con parametro " + parola);
	}
	
	public Inizializza(){
		System.out.println("Costruttore senza parametri!");
	}
	
	
	static{
		System.out.println("crea oggetto");
		new Inizializza();
	}
	
	
	public static void main(String[] args) {
		System.out.println("Entro nel main");
		if(c==0){
			System.out.println("Entro nell'if");
			new Inizializza("hola");
		}
		
	}
	
	
}
