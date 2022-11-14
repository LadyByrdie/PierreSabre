package personnages;

public class Humain {
    protected String nom;
    private String boisson;
    protected int argent;
    private Humain[] connaisance;
    protected int nbConnaisance = 0;
    protected int nbConnaisanceMax = 3;

    public Humain(String nom, String boisson, int argent) {
	super();
	this.nom = nom;
	this.boisson = boisson;
	this.argent = argent;
	this.connaisance = new Humain[nbConnaisanceMax];
    }

    public String getNom() {
	return nom;
    }

    public String getBoisson() {
	return boisson;
    }

    public int getArgent() {
	return argent;
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

    public void repondre(Humain autreHumain) {
	autreHumain.direBonjour();
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
	    parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + machin + " � " + prix + " sous.");
	} else {
	    parler("J'ai n'ai plus que " + argent + " sous en poche. Je ne peux m�mepas m'offrir" + machin + " � "
		    + prix + " sous.");
	}
    }

    public void memoriser(Humain autreHumain) {
	if (nbConnaisance < nbConnaisanceMax) {
	    connaisance[nbConnaisance] = autreHumain;
	    nbConnaisance++;
	} else {
	    for (int i = 0; i < nbConnaisanceMax - 1; i++) {
		connaisance[i] = connaisance[i + 1];
	    }
	    connaisance[nbConnaisanceMax - 1] = autreHumain;
	}
    }

    public void faireConnaisanceAvec(Humain autreHumain) {
	direBonjour();
	repondre(autreHumain);
	memoriser(autreHumain);
	autreHumain.memoriser(this);
    }

    public void listerConnaissance() {
	if (nbConnaisance == 0) {
	    parler("Je ne connais personne.");
	} else {
	    String accumulateur = "";
	    for (int i = 0; i < nbConnaisance - 1; i++) {
		accumulateur += connaisance[i].getNom() + ",";
	    }
	    accumulateur += connaisance[nbConnaisance - 1].getNom();
	    parler("Je connais beaucoup de monde dont:" + accumulateur);
	}
    }
}