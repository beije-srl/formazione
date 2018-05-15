package it.beije.ordineinit.giovanni;

public class Carogna {

	static int a = 8;
	static String s1 = "18";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		Init ini = new Init(s1);
		
		System.out.println(ini.s1);
		
		Init ini2 = new Init("Stringa vuota!");
		
		System.out.println(Init.canaglia(ini2.s2));
		
		System.out.println(a);
	}

}
