package histoire;
import personnages.Commercant;
//import personnages.Yakuza;
import personnages.Ronin;
public class HistoireTP4 {
    public static void main(String[] args) {
    	Commercant marco;
    	Ronin roro;
	roro= new Ronin("Roro","shochu",60);
    marco = new Commercant("Marco", "boisson", 15);
	roro.donner(marco);
    }
}
