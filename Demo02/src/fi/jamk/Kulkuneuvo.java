/**
Tehtävä 9. (Kotitehtävä)
------------------------
 Toteuta Kulkuneuvo-luokka seuraavien tietojen mukaisesti:
Ominaisuudet
+ nopeus(int)
+ nimi(String)

Metodit
+ asetaNopeus(int nopeus)
+ asetaNimi(String nimi)
+ tulostaTiedot()
+ palautaNimi():String

Toimintojen kuvaukset:
- asetaNopeus, asettaa nopeus-ominaisuudelle uuden arvon annetun parametrin perusteella
- asetaNimi, asettaa nimi-ominaisuudelle uuden arvon annetun parametrin perusteella
- palautaNimi-metodin tulee palauttaa kulkuneuvon nimi metodin kutsujalle
- tulostaTiedot tulostaa kulkuneuvon nopeuden ja nimen ruudulle

Tekijä: Mikko Pakkanen
Pvm: 20.1.2015
**/

package fi.jamk;

public class Kulkuneuvo {
    // Ominaisuudet
    int nopeus;
    String nimi;
    
    // Konstruktori
    public Kulkuneuvo() {
        this.nopeus = 0;
        this.nimi = "";
    }
    
    // Parametrisoitu konstruktori
    public Kulkuneuvo(int nopeus, String nimi) {
        this.nopeus = nopeus;
        this.nimi = nimi;
    }
    
    public void asetaNopeus(int nopeus) {
        this.nopeus = nopeus;
    }
    
    public void asetaNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public String tulostaTiedot() {
        return "Nimi:" + this.nimi + " Nopeus:" + this.nopeus;
    }
    
    public String palautaNimi() {
        return this.nimi;
    }
    
    public static void main(String args[]) {
        Kulkuneuvo kulkuneuvo = new Kulkuneuvo();
        kulkuneuvo.asetaNimi("Saab");
        kulkuneuvo.asetaNopeus(1337);
        
        System.out.println("palautaNimi(): " + kulkuneuvo.palautaNimi());
        System.out.println("tulostaTiedot(): " + kulkuneuvo.tulostaTiedot());
    }
    
}
