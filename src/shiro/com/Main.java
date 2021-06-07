package shiro.com;

public class Main {

	// true = working
	// false = broken
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// new Program();
		Auto bmw = new Auto("BWM", true, false, true, false);

		Monteur monteur = new Monteur();
		monteur.CheckAuto(bmw);
	}

}
