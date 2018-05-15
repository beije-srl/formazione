package it.beije.ordineinit.amir;

public class Init {
	
	
	//Primo
	private static int b=10;
	
	{
		if(b!=12) {
			display();
			{
				System.out.println("This is Instance initializer block");
			}
		}
			display();
			
		}
	{
		System.out.println(b);
	}
	
	static {
		System.out.println("welcome");
	}
	
	void display(){
		System.out.println("Display method");
	}
	public Init() {
		System.out.println("Class Init Constructor");
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(Init.b);
		Init obj = new Init();		
	}
	
//Secondo
	
	
	
	
	
}
