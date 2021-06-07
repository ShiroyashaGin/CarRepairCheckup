package shiro.com;

public class Auto {
	String autoNaam;
	// boolean motor, deur, voorruit, uitlaat;
	String[] onderdelen = { "Motor", "Deur", "Voorruit", "Uitlaat" };
	boolean[] onderdelenStatus;

	public Auto(String naam, boolean motor, boolean deur, boolean voorruit, boolean uitlaat) {
		autoNaam = naam;
		boolean[] onderdelenStatussen = { motor, deur, voorruit, uitlaat };
		onderdelenStatus = onderdelenStatussen.clone();
	}
}
