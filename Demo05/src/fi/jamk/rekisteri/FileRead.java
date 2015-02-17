/**
Tehtävä 3. (kotitehtävä)
------------------------

Tekstimuotoisen tiedoston käsittely - tiedoston lukeminen:
Tee ohjelma, joka tulostaa näytölle tekstitiedoston sisällön riveittäin.
- tee main()-metodi, joka avaa ja tulostaa tekstitiedoston sisällön Output-ikkunaan

Tekijä: Mikko Pakkanen
Pvm: 11.02.2015
**/

package fi.jamk.rekisteri;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
    public static void main(String args[]) {
        FileInputStream fin = null;
        DataInputStream din = null;
        String rivi;
        
        try {
            fin = new FileInputStream("filee.txt"); // Virran avaaminen lukemista varten
            din = new DataInputStream(new BufferedInputStream(fin)); // Tiedoston lukemista varten
            
            rivi = din.readLine(); // Luetaan rivi tiedostosta
            
            // Loopataan niin kauan kunnes rivit loppuvat
            while(rivi != null) {
                System.out.println(rivi);
                rivi = din.readLine();
            }
            
            din.close();
            fin.close();
            
        } catch(EOFException e) {
            System.out.println("Tiedoston lukeminen päättyi.");
        } catch(FileNotFoundException e) {
            System.out.println("Tiedostoa ei löytynyt.");
        } catch(IOException e) {
            System.out.println("Tiedoston lukuvirhe.");
        }
    }
}
