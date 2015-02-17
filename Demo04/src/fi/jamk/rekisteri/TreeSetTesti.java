/**
Tehtävä 2. TreeSet (kotitehtävä)
------------------------
Tehtävässä tutustutaan TreeSet-tietorakenteeseen.
a) Toteuta Java-luokka, joka sisältää pelkästään main()-metodin.
b) Luo tässä main()-metodissa viisi Henkilöä ja sijoita nämä henkilöt 
TreeSet-tietorakenteeseen.

Huom! Tehtävässä tulee toteuttaa muutoksia Henkilo-luokkaan 
(löytyy luentomateriaaleista)

TreeSet-tietorakenne lajittelee alkionsa järjestykseen, joten oliot tulee voida 
jotenkin järjestää
- määrittele Henkilo-luokka toteuttamaan Comparable-liittymä (rajapinta)
- määrittele Henkilo-luokkaan compareTo()-metodi (voit käyttää tunnilla 
esitettyä metodia)
=> Lisättävä Henkilö lajitellaan ensisijaisesti sukunimen perusteella 
(jos sukunimet ovat samat verrataan vielä etunimeä)
=> add()-metodi kutsuu automaattisesti tätä compareTo()-metodia uuden 
henkilön lisäysvaiheessa

c) Tulosta tietorakenteen sisältö
d) Kokeile lisätä samanniminen (sama etu- ja sukunimi, eli luo samoilla 
tiedoilla oleva olio) henkilö tietorakenteeseen, mitä tapahtuu?

Huom! Tässä tehtävässä ei tarvitse käyttää aikaisemmin tehtyä Rekisteri-luokkaa, 
vaan ainoastaan testata treesettiä main()-metodin sisällä

Tekijä: Mikko Pakkanen
Pvm: 04.02.2015
**/

package fi.jamk.rekisteri;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTesti {
    public static void main(String args[]) {
        // Luodaan TreeSet-tietorakenne, joka sisältää olioita.
<<<<<<< HEAD
        Set<Henkilo> henkilot = new java.util.TreeSet<Henkilo>();
=======
        Set<Object> henkilot = new java.util.TreeSet<Object>();
>>>>>>> origin/master
        
        // Lisätään olioita tietorakenteeseen
        for(int i = 1; i < 6; i++) {
            henkilot.add(new Henkilo("Matti"+i,"Meikäläinen"+i,"Sotu"+i));
        }
        
        // Jokeri
        henkilot.add(new Henkilo("Matti3.5","Meikäläinen3.5","Sotu3.5"));
        
        // Siirtää tietorakenteen oliot taulukkoon läpikäyntiä varten
        Object henkilot2[] = henkilot.toArray();
        
        // Tulostaa oliot 
        for(int i = 0; i < henkilot2.length; i++) {
            System.out.println(((Henkilo)henkilot2[i]).getTiedot());
        }
    }
}
