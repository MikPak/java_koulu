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

Konstruktori:
+ tee luokalle konstruktori, jossa kaikki nämä tiedot voidaan alustaa (parametrillinen konstruktori).

Metodit:
+ palautaSotu, palauttaa sosiaaliturvatunnuksen
+ palautaEtunimi, palauttaa etunimen
+ palautaSukunimi, palauttaa sukunimen
+ palautaTiedot, palauttaa henkilon kaikki ominaisuudet yhtenä merkkijonona seuraavasti : "etunimi sukunimi sotu"
+ muutaEtunimi, muuttaa etunimen
+ muutaSukunimi, muuttaa sukunimen 

Tekijä: Mikko Pakkanen
Pvm: 03.02.2015
**/

package fi.jamk;

public class Henkilo implements Comparable {
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
