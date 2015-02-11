/**
Tehtävä 0. Henkilörekisteri
------------------------
Tehtävässä tulee toteuttaa henkilöitä rekisteröivä sovellus käyttämällä kolmea luokkaa: Henkilo, Rekisteri ja RekisteriTesti.

- private
+ public

Henkilo-luokka

Ominaisuudet:
- etunimi
- sukunimi
- sotu

/**
Tehtävä 0. (tehdään yhdessä opettajan kanssa)
Tehtävässä tutustutaan olion tallentamiseen tiedostoon.

Henkilo-luokan sarjallistaminen:
a) käynnistä NetBeans ja luo uusi projekti näitä demoja varten
b) tee projektiin uusi paketti: fi.jamk.rekisteri
c) kopio (windowsissa) aikaisemmista demoista (demo4) Henkilo.java ja 
Rekisteri.java demo05/fi/jamk/rekisteri-kansioon
d) muuta Henkilo-luokkaa siten, että siitä luotuja olioita voidaan 
sarjallistamisen kautta kirjoittaa tiedostoon
Henkilo-luokan olion kirjoittaminen levylle:
a) tee projektiisi Java-luokka, joka sisältää pelkästään main()-metodin
b) luo main()-metodin sisällä yksi Henkilo-luokan olio
c) talleta olio levylle
d) lue talletettu olio levyltä
e) tulosta luetun olion tiedot
=> jos tiedot ovat samat, on tallennus ja lukeminen onnistunut!
=> voit tarkistaa tiedoston sisällön esim. avaamalla tiedostosi Notepadiin

Tekijä: Mikko Pakkanen
Pvm: 10.02.2015
**/

package fi.jamk.rekisteri;

import java.io.Serializable;

public class Henkilo implements Serializable {
    private String etunimi, sukunimi, sotu;
    
    public Henkilo(String etunimi, String sukunimi, String sotu) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.sotu = sotu;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getSotu() {
        return sotu;
    }

    public void setSotu(String sotu) {
        this.sotu = sotu;
    }
    
    public String getTiedot() {
        return(this.etunimi + " " + this.sukunimi + " " + this.sotu);
    }
    
    // metodi määrittelee Henkilo-luokan oliot järjestettäväksi 
    // - ensisijaisesti sukunimi-ominaisuuden perusteella (String)
    // - toisisijaisesti etunimi-ominaisuuden perusteella (String)
    public int compareTo(Object seuraava) {
        String bSukunimi = ((Henkilo)seuraava).getSukunimi();
        String bEtunimi = ((Henkilo)seuraava).getEtunimi();
        int sukuVert = sukunimi.compareTo(bSukunimi);
        
        if (sukuVert == 0) return etunimi.compareTo(bEtunimi);
        else return sukuVert;
  }
}
