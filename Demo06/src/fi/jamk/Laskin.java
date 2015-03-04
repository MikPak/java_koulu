/**
Tehtävä 3 - Laskin (Kotitehtävä, graafinen näkymä - 
ei tarvitse toteuttaa laskutoimenpiteitä)
------------------------

a) Toteuta laskukone SWING-komponenttien avulla (katso mallia esim. 
Windowsin laskimesta)
- suunnittele käyttöliittymä ensin paperille (kannattaako apuna käyttää 
paneeleita eli jakaa pinta-ala osa säiliöihin?)
- tee uusi JFrame-luokka ja toteuta graafinen käyttöliittymä, joko ohjelmoimalla 
tai NetBeansin GUI-editorilla

Lisätehtävä (eli ei vaadita kotitehtäväpisteisiin - mutta tietysti voit kokeilla 
ohjelmointia myös)
+ kokeile ohjelmoida esim. yksinkertainen yhteenlasku toimimaan (käyttäjä 
valitsee: 1+2= ja näytä tulos 3)
+ voit itse päättää onko lukujen laskentatarkkuus int (kokonaisluvut) vai double
(reaaliluvut), vai molemmat? 

Tekijä: Mikko Pakkanen
Pvm: 03.03.2015
**/

package fi.jamk;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Laskin extends JFrame {
    private GridBagLayout layout = new GridBagLayout();
    private JLabel naytto = new JLabel("0");
    Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
    
    // Konstruktori
    public Laskin() {
        super("Laskin"); // Ikkunan nimi
        setLayout(layout); // Asetetaan 
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Sulkemishommia
        this.setSize(300,400); // Ikkunan koko korkeus x leveys
        
        GridBagConstraints c = new GridBagConstraints(); // Luodaan olio, jolla voidaan asettaa rajoitteita komponenteille
        
        // Asetetaan näytön ominaisuudet (Näyttää syötetyt numerot ja laskujen tulokset)
        naytto.setFont(new Font("monospaced", Font.BOLD, 32));
        naytto.setBorder(new EmptyBorder(0, 5, 0, 25));
        naytto.setHorizontalAlignment(SwingConstants.RIGHT);
        
            c.gridwidth = GridBagConstraints.REMAINDER; // Komponentti vie kaiken jäljellä olevan tilan leveyssuunnassa
            c.weightx = 1; // Tilan jako komponentin ja piirtoalueen reunan välissä
            c.weighty = 1; 
            c.gridy = 0; // Määrittävät solun johon komponentin vasen ylänurkka tulee
            c.gridx = 1;
            c.fill = GridBagConstraints.BOTH; // Määrittää miten komponentti täyttää solun
            layout.setConstraints(naytto, c); // Asetetaan tiedot asettelijaan
            add(naytto); // Lisätään komponentti säiliöön
        
        // Lisätään napit
        makeButton(new JButton("C"), layout, 1, 1, 1, 1, 1);
        makeButton(new JButton("+/-"), layout, 1, 1, 1, 1, 2);
        makeButton(new JButton("<-"), layout, 1, 1, 1, 1, 3);
        makeButton(new JButton("/"), layout, 1, 1, 1, 1, 4);
        
        makeButton(new JButton("7"), layout, 1, 1, 1, 2, 1);
        makeButton(new JButton("8"), layout, 1, 1, 1, 2, 2);
        makeButton(new JButton("9"), layout, 1, 1, 1, 2, 3);
        makeButton(new JButton("*"), layout, 1, 1, 1, 2, 4);
        
        makeButton(new JButton("4"), layout, 1, 1, 1, 3, 1);
        makeButton(new JButton("5"), layout, 1, 1, 1, 3, 2);
        makeButton(new JButton("6"), layout, 1, 1, 1, 3, 3);
        makeButton(new JButton("-"), layout, 1, 1, 1, 3, 4);
        
        makeButton(new JButton("1"), layout, 1, 1, 1, 4, 1);
        makeButton(new JButton("2"), layout, 1, 1, 1, 4, 2);
        makeButton(new JButton("3"), layout, 1, 1, 1, 4, 3);
        makeButton(new JButton("+"), layout, 1, 1, 1, 4, 4);
        
        makeButton(new JButton("0"), layout, 1, 1, 1, 5, 1);
        makeButton(new JButton("."), layout, 1, 1, 1, 5, 2);
        makeButton(new JButton("="), layout, GridBagConstraints.REMAINDER, 1, 1, 5, 3);
    }
    
    void makeButton(JButton button, GridBagLayout gd, int gridwidth, int weightx, int weighty, int gridy, int gridx){
        GridBagConstraints c = new GridBagConstraints();
        
        // Tarkistetaan onko nimessä erikoismerkkejä, eli onko nappi operaatio.
        Matcher m = p.matcher(button.getText());
        boolean b = m.find();
        
        button.setFont(new Font("monospaced", Font.BOLD, 21));
        button.setBackground(Color.white);

        if(b || button.getText() == "C" ){
            button.setFont(new Font("monospaced", Font.PLAIN, 21));
        }
        c.gridwidth = gridwidth;
        c.weightx = weightx;
        c.weighty = weighty;
        c.gridx = gridx;
        c.gridy = gridy;
        c.fill = GridBagConstraints.BOTH;
        gd.setConstraints(button, c);
        add(button);
    }
    
    public static void main(String args[]) {
        new Laskin().setVisible(true);
    }
}
