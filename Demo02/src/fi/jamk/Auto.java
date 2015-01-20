/**
Demo02
Tehtävä 0
------------------------
Pvm: 20.1.2015
**/

package fi.jamk;

public class Auto {
    // ominaisuudet
    String merkki;
    int vuosimalli;
    int nopeus;
    
    // luokan alustajat eli konstruktorit
    //"PO:" Auto auto = new Auto();
    public Auto() {
        this.merkki = "";
        this.vuosimalli = 0;
        this.nopeus = 0;
    }
    
    // "PO:" Auto auto = new Auto("Saabbi", 1900, 70);
    public Auto(String merkki, int vuosimalli, int nopeus) {
        this.merkki = merkki;
        this.vuosimalli = vuosimalli;
        this.nopeus = nopeus;
    }
    
    // metodi kasvattaa auton nopeutta
    public void kiihdyta() {
       this.nopeus++;
    }
    
    // metodi vähentää auton nopeutta
    public void jarruta() {
        this.nopeus--;
    }
    
    // metodi palauttaa auton merkin
    public String getMerkki() {
        return this.merkki;
    }
    
    // metodi palauttaa auton merkin
    public int getVuosimalli() {
        return this.vuosimalli;
    }
    
    // metodi palauttaa auton vuosiluvun
    public int getVuosiluku() {
        return this.vuosimalli;
    }
    
    // metodi palauttaa auton nopeuden
    public int getNopeus() {
        return this.nopeus;
    }
    
    // metodi palauttaa auton tiedot merkkijonona
    public String getTiedot() {
        return this.merkki + " " + this.vuosimalli + " " + this.nopeus;
    }
    
    // metodi muuttaa auton merkkiä
    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }
    
    // metodi muuttaa auton vuosimallia
    public void setVuosimalli(int vuosimalli) {
        this.vuosimalli = vuosimalli;
    }
}
