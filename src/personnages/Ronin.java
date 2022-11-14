package personnages;


public class Ronin extends Humain  {
	int honneur =1;
public Ronin(String nom, String boisson, int argent){
	super(nom,boisson,argent);
	
}
public void donner(Commercant beneficiaire) {
	honneur++;
	float argentf;
	int argenti;
	argentf= argent*10/100;
	argenti=Math.round(argentf);
	argent=argenti;
	parler(beneficiaire.getNom()+" prend ces "+argenti+" sous");
	beneficiaire.recevoir(argenti);
}

public void provoquer(Yakuza adversaire) {
	int force;
	int argenta;
	force=honneur*2;
	parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
	if (force> adversaire.getReputation()){
		parler("Je t'ai eu petit yakuza!");
		argenta= adversaire.perdre();
		gagnerArgent(argenta);
		honneur++;
		adversaire.perdre();
	}else { 
		parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
		perdreArgent(argent);
		honneur--;
	}
	
}
}
