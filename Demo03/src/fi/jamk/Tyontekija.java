/**
Tehtävä 1.
------------------------
Tyontekija-luokka

yksityiset ominaisuudet:
- String: nimi
- String: asema
- double: palkka

julkiset metodit:
- konstruktori: jolla voidaan alustaa kaikki työntekijän ominaisuudet parametrien kautta
- annaTiedot() - palauttaa tyontekijän kaikki tiedot yhtenä merkkijonona
- muutaAsema(String) - muuttaa asema attribuuttia
- muutaPalkka(double) - muuttaa palkka attribuuttia

Tekijä: Mikko Pakkanen
Pvm: 27.1.2015
**/

package fi.jamk;

public class Tyontekija {
    private String nimi;
    private String asema;
    private double palkka;
    
    public Tyontekija() {
        this.nimi = "Masa";
        this.asema = "Johtaja";
        this.palkka = 10000;
    }

    public Tyontekija(String nimi, String asema, double palkka) {
        this.nimi = nimi;
        this.asema = asema;
        this.palkka = palkka;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getAsema() {
        return asema;
    }

    public void setAsema(String asema) {
        this.asema = asema;
    }

    public double getPalkka() {
        return palkka;
    }

    public void setPalkka(double palkka) {
        this.palkka = palkka;
    }
    
    public String annaTiedot() {
        return("Nimi: " + this.nimi + " Asema: " + this.asema + " Palkka: " + this.palkka + "");
    }
}
