package it.beije.formazione.maggio2018.base.snippet.datatypes;

public class Ricorsione {
	

	public static void main(String[] args) {
		
		System.out.println(Ricorsione.fibonacci(4));
		System.out.println(Ricorsione.fattoriale(6));
		System.out.println(Ricorsione.fattoriale(8));
		
	}
	
	public static int fattoriale(int num) {
		if(num==0){
			return 1;
		}else{
		return num*fattoriale(num-1);
		}
	}
	
	public static int fibonacci(int indice){
		int result=0;
		if (indice == 1) 
			result = 0;
		else
			if (indice == 2) 
				result = 1;
			else
				result = fibonacci(indice-2) + fibonacci(indice-1);
			return result;
			
		}
	
		
		
}





