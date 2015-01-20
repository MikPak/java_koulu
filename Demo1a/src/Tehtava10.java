/**
Tehtävä 10 (kotitehtävä)
------------------------
Kirjoita ohjelma, joka pyytää käyttäjältä opiskelijoiden arvosanat ohjelmointi 
opintojaksosta (voit itse päättää lopetusehdon). 

Tulosta arvosanajakauma käyttäen tähtimerkkejä seuraavasti:

Arvosanajakauma:
0:
1:****
2:**
3:******
4:*****
5:**

Tekijä: Mikko Pakkanen
Pvm: 13.1.2015
**/

package fi.jamk;
import java.util.Scanner;

public class Tehtava10 {
    
    // Aliohjelma tähtien tulostamiselle
    private static void tulostaTahdet(int maara) {
        for(int i = 0; i < maara; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        int viisi = 0, nelja = 0, kolme = 0, kaksi = 0, yksi = 0, nolla = 0, kerrat = 1, luku;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Anna negatiivinen arvo lopettaaksesi ohjelman.");
      
        // Loopataan läpi kunnes syöte on negatiivinen
        do {
            System.out.print("Anna arvosana #"+kerrat+": "); // Kysytään arvosana
            luku = scanner.nextInt(); // Luetaan syöte

            switch(luku) {
                case 0: nolla++;
                    break;
                case 1: yksi++;
                    break;
                case 2: kaksi++;
                    break;
                case 3: kolme++;
                    break;
                case 4: nelja++;
                    break;
                case 5: viisi++;
                    break;   
                }
        
                kerrat++;
            } while(luku >= 0);
        
        // Tulostetaan tilasto
        System.out.print("0:");
            tulostaTahdet(nolla);
        System.out.print("1:");
        tulostaTahdet(yksi);
            System.out.print("2:");
        tulostaTahdet(kaksi);
            System.out.print("3:");
        tulostaTahdet(kolme);
            System.out.print("4:");
        tulostaTahdet(nelja);
            System.out.print("5:");
        tulostaTahdet(viisi);
    }
}