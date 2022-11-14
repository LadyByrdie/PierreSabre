package personnages;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;

public class Yakuza extends Humain {
    int reputation = 0;
    String Gang;

    public int getReputation() {
	return reputation;
    }

    public Yakuza(String nom, String boisson, int argent, String gang) {
	super(nom, boisson, argent);
	this.Gang = gang;
    }

    public String getGang() {
	return Gang;
    }

    public void extorquer(Commercant victime) {
	int vole = victime.getArgent();
	parler("Tiens, tiens, ne serait-ce pas un faibre marchan qui passe par là?");
	parler(victime.getNom() + " si tu tiens � la vie donne moi ta bourse!");
	reputation++;
	gagnerArgent(victime.getArgent());
	victime.seFaireExtorquer();
	parler("J'ai piqué les " + vole + " sous de Marco, ce qui me fait " + getArgent()
		+ " sous dans ma poche. Hi!Hi!");
    }

    public int perdre() {
	int avant;
	avant = argent;
	parler("J'ai perdu mon duel et mes " + argent + " sous, snif.. J'ai déshonoré le clan de Warsong");
	perdreArgent(argent);
	reputation--;
	return avant;
    }

    public void gagner(Ronin adversaire) {
	parler("Ce ronin pensit vraiment battre" + getNom() + " du clan de Warsong? Je l'ai dépouillé de ses "
		+ adversaire.getArgent() + " sous.");
    }

    @Override
    public void direBonjour() {
	parler("Bonjour je m'appelle " + nom + " et j'aime boire du " + boisson);
	parler("Mon clan est celui de " + getGang());
    }

}
