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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RekisteriTesti {
    public static void main(String args[]) {
        
        Henkilo h = new Henkilo("Aku", "Ankka", "A1");
        
        // 1. Kirjoitetaan henkilo-olio levylle
        
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;
        
        try {
            // Luodaan binäärinen virta
            fileOut = new FileOutputStream("henkilo.dat");
            
            // Luodaan oliovirta binäärivirran sisälle
            objOut = new ObjectOutputStream(fileOut);
            
            // Kirjoitetaan henkilo-olio oliovirtaan eli levylle
            objOut.writeObject(h);
            System.out.println("Levylle kirjoitettu");
        } catch (FileNotFoundException e) {
            System.out.println("Tiedostoa ei saada luotua.");
        } catch (IOException e) {
            System.out.println("Tiedostoon ei saada oliovirtaa.");
        } finally {
           try {
            if(objOut != null) {
                   objOut.close(); 
                }
            } catch (IOException e) {
                System.out.println("Tiedostoa ei saada suljettua.");
            }
        }
        
        // 2. Luetaan henkikilo levylta
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;
            
            try {
                // Avataan binäärinen virta
                fileIn = new FileInputStream("henkilo.dat");
                // Luodaan oliovirta binäärivirtaan
                objIn = new ObjectInputStream(fileIn);
                // Luetaan henkilo oliovirrasta
                h = (Henkilo)objIn.readObject();
                // Tulostetaan henkilön tiedot näytölle
                System.out.println(h.getTiedot());
            
            } catch (FileNotFoundException e) {
                System.out.println("Tiedostoa ei löydy.");
            } catch (IOException e) {
                System.out.println("Tiedoston luvussa virhe.");
            } catch (ClassNotFoundException e) {
                System.out.println("Tiedostosta ei saada luettua henkilöitä");
            }
    } // main
} // class
