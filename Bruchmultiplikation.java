package de.habelitz.uebung06;

/*
 * Programm Bruchmultiplikation
 * @author Hans-Peter Habelitz
 * @date 2019-08-29
 */

import javax.swing.JOptionPane;

public class Bruchmultiplikation {
    public static void main(String args[]) {
        var eingabe = JOptionPane.showInputDialog(
                      "Geben Sie den Zähler von Bruch a ein: ");
        var z = Integer.parseInt(eingabe);
        eingabe = JOptionPane.showInputDialog(
                      "Geben Sie den Nenner von Bruch a ein: ");
        var n = Integer.parseInt(eingabe);
        var a = new Bruch(z, n);
        eingabe = JOptionPane.showInputDialog(
                      "Geben Sie den Zähler von Bruch b ein: ");
        z = Integer.parseInt(eingabe);
        eingabe = JOptionPane.showInputDialog(
                      "Geben Sie den Nenner von Bruch b ein: ");
        n = Integer.parseInt(eingabe);
        var b = new Bruch(z, n);
        var c = a.multipliziere(b);
        System.out.println("Bruch a: " + a.bruchToString());
        System.out.println("Bruch b: " + b.bruchToString());
        System.out.println("Bruch c: " + c.bruchToString());
    }
}
