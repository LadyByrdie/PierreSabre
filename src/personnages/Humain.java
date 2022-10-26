package personnages;

public class Humain {
    private String nom;
    private String boisson;
    private int argent;

    public Humain(String nom, String boisson, int argent) {
	super();
	this.nom = nom;
	this.boisson = boisson;
	this.argent = argent;
    }

    public String priseParole() {
	return "(" + nom + ")";
    }

    public void parler(String text) {
	System.out.println(priseParole() + "-" + text);
    }

    public void direBonjour() {
	parler("Bonjour je m'appelle " + nom + " et j'aime boire du " + boisson);
    }

    public void boire() {
	parler("Mmmm, un bon verre de " + boisson + "! GLOUPS!");
    }

    public void gagnerArgent(int gain) {
	argent += gain;
    }

    public void perdreArgent(int perte) {
	argent -= perte;
    }

    public void acheter(String machin, int prix) {
	if (argent > prix) {
	    perdreArgent(prix);
	    parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + machin + " à " + prix + " sous.");
	} else {
	    parler("J'ai n'ai plus que " + argent + " sous en poche. Je ne peux mêmepas m'offrir" + machin + " à "
		    + prix + " sous.");
	}
    }

}