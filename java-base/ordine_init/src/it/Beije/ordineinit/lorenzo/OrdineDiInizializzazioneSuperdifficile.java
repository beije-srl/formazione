package it.beije.ordineinit.lorenzo;

public class OrdineDiInizializzazioneSuperdifficile {

	public int difficolta = 0;

	private OrdineDiInizializzazioneSuperdifficile() {
		System.out.println("questo è un costruttore");
		System.out.println("modalità difficile attivata:" + difficile);
		if (difficolta > 9000) {
			System.out.println("difficoltà is over nine thousand");
		} else {
			System.out.println("tsè, facilissimo!");
		}
	}

	public static void OrdineDiInizializzazioneSuperdifficile() {
	}

	private void difficultyIncreaser() {
		difficolta++;
		if (difficolta < 9000) {
			difficultyIncreaser();
		}
	}

	public static boolean difficile;

	public static OrdineDiInizializzazioneSuperdifficile Costruttore() {
		System.out.println("sto per creare un oggetto");
		return new OrdineDiInizializzazioneSuperdifficile();
	}

	{
		System.out.println("il codice sta diventando più difficile");
		difficultyIncreaser();
		difficolta++;
	}

	static {
		difficile = !difficile;
	}

}
