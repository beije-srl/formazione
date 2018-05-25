import java.io.IOException;

public class Calcolatrice {

	public static String calcola(String num1, String num2, String operatore) {

		int risultato = 0;
		int numUno = Integer.parseInt(num1);
		int numDue = Integer.parseInt(num2);
		switch (operatore) {
		case "SOMMA":
			risultato = numUno + numDue;
			break;
		case "DIFFERENZA":
			risultato = numUno - numDue;
			break;
		case "MOLTIPLICAZIONE":
			risultato = numUno * numDue;
			break;
		case "DIVISIONE":
			risultato = numUno / numDue;
			break;
		default:
			System.out.println("Operazione non riconosciuta");
			break;
		}
		return Integer.toString(risultato);

	}

}
