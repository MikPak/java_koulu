/**
Tehtävä 9 (kotitehtävä)
------------------------
Mäkihypyssä käytetään viittä arvostelutuomaria. Kirjoita ohjelma, joka kysyy arvostelupisteet 
yhdelle hypylle ja tulostaa tyylipisteiden summan siten, että summasta on vähennetty pois pienin 
ja suurin tyylipiste. 

Tekijä: Mikko Pakkanen
Pvm: 13.1.2015
**/

package fi.jamk;
import java.util.Scanner;

public class Tehtava9 {
    public static void main(String args[]) {
        int luku, suurin = 0, pienin = 0, j = 0, summa = 0;
        Scanner scanner = new Scanner(System.in);
      
        // Loopataan läpi 5 kertaa
        do {
            System.out.print("Anna pisteet: "); // Kysytään luku
            luku = scanner.nextInt(); // Luetaan syöte
            summa += luku; // Summataan pisteet
            
            // Luetaan ensimmäinen luku pienimmäksi luvuksi myöhempää vertailua varten
            if(j < 1) {
                pienin = luku;
            }
            
            // Tarkistetaan onko syöte suurempi tai pienempi kuin aiemmin annettu
            if(luku > suurin) {
                suurin = luku;
            } else if(luku < pienin) {
                pienin = luku;
            }
            
            j++;
        } while(j < 5);
        
        System.out.println("Suurin luku: "+suurin);
        System.out.println("Pienin luku: "+pienin);
        System.out.println("Summa: "+summa);
        summa = summa - suurin - pienin;
        System.out.println("Yhteensä vähennysten jälkeen: "+summa);
    }
}