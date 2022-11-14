package histoire;

import personnages.Commercant;
import personnages.Samourai;

public class HistoireTP5 {
    public static void main(String[] arg) {
	Commercant marco = new Commercant("Marco", 20);
//	Commercant chonin = new Commercant("Chonin", 40);
//	Commercant kumi = new Commercant("Kumi", 10);
//	Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
	Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
//	Ronin roro = new Ronin("Roro", "shochu", 60);
//	roro.faireConnaisanceAvec(marco);
	akimoto.faireConnaisanceAvec(marco);
//	marco.faireConnaisanceAvec(chonin);
//	marco.faireConnaisanceAvec(kumi);
//	marco.listerConnaissance();
	akimoto.listerConnaissance();
	akimoto.boire("thé");
    }

}