/**
Tehtävä 11. (Kotitehtävä)
------------------------
Suunnittele Violet UML -editorilla Opiskelija-luokka, joka sisältää opiskelijalle 
tyypillisiä tietoja ja toimintoja. Toteuta Opiskelija-luokka Javalla sekä tee uusi 
luokka OpiskelijaTesti (sisältää main-metodin), joka luo muutamia opiskelijoita 
ja tallentaa opiskelijat taulukkoon (esim. 5 opiskelijaa). Tulosta taulukossa olevien 
opiskelijoiden tiedot käyttämällä toistorakennetta. 

Tekijä: Mikko Pakkanen
Pvm: 22.1.2015
**/

package fi.jamk;

public class Opiskelija {
    // Ominaisuudet
    String nimi, tunnus;
    int aloitusvuosi, id;
    
    // Oletuskonstruktori
    public Opiskelija() {
        this.id = 999;
        this.nimi =  "Michael Jackson";
        this.aloitusvuosi = 2015;
        this.tunnus = "XXX";
    }
    
    // Parametrisoitu konstruktori
    public Opiskelija(int id, String nimi, int aloitusvuosi, String tunnus) {
        this.id = id;
        this.nimi = nimi;
        this.aloitusvuosi = aloitusvuosi;
        this.tunnus = tunnus;
    }
    
    // Asettaa oppilaan nimen
    public void asetaNimi(String nimi) {
        this.nimi = nimi;
    }
    
    // Asettaa oppilaan aloitusvuoden
    public void asetaVuosi(int vuosi) {
        this.aloitusvuosi = vuosi;
    }
    
    // Asettaa oppilaan luokkatunnuksen
    public void asetaTunnus(String tunnus) {
        this.tunnus = tunnus;
    }
    
    // Palauttaa oppilaan tiedot
    public String palautaTiedot() {
        return "#" + this.id + "  " + this.nimi + "Aloitusvuosi: " + this.aloitusvuosi + " Tunnus:" + this.tunnus + "";
    }
            
}
