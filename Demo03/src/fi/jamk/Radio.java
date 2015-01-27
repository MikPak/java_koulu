/**
Tehtävä 3a. (kotitehtävä)
------------------------
Tehtävässä tulee toteuttaa Java-ohjelma radion perustoimintojen testaamiseen.
Kannettavassa radiossa on vain kolme säädintä: päälle/pois-kytkin, äänen 
voimakkuuden säädin (arvot 0, 1, 2,..., 9) ja kuunneltavan kanavan taajuusvalinta 
(2000.0 - 26000.0). Laadi luokka kannettavan radion toteutukseksi. Radion 
ominaisuudet tulee pitää käyttäjältä piilossa, niihin pääsee käsiksi vain 
metodien välityksellä.

Toteuta laite luokkana Radio, jolla on konstruktorin lisäksi ainakin seuraavat metodit:

- asetaRadionTila (asettaa radion päälle tai pois päältä)
- asetaÄänenVoimakkuus (asettaa radion äänen voimakkuuden, jos säätö on mahdollista)
- asetaTaajuus (asettaa radion taajuuden, jos säätö on mahdollista)
- mikäVoimakkuus (palauttaa radion äänen voimakkuuden)
- mikäTaajuus (palauttaa radion käyttämän taajuuden)
- onkoPäällä (palauttaa tiedon siitä on radio päällä vai ei)

Tekijä: Mikko Pakkanen
Pvm: 27.1.2015
**/

package fi.jamk;

public class Radio {
    private int toiminta, aanenvoimakkuus, taajuus;
    
    public Radio() {
        this.toiminta = 1;
        this.aanenvoimakkuus = 7;
        this.taajuus = 2000;
    } 
    
    public Radio(int toiminta, int aanenvoimakkuus, int taajuus ){
        this.toiminta = toiminta;
        this.aanenvoimakkuus = aanenvoimakkuus;
        this.taajuus = taajuus;
    }
    
    public void asetaRadionTila(int toiminta) {
        if(toiminta != 0 || toiminta != 1) {
            System.out.println("1 = Päällä, 0 = Pois");
        } else {
            this.toiminta = toiminta;
        }
    }
    
    public void asetaAanenvoimakkuus(int voimakkuus) {
        if(voimakkuus < 0 || voimakkuus > 9) {
            System.out.println("Anna voimakkuus välillä 0-9");
        } else {
            this.aanenvoimakkuus = voimakkuus;
        }
    }
    
    public void asetaTaajuus(int taajuus) {
        if(taajuus < 2000 || taajuus > 26000) {
            System.out.println("Anna voimakkuus välillä 2000 - 26 000");
        } else {
            this.taajuus = taajuus;
        }
    }
    
    public int mikaVoimakkuus() {
        return aanenvoimakkuus;
    }
    
    public String mikaTaajuus() {
        return "Taajuus: " + taajuus + "";
    }
    
    public String onkoPaalla() {
        if(this.toiminta = 1) {
            return "Toiminta: " + this.toiminta + " = päällä";
        } else {
            return "Toiminta: " + this.toiminta + " = ei päällä";
        }
    }
}
