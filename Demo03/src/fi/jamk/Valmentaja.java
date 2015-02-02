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

public class Valmentaja {
    private int ika, pituus, paino;
    private String nimi;

    public Valmentaja() {
        this.ika = 0;
        this.pituus = 0;
        this.paino = 0;
        this.nimi = "";
    }
    
    public Valmentaja(String nimi, int ika, int pituus, int paino) {
        this.nimi = nimi;
        this.ika = ika;
        this.pituus = pituus;
        this.paino = paino;
    }
    
    public int getIka() {
        return ika;
    }

    public void setIka(int ika) {
        this.ika = ika;
    }

    public int getPituus() {
        return pituus;
    }

    public void setPituus(int pituus) {
        this.pituus = pituus;
    }

    public int getPaino() {
        return paino;
    }

    public void setPaino(int paino) {
        this.paino = paino;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
}
