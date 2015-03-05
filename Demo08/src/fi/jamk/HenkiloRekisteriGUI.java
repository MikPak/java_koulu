/**
SWING - Henkilörekisteri
------------------------

Suunnittele ja toteuta aikaisemmissa demoissa käsiteltyyn henkilörekisteriin 
graafinen käyttöliittymä
- sovelluksessa tulee voida "selata" rekisterissä olevia tietoja

Vihjeitä:
- tee käyttöliittymä designerilla (tai ohjelmoimalla)
- käytä aikaisempia Henkilo- ja Rekisteri-luokkia
- luo Rekisteri- ja Henkilö-luokan olioita (lisää rekisteriin) GUI-luokan 
konstruktorissa
- komponenttien alustuksen jälkeen kirjoita ensimmäisen henkilön tiedot 
tekstikenttiin
- ohjelmoi Edellinen- ja Seuraava-painikkeet näyttämään rekisterin henkilöitä

// muutamia vihjeitä avuksi
// JTextField ja JLabel komponentteihin voit laittaa tekstiä setText(String)-metodilla
etunimiTextField.setText(h.getEtunimi());

// JTextField ja JLabel komponenteista saat tekstit getText()-metodilla
String etunimi = etunimiTextField.getText();

Tekijä: Mikko Pakkanen
Pvm: 04.03.2015
**/

package fi.jamk;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class HenkiloRekisteriGUI extends JFrame {
    private GridBagConstraints lastConstraints = null;
    private GridBagConstraints middleConstraints = null;
    private GridBagConstraints labelConstraints = null;
   
    private Rekisteri hessut = new Rekisteri();
    private JTextField etunimi = new JTextField();
    private JTextField sukunimi = new JTextField();
    private JTextField sotu = new JTextField();
    private int buttonClicks = 1;
    private ArrayList<Henkilo> hessut_lista = new ArrayList<Henkilo>();
    
    public HenkiloRekisteriGUI() {
        // Lisätään henkilöitä rekisteriin
        Henkilo hessu = new Henkilo("Hessu", "Hopo", "313"); 
        hessut.addHenkilo(hessu);
        
        hessu = new Henkilo("Aku", "Ankka", "123");
        hessut.addHenkilo(hessu);
        
        hessu = new Henkilo("Mikki", "Hiiri", "777");
        hessut.addHenkilo(hessu);
        
        // Määritellään rajoitteet komponenteille
        // Viimeinen komponentti, käyttää mahdollisimman paljon tilaa ikkunan koon muuttuessa
        lastConstraints = new GridBagConstraints();
        lastConstraints.fill = GridBagConstraints.HORIZONTAL; // Ottaa kaiken ylijäävän tilan vaakasuunnassa
        lastConstraints.anchor = GridBagConstraints.NORTHWEST; // Sijoitetaan vasempaan ylänurkkaan komponentit jotka ovat liian kapeita tilaansa.
        lastConstraints.weightx = 1.0; // Viimeinen komponentti käyttää eniten tilaa
        lastConstraints.gridwidth = GridBagConstraints.REMAINDER; // Viimeinen komponentti saa kaiken tilan rivillä
        lastConstraints.insets = new Insets(1, 1, 1, 1); // Pehmustus (Padding)
        
        // Keskimmäinen komponentti
        middleConstraints = (GridBagConstraints)lastConstraints.clone(); // Kloonataan määrittelyt ensimmäisestä
        middleConstraints.gridwidth = GridBagConstraints.RELATIVE; // Sama kuin REMAINDER, muttei sulje riviä
        
        // Määrittelyt label-komponentille
        labelConstraints = (GridBagConstraints) lastConstraints.clone(); // Kloonataan määrittelyt ensimmäisestä
        labelConstraints.weightx = 0.0; // Label käyttää mahdollisimman vähän tilaa
        labelConstraints.gridwidth = 1;
        labelConstraints.fill = GridBagConstraints.NONE;
        
        // Luodaan JFrame sekä JPanel sekä asetetaan panelin sijainti ikkunan yläosaan
        JFrame f = new JFrame("Henkilörekisteri");
        JPanel form = new JPanel();
        f.getContentPane().setLayout(new BorderLayout());
        f.getContentPane().add(form, BorderLayout.NORTH);
        
        // Paneeli käyttää GridBagLayout-manageria
        form.setLayout(new GridBagLayout());
        form.setBorder(new EmptyBorder(10, 10, 10, 10)); // Marginaali reunoista 
        
        etunimi.setText(hessut.getHenkilo(0).getEtunimi());
        sukunimi.setText(hessut.getHenkilo(0).getSukunimi());
        sotu.setText(hessut.getHenkilo(0).getSotu());
        
        /* Lisätään JLabelit ja JTextFieldit sekä alustetaan ne rekisterin ensimmäisellä alkiolla. */
        this.addLabel("Etunimi: ", form);
        this.addLastField(etunimi, form);
        this.addLabel("Sukunimi: ", form);
        this.addLastField(sukunimi, form);
        this.addLabel("Sotu: ", form);
        this.addLastField(sotu, form);
        this.addLabel("", form);
        
        // Lisätään napit
        this.addButton(new JButton("Edellinen"), form);
        this.addButton(new JButton("Seuraava"), form);
        
        hessut_lista = hessut.toArrayList();
        
        // Määreitä pääikkunalle
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 150);
        f.setVisible(true);
    }
    
    private Component addLastField(Component c, Container parent) {
        GridBagLayout gbl = (GridBagLayout) parent.getLayout();
        gbl.setConstraints(c, lastConstraints);
        parent.add(c);
        
        return c;
    }
    
    private void addLabel(Component c, Container parent) {
        GridBagLayout gbl = (GridBagLayout) parent.getLayout();
        gbl.setConstraints(c, labelConstraints);
        parent.add(c);
    }
    
    private JLabel addLabel(String s, Container parent) {
        JLabel c = new JLabel(s);
        addLabel(c, parent);
        return c;
    }
    
    private void addButton(Component c, Container parent) {
        JButton b = (JButton)c;
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton pressed = (JButton) e.getSource();
                
                // Määritellään mitä tapahtuu kun painellaan nappeja
                if(pressed.getText().contains("Seuraava") && buttonClicks < hessut.getHenkilomaara()) {
                    Iterator<Henkilo> it = hessut_lista.listIterator(buttonClicks);
                    if(it.hasNext()) {
                       Henkilo hessu = it.next();
                       etunimi.setText(hessu.getEtunimi());
                       sukunimi.setText(hessu.getSukunimi());
                       sotu.setText(hessu.getSotu());
                    }
                    buttonClicks++;
                    System.out.println(buttonClicks);
                } else if(pressed.getText().contains("Edellinen") && buttonClicks > 1) {
                    Iterator<Henkilo> it = hessut_lista.listIterator(buttonClicks-2);
                    if(it.hasNext()) {
                       Henkilo hessu = it.next();
                       etunimi.setText(hessu.getEtunimi());
                       sukunimi.setText(hessu.getSukunimi());
                       sotu.setText(hessu.getSotu());
                    }
                    buttonClicks--;
                    System.out.println(buttonClicks);
                }
            }
        });
        
        GridBagLayout gbl = (GridBagLayout) parent.getLayout();
        gbl.setConstraints(c, labelConstraints);
        parent.add(c);
    }
    
    private void updateJTextField(JTextField f, String s) {
        
    }
    
    public static void main(String args[]) {
        // Asetetaan ikkunan ulkoasu järjestelmää vastaavaksi.
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Haluttu tuntuma ei löydy.");
        }
        new HenkiloRekisteriGUI();
    }
}
