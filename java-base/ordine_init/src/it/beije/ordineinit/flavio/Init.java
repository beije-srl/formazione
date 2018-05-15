package it.beije.ordineinit.flavio;

public class Init {
	
	static String s;
	static int b;
	String c;
	int a = 5;

	public Init() {

	}

	static {
		System.out.println("blocco statico");
	}

	{
		System.out.println("ciao");
	}

	static {
		int a = 65;
		System.out.println(a);
	}

	{
		String f = "hello";
		System.out.println(f);
	}

	static {
		int t = 5;
		System.out.println(t);
	}

	static String d;
	String r;

	public void _c (){
		int g = 5;
		String f = "patate";
		System.out.println(g+f);
	}

	String f = "patate";

	public class Ordine{

		int a;

		{
			System.out.println(a);
		}
		
		public void Patate(){
			int t = 5;
			System.out.println(t);
		}

		{

			System.out.println("Hello");
		}

	}
	
	public class Static{

	}

}
