package personnages;

public class Samourai extends Humain {
    String seigneur;

    public Samourai(String seigneur, String nom, String boisson, int argent) {
	super(nom, boisson, argent);
	this.seigneur = seigneur;
    }

    public String getSeigneur() {
	return seigneur;
    }

    public void boire(String boisson) {
	parler("Qu'est-ce que je vais choisir comme boisson? Tiens je vais prendre du " + boisson);
    }

    @Override
    public void direBonjour() {
	parler("Bonjour je m'appelle " + nom + " et j'aime boire du " + boisson);
	parler("Je suis fier de servir le seigneur " + seigneur);
    }

}
