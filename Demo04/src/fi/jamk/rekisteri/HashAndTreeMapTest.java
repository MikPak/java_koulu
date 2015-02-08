/**
Tehtävä 3. HashMap ja TreeMap (Kotitehtävä)
------------------------
Tehtävässä tutustutaan HashMap- ja TreeMap-tietorakenteisiin.
a) Toteuta Java-luokka, joka sisältää pelkästään main()-metodin.
b) Luo tässä main()-metodissa viisi Henkilöä ja sijoita nämä henkilöt 
HashMap-tietorakenteeseen (käytä sotua avaimena)
c) Tulosta yhden henkilön tiedot
d) Tulosta tietorakenteen sisältö
e) Kokeile samaa toteutusta TreeMap rakennetta käyttäen, miten toteutus eroaa 
HashMap-rakenteeseen verrattuna?

Huom! Tässä tehtävässä ei tarvitse käyttää aikaisemmin tehtyä Rekisteri-luokkaa, 
vaan ainoastaan testata linkitettyä listaa main()-metodin sisällä

Tekijä: Mikko Pakkanen
Pvm: 08.02.2015
**/

package fi.jamk.rekisteri;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class HashAndTreeMapTest {
    public static void main(String args[]) {
       
        // Luodaan HashMap-tietorakenne, avain tyyppiä String ja sisältö tyyppiä Olio
        HashMap<String, Object> henkilot = new java.util.HashMap<String, Object>();
        
        // Lisätään henkilöitä tietorakenteeseen, avaimena henkilön sotu
        System.out.println("[HashMap]");
        for(int i = 0; i < 5; i++) {
            Henkilo henk = new Henkilo("Matti"+i,"Meikäläinen"+i,"Sotu"+i);
            henkilot.put(henk.getSotu(), henk);
           
            Henkilo henkilo = (Henkilo) henkilot.get("Sotu"+i);
            
            // Tulostetaan henkilön tiedot, mikäli ko. avain löytyy tietorakenteesta
            if(henkilo != null) {
                System.out.println(henkilo.getTiedot());
            }
        }
        
        // Luodaan TreeMap-tietorakenne, avain = String, sisältö = Olio
        TreeMap<String, Object> henkilot2 = new java.util.TreeMap<String, Object>();
               
        // Lisätään henkilöitä tietorakenteeseen, avaimena henkilön sotu
        for(int i = 0; i < 5; i++) {
            Henkilo henk = new Henkilo("Mikko"+i,"Meikäläinen"+i,"Sotu"+i);
            henkilot2.put(henk.getSotu(), henk);
        }
        
        /* Palautetaan tietorakenteen arvot Collection-luokan olioon jota edelleen käytetään alustamaan
            Iterator-luokan olio tietorakenteen läpikäyntiä varten */
        Collection c = henkilot2.values();
        Iterator itr = c.iterator();
        
        // Käydään läpi TreeMap
        System.out.println("\n[TreeMap]");
        while(itr.hasNext()) {
            System.out.println((((Henkilo)itr.next())).getTiedot());
        }
    }
}
