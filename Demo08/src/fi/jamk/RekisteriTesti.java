/**
Tehtävä 0. Henkilörekisteri
------------------------
Tehtävässä tulee toteuttaa henkilöitä rekisteröivä sovellus käyttämällä kolmea luokkaa: Henkilo, Rekisteri ja RekisteriTesti.

- private
+ public

RekisteriTesti luokka (pääohjelma)

Tee luokka RekisteriTesti (Java Main Class), jolla voidaan testata edellä tehtyjä luokkia:
* luo Rekisteri-luokasta olio, johon voidaan tallentaa henkilöitä
* luo joitain henkilöitä
* lisää henkilöitä rekisteriin
* tulosta rekisterin sisältö
* etsi henkilöä sotun perusteella 

Tekijä: Mikko Pakkanen
Pvm: 03.02.2015
**/

package fi.jamk;

public class RekisteriTesti {
    public static void main(String args[]) {
        Rekisteri kaverit = new Rekisteri();
        
        Henkilo h = new Henkilo("Aku", "Ankka", "A1");
        
        // Lisätään henkilö rekisteriin
        if(kaverit.addHenkilo(h))
            System.out.println("Lisätty");
        else
            System.out.println("Lisäys epäonnistui");
        
        h = new Henkilo("Kirsi","Kernel","K1");
        
        // Lisätään henkilö rekisteriin
        if(kaverit.addHenkilo(h))
            System.out.println("Lisätty");
        else
            System.out.println("Lisäys epäonnistui");
        
        System.out.println("Rekisteri sisältö: ");
        for(int i = 0; i < kaverit.getHenkilomaara(); i++) {
            h = kaverit.getHenkilo(i);
            System.out.println(h.getTiedot());
        }
        
        String sotu = "K1";
        System.out.println("Etsitään henkilöä sodulla: " + sotu);
        h = kaverit.findHenkilo(sotu);
        if(h != null) System.out.println(h.getTiedot());
        else System.out.println("Sotua vastaavaa henkilöä ei löytynyt"); 
       
    }
}
