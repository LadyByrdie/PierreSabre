package personnages;

public class Yakuza extends Humain {

    public Yakuza(String nom, String boisson, int argent) {
	super(nom, boisson, argent);
    }
	int reputation = 0;
	
	public void extorquer(Commercant victime){
		int vole=victime.getArgent();
		parler("Tiens, tiens, ne serait-ce pas un faibre marchan qui passe par là?");
		parler(victime.getNom()+" si tu tiens à la vie donne moi ta bourse!");
		reputation++;
		gagnerArgent(victime.getArgent());
		victime.seFaireExtorquer();
		parler("J'ai piqué les " + vole+ " sous de Marco, ce qui me fait " +getArgent()+" sous dans ma poche. Hi!Hi!");
    }
	
	

	public int getReputation() {
		return reputation;
	}



	public int perdre() {
		int avant;
		avant=argent;
		parler("J'ai perdu mon duel et mes " +argent+ " sous, snif.. J'ai déshonoré le clan de Warsong"); 
		perdreArgent(argent);
		reputation --;
		return avant;
	}
	
	public void gagner(Ronin adversaire) {
		parler("Ce ronin pensit vraiment battre" + getNom() + " du clan de Warsong? Je l'ai dépouillé de ses "+ adversaire.getArgent() + " sous.");
	}
}
