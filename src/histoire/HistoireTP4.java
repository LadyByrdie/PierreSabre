package histoire;

import personnages.Commerçant;

public class HistoireTP4 {
    public static void main(String[] args) {
	Commerçant marco;
	marco = new Commerçant("Marco", "boisson", 20);
	marco.direBonjour();
	marco.seFaireExtorquer();
	marco.recevoir(15);
	marco.boire();
    }
}
