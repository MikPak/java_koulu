/**
Tehtävä 4. (kotitehtävä)
------------------------
Pohdi jokin reaalimaailman asia, jonka kautta voit toteuttaa pienimuotoisen Java-ohjelman/toteutuksen, joka käyttää koostamista.

1. Suunnittele luokkarakenne UML-kaaviona.
2. Laadi tarvittavat luokat ja testipääohjelma.

Tekijä: Mikko Pakkanen
Pvm: 27.1.2015
**/

package fi.jamk;

public class Urheilujoukkue {
    private int pelaajamaara, perustamisvuosi;
    private String nimi;
    
    Pelaaja pelaajat[] = new Pelaaja[10];
    Valmentaja valmentaja;

    // Oletuskonstruktori
    public Urheilujoukkue() {
        this.pelaajamaara = 0;
        this.perustamisvuosi = 0;
        this.nimi = "";
    }
    
    // Parametrisoitu konstruktori
    public Urheilujoukkue(int pmaara, int pvuosi, String nimi) {
        this.pelaajamaara = pmaara;
        this.perustamisvuosi = pvuosi;
        this.nimi = nimi;
    }
    
    // Main
    public static void main(String args[]) {
        Urheilujoukkue jjk = new Urheilujoukkue(0,1976, "JJK");
        Pelaaja litmanen = new Pelaaja("Litmanen", 13, 26, 177, 93);
        Pelaaja koivisto = new Pelaaja("Koivisto", 8, 29, 185, 83);
        Pelaaja nieminen = new Pelaaja("Nieminen", 8, 29, 185, 83);
        Valmentaja koutsi = new Valmentaja("Koutsi", 45, 190, 76);
        
        
        jjk.lisaaPelaaja(litmanen);
        jjk.lisaaPelaaja(koivisto);
        jjk.lisaaPelaaja(nieminen);
        jjk.naytaPelaajat();
        
        System.out.println();
        System.out.println("[Valmentaja]:");
        System.out.println(koutsi.getNimi());
    }
    
    // Lisää pelaajan pelaajat[] taulukkoon, parametrina Pelaaja luokan olio
    public void lisaaPelaaja(Pelaaja pelaaja) {
           if(this.pelaajamaara == 0) {
               this.pelaajat[0] = pelaaja;
               this.pelaajamaara++;
           } else {
               this.pelaajat[this.pelaajamaara] = pelaaja;
               this.pelaajamaara++;
           }
    }
    
    // Tulostaa pelaajien nimet, jokainen nimi on Pelaajat-luokan olio
    public void naytaPelaajat() {
        for(int i = 0; i < pelaajat.length; i++) {
            if(i < this.pelaajamaara) {
              if(i == 0) { System.out.println("[Pelaajat]:"); }
                System.out.println(pelaajat[i].getNimi());
            } else {
                this.pelaajat[i] = new Pelaaja();
            }
        }
    }
    
    // Palauttaa joukkueen perustamisvuoden
    public int getPerustamisvuosi() {
        return this.perustamisvuosi;
    }
    
    // Palauttaa joukkueen nimen
    public String getNimi() {
        return this.nimi;
    }
    
    // Asettaa joukkueen pelaajamäärän
    public void setPelaajamaara(int pelaajamaara) {
        this.pelaajamaara = pelaajamaara;
    }
    
    // Asettaa joukkueen perustamisvuoden
    public void setPerustamisvuosi(int perustamisvuosi) {
        this.perustamisvuosi = perustamisvuosi;
    }
    
    // Asettaa joukkueen nimen
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
}
