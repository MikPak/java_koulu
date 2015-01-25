/**
Tehtävä 12. (Kotitehtävä)
------------------------
Valitse jokin reaalimaailman asia ja suunnittele siitä luokkarakenne Violet UML 
-editorilla. Ohjelmoi suunnittelema luokkasi Javalla sekä testaa toteuttamaasi 
luokkaa myös testiohjelmalla edellisten tehtävien mukaisesti. 

Tekijä: Mikko Pakkanen
Pvm: 25.1.2015
**/

package fi.jamk;

public class TulostinTesti {
    public static void main(String args[]) {
        Tulostin tulostin1 = new Tulostin("Printteri");
        Tulostin tulostin2 = new Tulostin("Hewlett-Packard", 123, 1991, 150, 150, 150);
        
        System.out.println(tulostin1.palautaTiedot());
        System.out.println(tulostin2.palautaTiedot());
    }
}
