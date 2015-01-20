/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk;

/**
 *
 * @author H8699
 */
public class AutoTesti {
    public static void main(String args[]) {
        Auto auto = new Auto();
        auto.setMerkki("Saab");
        auto.setVuosimalli(1900);
        auto.kiihdyta();
        System.out.println(auto.getTiedot());
        
        // luodaan toinen olio Auto-luokasta
        Auto kaara = new Auto("Volkswagen", 2015, 200);
        System.out.println(kaara.getTiedot());
    }
}
