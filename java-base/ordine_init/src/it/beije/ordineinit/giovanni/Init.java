package it.beije.ordineinit.giovanni;

public class Init {

	int a = 7;
	String s1;

	{
		int a = 8;
		System.out.println(a);
	}

	protected Init() {
		c = c++;
		System.out.println(s1 + c);
		System.out.println(a);
	}
	
	protected Init(String s1) {
		s1 = s1;
	}

	static int c = 0;
	public String s2 = canaglia("Prova");
	
	private static int canaglia(int c){
		System.out.println(c);
		return c++;
	}
	
	public static String canaglia(String c){
		System.out.println(c);
		return "Costruttore";
	}
	static {
		int a = 9;
		a = canaglia(a);
		System.out.println(a);
	}
}
