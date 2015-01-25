/**
Tehtävä 12. (Kotitehtävä)
------------------------
Valitse jokin reaalimaailman asia ja suunnittele siitä luokkarakenne Violet UML 
-editorilla. Ohjelmoi suunnittelema luokkasi Javalla sekä testaa toteuttamaasi 
luokkaa myös testiohjelmalla edellisten tehtävien mukaisesti. 

Tekijä: Mikko Pakkanen
Pvm: 25.1.2015
**/

package fi.jamk;

public class Tulostin {
    // Ominaisuudet
    String nimi;
    int tuotenumero, valmistusvuosi, leveys, korkeus, syvyys;
    
    public Tulostin(String nimi) {
        this.nimi = nimi;
        this.tuotenumero = 1;
        this.valmistusvuosi = 1990;
        this.leveys = 50;
        this.korkeus = 50;
        this.syvyys = 50;
    }
    
    public Tulostin(String nimi, int tnumero, int vvuosi, int leveys, int korkeus, int syvyys) {
        this.nimi =  nimi;
        this.tuotenumero = tnumero;
        this.valmistusvuosi = vvuosi;
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.syvyys = syvyys;
    }
    
    public void asetaNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public void asetaNumero(int numero) {
        this.tuotenumero = numero;
    }
    
    public void asetaVuosi(int vuosi) {
        this.valmistusvuosi = vuosi;
    }
    
    public void asetaMitat(int leveys, int korkeus, int syvyys) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.syvyys = syvyys;
    }
    
    public String palautaTiedot() {
        return "#: " + this.tuotenumero + " - " + this.nimi + " - Vm: " + this.valmistusvuosi + "" +
               "Mitat(LxKxS: " + this.leveys + "x" + this.korkeus + "x" + this.syvyys;
    }
            
}
