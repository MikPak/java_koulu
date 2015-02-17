/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.rekisteri;

/**
 *
 * @author H8699
 */
public class Exception {
    public static void main(String args[]) {
        try {
            do {
                rivi = r.readLine();
                if (rivi != null) System.out.println(rivi);
                }while (rivi != null);
                    } catch (IOException e) {
                        System.out.println("Virhe tiedoston luvussa!");
                  }
}
}
