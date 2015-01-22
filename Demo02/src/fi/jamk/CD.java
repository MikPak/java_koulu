/**
Tehtävä 10. (Kotitehtävä)
------------------------
Suunnittele Violet UML -editorilla CD-luokka, joka sisältää ominaisuuksina 
tyypillisiä CD-levyyn kuuluvia tietoja. Suunnittele luokalle tarvittavia "aseta"-metodeja ja 
ainakin yksi ominaisuuksia palauttava metodi palautaTiedot():String, joka palauttaa kaikkien ominaisuuksien 
arvot yhteen merkkijonoon sisällytettynä. Lisää CD-luokkaan konstruktori, joka asettaa 
ominaisuuksien arvot parametrien mukaan. Lisää luokkaan myös konstruktori, jolle parametrina 
annetaan vain CD:n nimi.

Ohjelmoi Javalla suunnittelemasi CD-luokka ja tee myös uusi CDTesti-luokka ja 
sisällytä sinne main-metodi, joka luo CD-oliota käyttäen molempia konstruktoreita 
(tiedot voit keksiä itse, niitä ei tarvitse kysyä käyttäjältä) sekä tulostaa ruudulle 
CD:n tietoja.

Tekijä: Mikko Pakkanen
Pvm: 22.1.2015
**/

package fi.jamk;

public class CD {
    // Ominaisuudet
    String nimi;
    int numero;
    int kesto;
    
    public CD(String nimi) {
        this.nimi = nimi;
        this.numero = 1;
        this.kesto = 0;
    }
    
    public CD(String nimi, int numero, int kesto) {
        this.nimi =  nimi;
        this.numero = numero;
        this.kesto = kesto;
    }
    
    public void asetaNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public void asetaNumero(int numero) {
        this.numero = numero;
    }
    
    public void asetaKesto(int kesto) {
        this.kesto = kesto;
    }
    
    public String palautaTiedot() {
        return "#" + this.numero + "  " + this.nimi + " Kesto: " + this.kesto + "";
    }
            
}
