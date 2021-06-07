package shiro.com;

public class Monteur {

	void CheckAuto(Auto auto) {
		System.out.println("================================ \n Checkup on " + auto.autoNaam);
		String statusTekst = "";
		for (int i = 0; i < auto.onderdelen.length; i++) {
			if (auto.onderdelenStatus[i]) {
				statusTekst = "OK";
			} else {
				statusTekst = "Broken";
			}
			System.out.println(auto.onderdelen[i] + " Status: " + statusTekst);
		}
		System.out.println("Checkup Done\n ================================ ");
	}
}