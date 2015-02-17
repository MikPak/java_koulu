/**
Tehtävä 2. (kotitehtävä)
------------------------

Tekstimuotoisen tiedoston käsittely - tiedostoon kirjoittaminen:
Tee ohjelma, joka kirjoittaa käyttäjän antamat merkkijonot tiedostoon 
(lopetusehdon voit päättää itse).
-tee main()-metodi, joka avaa tiedoston, kysyy käyttäjältä merkkijonoja ja 
merkkijonot kirjoitetaan tiedostoon
- tarkista tiedoston sisältö esim. notepadilla

Tekijä: Mikko Pakkanen
Pvm: 11.02.2015
**/

package fi.jamk.rekisteri;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    public static void main(String args[]) {
        String syote;
        Scanner scanner = new Scanner(System.in);
        FileWriter fw;
        BufferedWriter bw;
        
        // Loopataan käyttäjältä syötettä niin kauan kunnes sisältö on "-q"
        do {
            System.out.println("Anna merkkijono (lopetus: -q): ");
            syote = scanner.nextLine();
            try {
                if(!syote.equals("-q")) {
                    fw = new FileWriter("filee.txt", true);
                    bw = new BufferedWriter(fw);
                    bw.write(syote); // Kirjoitetaan käyttäjän syöte
                    bw.newLine(); // Rivinvaihto
                    bw.close(); // Suljetaan kirjoitusvirta
                }
            } catch(FileNotFoundException e) {
                System.out.println("Tiedostoa ei saada luotua.");
            } catch(IOException e) {
                System.out.println("Tiedostoon kirjoittamisessa tuli ongelma.");
            }
        } while(!syote.equals("-q"));
    }
}
