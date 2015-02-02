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

public class Pelaaja {
    private int pelaajanro, ika, pituus, paino;
    private String nimi;

    public Pelaaja() {
        this.pelaajanro = 0;
        this.ika = 0;
        this.pituus = 0;
        this.paino = 0;
        this.nimi = "Yolo";
    }
    
    public Pelaaja(String nimi, int pelaajanro, int ika, int pituus, int paino) {
        this.nimi = nimi;
        this.pelaajanro = pelaajanro;
        this.ika = ika;
        this.pituus = pituus;
        this.paino = paino;
    }

    public int getPelaajanro() {
        return pelaajanro;
    }

    public void setPelaajanro(int pelaajanro) {
        this.pelaajanro = pelaajanro;
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
    