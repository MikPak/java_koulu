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

public class CDTesti {
    public static void main(String args[]) {
        CD kappale1 = new CD("Fröbelin Palikat - Jee Jee.mp3");
        CD kappale2 = new CD("Fröbelin Palikat - Juu Juu.mp3", 1, 90);
        
        System.out.println(kappale1.palautaTiedot());
        System.out.println(kappale2.palautaTiedot());
    }
}
