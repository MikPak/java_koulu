/**
Tehtävä 3. (kotitehtävä)
------------------------

Tekstimuotoisen tiedoston käsittely - tiedoston lukeminen:
Tee ohjelma, joka tulostaa näytölle tekstitiedoston sisällön riveittäin.
- tee main()-metodi, joka avaa ja tulostaa tekstitiedoston sisällön Output-ikkunaan

Tekijä: Mikko Pakkanen
Pvm: 11.02.2015
**/

package fi.jamk;

import javax.swing.JFrame;

public class IkkunaTesti extends JFrame {
    
    public IkkunaTesti() {
        super("IkkunaTesti");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setResizable(false);
    }
    
    public static void main(String args[]) {
        new IkkunaTesti().setVisible(true);
    }
}
