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

public class OpiskelijaTesti {
    public static void main(String args[]) {
        Opiskelija[] oppilas = new Opiskelija[5]; // Luodaan taulukko jonka alkiot on Opiskelija-luokan olioita.
        
        // Loopataan tulostaen olion tietoja kunnes taulukko on kokonaan käyty läpi
        for(int i = 0; i < oppilas.length; i++) {
            oppilas[i]  = new Opiskelija(i, "Oppilas" + i + " ", 2015+i, "H" + i);
            System.out.println(oppilas[i].palautaTiedot());
        }
    }
}
