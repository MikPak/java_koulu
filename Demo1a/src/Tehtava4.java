/**
Tehtävä 4 (kotitehtävä)
------------------------
Tee ohjelma, joka näyttää onko määritelty vuosi karkausvuosi

- Algoritmi: 4:llä jaolliset on, paitsi täydet vuosisadat. Kuitenkin 400:lla jaolliset vuosisadat ovat.
- Esim. 1991 -> ei, 1992 -> on, 1900 -> ei, 2000 -> on

Tekijä: Mikko Pakkanen
Pvm: 13.1.2015
**/

package fi.jamk;
import java.util.Scanner;

public class Tehtava4 {
    public static void main(String args[]){
        int vuosi;
        
        Scanner scanner = new Scanner(System.in); // Kysytään luku
        System.out.print("Anna vuosi:");
        
        vuosi = scanner.nextInt(); // Luetaan syöte ja tulostetaan
        System.out.println("Annoit luvun "+vuosi);
        
        // Tarkistetaan jääkö jakojäännöksiä 400:lla tai 4:lla jaettaessa
        if(vuosi % 400 == 0 || vuosi % 4 == 0) { // Jos ei jää, luku on karkausvuosi.
                  if(vuosi % 400 == 0){ // Tulostetaan jos jaollinen 400:lla
                    System.out.println("Karkausvuosi.");  
                  } else if(vuosi % 4 == 0 && vuosi % 100 != 0) { // Tai jos luku on jaollinen neljällä muttei sadalla
                    System.out.println("Karkausvuosi.");
                  } else { // Muutoin ei karkausvuosi
                    System.out.println("Ei karkausvuosi.");
                  }
        } else {
            System.out.println("Ei karkausvuosi.");
        }
    }
}
