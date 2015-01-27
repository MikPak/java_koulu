/**
Tehtävä 3b. (kotitehtävä)
------------------------
Toteuta myös pääohjelma ja testaa sen avulla edellä tekemääsi luokkaa.
- muista testata radion ominaisuuksia raja-arvojen sisällä että ulkopuolella 
olevilla arvoilla (voimakkuus=1000, tai esim. taajuus=10)
- arvoja ei tarvitse kysyä käyttäjältä vaan voit asettaa niitä suoraan koodista, 
esim. radio.asetaVoimakkuus(2);
- jätä nämä testit näkyviin ohjelmointikoodiin 

Tekijä: Mikko Pakkanen
Pvm: 27.1.2015
**/

package fi.jamk;

public class RadioKannettava extends Radio {
    
    public RadioKannettava(int toiminta, int aanenvoimakkuus, int taajuus) {
        super(toiminta, aanenvoimakkuus, taajuus);
    }
    
    public RadioKannettava() {

    }
    
    public static void main(String args[]) {
        RadioKannettava amyri = new RadioKannettava();
        
        amyri.asetaRadionTila(1);
        amyri.asetaAanenvoimakkuus(9);
        amyri.asetaTaajuus(25999);
        
        System.out.println(amyri.mikaTaajuus());
    }
}
