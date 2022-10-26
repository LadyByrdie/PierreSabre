package personnages;

public class Commer�ant extends Humain {

    public Commer�ant(String nom, String boisson, int argent) {
	super(nom, "th�", argent);
    }

    public void seFaireExtorquer() {
	parler("J'ai tout perdu! Le monde est trop injuste...");
	argent = 0;
    }

    public void recevoir(int cadeaux) {
	argent += cadeaux;
	parler(cadeaux + " sous! Je te remercie g�n�reux donateur!");
    }
}
