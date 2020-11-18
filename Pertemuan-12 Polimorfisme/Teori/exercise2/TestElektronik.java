/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teori.exercise2;

/**
 *
 * @author Vega
 */
public class TestElektronik {
    public static void main(String[] args) {
        Manusia lemon = new Manusia();
        TelevisiJadul tvJadul = new TelevisiJadul();
        TelevisiModern tvModern = new TelevisiModern();

        lemon.nyalakanPerangkat(tvJadul);
        lemon.nyalakanPerangkat(tvModern);
    }
}
