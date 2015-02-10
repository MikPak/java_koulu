/**
Tehtävä 0. Henkilörekisteri
------------------------
Tehtävässä tulee toteuttaa henkilöitä rekisteröivä sovellus käyttämällä kolmea luokkaa: Henkilo, Rekisteri ja RekisteriTesti.

- private
+ public

Rekisteri luokka

Ominaisuudet:
- henkilot (ArrayList)

Konstruktori:
+ alustaa henkilot ArrayListan

Metodit:
+ palautaHenkilomaara, palauttaa ArrayListassa olevien henkilöiden määrän
+ palautaHenkilo, palauttaa ArrayListasta metodille parametrinä tuotua indeksiä vastaavan henkilön tai null, jos ArrayListan indeksissä ei ole henkilöä
+ lisaaHenkilo, lisää ArrayListaan metodille parametrina tuodun uuden henkilön
+ etsiHenkilo, palauttaa metodille parametrinä tuotua sotua vastaavan henkilon henkilot tai null, jos sotua vastaavaa henkilöä ei löydy
   - merkkijonojen yhtäsuuruus voidaan testata seuraavasti: merkkijono.equals(merkkijono)

Tekijä: Mikko Pakkanen
Pvm: 03.02.2015
**/

package fi.jamk.rekisteri;

import java.util.ArrayList;

public class TreeSetHarj {
    private final ArrayList<Henkilo> henkilot;

    public TreeSetHarj() {
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
