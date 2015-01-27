/**
Tehtävä 1.
------------------------
TyontekijaTesti-luokka

- luo muutamia työntekijöitä ja johtajia
- muuta luotujen olioiden ominaisuuksia
- tulosta olioiden tietoja 

Tekijä: Mikko Pakkanen
Pvm: 27.1.2015
**/

package fi.jamk;

public class TyontekijaTesti {
    public static void main(String args[]) {
        
    Johtaja leppoisa = new Johtaja("Seppo", "Koodari", 100000, "Ferrari", 50000);
    Tyontekija ahkera = new Tyontekija("Esko", "Kahvinkeittäjä", 100);
    
    System.out.println(leppoisa.annaTiedot());
    System.out.println(ahkera.annaTiedot());
    
    leppoisa.muutaAuto("Mercedez");
    ahkera.setAsema("Ylennetty kahvinkeittäjä");
    
    System.out.println(leppoisa.annaTiedot());
    System.out.println(ahkera.annaTiedot());
    }
}
