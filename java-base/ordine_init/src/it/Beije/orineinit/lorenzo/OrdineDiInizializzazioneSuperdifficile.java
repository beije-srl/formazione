package it.Beije.orineinit.lorenzo;

public class OrdineDiInizializzazioneSuperdifficile {

	public int difficolta = 0;

	private OrdineDiInizializzazioneSuperdifficile() {
		System.out.println("questo � un costruttore");
		System.out.println("modalit� difficile attivata:" + difficile);
		if (difficolta > 9000) {
			System.out.println("difficolt� is over nine thousand");
		} else {
			System.out.println("ts�, facilissimo!");
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
		System.out.println("il codice sta diventando pi� difficile");
		difficultyIncreaser();
		difficolta++;
	}

	static {
		difficile = !difficile;
	}

}
