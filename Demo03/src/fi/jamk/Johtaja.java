/**
Tehtävä 1.
------------------------
Johtaja-luokka

yksityiset ominaisuudet:
- String: auto
- double: bonus

julkiset metodit:
- konstruktori: jolla voidaan alustaa kaikki johtajan ominaisuudet parametrien kautta (myös yliluokassa määritellyt)

Johtaja konstruktorissa tulee kutsua yliluokan konstruktoria attribuuttien nimi, asema ja palkka alustuksessa.

+ muutaAuto() - muuttaa auto attribuuttia
+ muutaBonus() - muuttaa bonus attribuuttia
+ annaTiedot() - palauttaa kaikki johtajan ominaisuudet yhtenä merkkijonona 

Tekijä: Mikko Pakkanen
Pvm: 27.1.2015
**/

package fi.jamk;

public class Johtaja extends Tyontekija {

    private String auto;
    private double bonus;
    
    // Konstruktori
    public Johtaja(String nimi, String asema, double palkka, String auto, double bonus) {
        super(nimi, asema, palkka);
        this.auto = auto;
        this.bonus = bonus;
    }
    
    public void muutaAuto(String auto) {
        this.auto = auto;
    }
    
    public void muutaBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public String annaTiedot() {
        return super.annaTiedot() + " Auto: " + this.auto + " Bonus: " + this.bonus + "";
    }
}
