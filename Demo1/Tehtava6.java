/**
Tehtävä 6 (kotitehtävä)
------------------------
Tee ohjelma, joka kysyy käyttäjältä lukuja, kunnes hän syöttää luvun 0.
Ohjelman tulee tulostaa syötettyjen lukujen summa. 

Tekijä: Mikko Pakkanen
Pvm: 13.1.2015
**/

package fi.jamk;
import java.util.Scanner;

public class Tehtava6 {
    public static void main(String args[]) {
        int luku, summa = 0;
        Scanner scanner = new Scanner(System.in);
        
        // Loopataan niin kauan läpi kunnes syöte on 0
        do {
            System.out.print("Anna luku: "); // Kysytään luku
            luku = scanner.nextInt(); // Luetaan syöte
            summa += luku; // Lisätään syöte summaan
            System.out.println(summa); // Tulostetaan summa
        } while(luku != 0);
    }
}
