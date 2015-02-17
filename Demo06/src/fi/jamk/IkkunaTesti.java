
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
