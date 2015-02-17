/**
Tehtävä 4. (kotitehtävä)
------------------------

Tehtävä 4. (kotitehtävä)
Tekstimuotoisen tiedoston käsittely:
Tee ohjelma, joka kysyy käyttäjältä lukuja (joko kokonaisluku tai reaaliluku) 
ja tallentaa kokonaisluvut eri tiedostoon kuin reaaliluvut.
- sovellus tulee lopettaa, jos käyttäjä ei syötä kokonais- tai reaalilukua

Tekijä: Mikko Pakkanen
Pvm: 11.02.2015
**/

package fi.jamk.rekisteri;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class IntFloatWriter {
    public static void main(String args[]) {
        String syote;
        Scanner scanner = new Scanner(System.in);
        FileWriter fw;
        BufferedWriter bw;
        
        // Loopataan käyttäjältä syötettä niin kauan kunnes sisältö on tyhjä
        do {
            System.out.println("Anna luku: ");
            syote = scanner.nextLine();
            
            try {
                if(syote.contains(".")) { // Jos kyseessä on desimaaliluku
                    fw = new FileWriter("desimaaliluvut.txt", true);
                    bw = new BufferedWriter(fw);
                    bw.write(String.valueOf(syote)); // Kirjoitetaan käyttäjän syöte
                    bw.newLine(); // Rivinvaihto
                    bw.close(); // Suljetaan kirjoitusvirta
                } else { // Jos kyseessä on kokonaisluku
                    fw = new FileWriter("kokonaisluvut.txt", true);
                    bw = new BufferedWriter(fw);
                    bw.write(String.valueOf(syote)); // Kirjoitetaan käyttäjän syöte
                    bw.newLine(); // Rivinvaihto
                    bw.close(); // Suljetaan kirjoitusvirta
                }
            } catch(FileNotFoundException e) {
                System.out.println("Tiedostoa ei saada luotua.");
            } catch(IOException e) {
                System.out.println("Tiedostoon kirjoittamisessa tuli ongelma.");
            }
        } while(syote.length() != 0);
    }
}
