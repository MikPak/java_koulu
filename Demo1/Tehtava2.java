/**
Tehtävä 2
------------------------
Tee ohjelma, joka näyttää annetun sekuntimäärän tunteina, minuutteina ja sekunteina.

Esimerkkinäkymä ohjelman tulosteista:

Anna sekunnit > 3661 [Enter]
Antamasi sekunttiaika voidaan ilmaista muodossa: 1 tunti 1 minuutti 1 sekuntti 

Tekijä: Mikko Pakkanen
Pvm: 13.1.2015
**/

package fi.jamk;
import java.util.Scanner;

public class Tehtava2 {
    public static void main(String args[]){
        int tunnit, minuutit, sekunnit, luku, jaannos;
        
        Scanner scanner = new Scanner(System.in); // Kysytään luku
        System.out.print("Anna luku sekunteina:");
        
        luku = scanner.nextInt(); // Luetaan syöte ja tulostetaan
        System.out.println("Annoit luvun "+luku);
        
        if(luku % 3600 == 0) {
            tunnit = luku / 3600;
            System.out.print(tunnit+" tunti(a) ");
        } else if(luku % 3600 != 0) {
            tunnit = luku / 3600;
            jaannos = luku % 3600;
            System.out.print(tunnit+" tunti(a) ");
                if(jaannos % 60 != 0) {
                    minuutit = jaannos / 60;
                    jaannos = jaannos % 60;
                    System.out.print(minuutit+" minuutti(a) ");
                    System.out.print(jaannos+" sekunti(a)");
                }
            }
        }
    }

