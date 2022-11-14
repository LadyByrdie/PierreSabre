package histoire;

import personnages.Yakuza;

public class HistoireTP5 {
    public static void main(String[] arg) {
//	Commercant marco = new Commercant("Marco", 20);
//	Commercant chonin = new Commercant("Chonin", 40);
//	Commercant kumi = new Commercant("Kumi", 10);
	Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
//	Ronin roro = new Ronin("Roro", "shochu", 60);
//	roro.faireConnaisanceAvec(marco);
//	marco.faireConnaisanceAvec(yaku);
//	marco.faireConnaisanceAvec(chonin);
//	marco.faireConnaisanceAvec(kumi);
//	marco.listerConnaissance();
	yaku.direBonjour();
    }

}