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
import java.util.ArrayList;

public class Rekisteri implements Serializable {
    private final ArrayList<Henkilo> henkilot;

    public Rekisteri() {
        this.henkilot = new ArrayList();
    }
    
    public int getHenkilomaara() {
        return this.henkilot.size();
    }
    
    public boolean addHenkilo(Henkilo h) {
       return this.henkilot.add(h);
    }
    
    public Henkilo gethHenkilo(int index) {
        if(index < getHenkilomaara())
            return this.henkilot.get(index);
        else
            return null;
    }
    
    public Henkilo findHenkilo(String sotu) {
        for(Henkilo h : henkilot ) {
            // Onko vuorossa olevan henkilon sotu sama kuin etsittävä
            if(sotu.equalsIgnoreCase(h.getSotu()))
                return h;
        }
        // Sotua vastaavaa henkiloa ei loydy
        return null;
    }
    
    
    
}
