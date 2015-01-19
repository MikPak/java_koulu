/**
Tehtävä 8 (kotitehtävä)
------------------------
Tee ohjelma, joka kysyy käyttäjältä 5 kokonaislukua. Luvut tulee tallettaa taulukkoon.
- ohjelman tulee tulostaa annetut luvut käänteisessä järjestyksessä 

Tekijä: Mikko Pakkanen
Pvm: 13.1.2015
**/

package fi.jamk;
import java.util.Scanner;

public class Tehtava8 {
    public static void main(String args[]) {
        int luku = 0, j = 0;
        int[] taulukko = new int[5]; // Luodaan kokonaislukutaulukko viidellä alkiolla
        Scanner scanner = new Scanner(System.in);
      
        // Loopataan läpi 5 kertaa
        do {
            System.out.print("Anna luku: "); // Kysytään luku
            luku = scanner.nextInt(); // Luetaan syöte
            taulukko[j] = luku; // Lisätään syöte taulukkoon
            j++;
        } while(j < 5);
        
        // Tulostetaan taulukon arvot käänteisessä järjestyksessä
        for(int i = taulukko.length -1; i >= 0; i--) { 
            System.out.println(taulukko[4]);
        }
    }
}