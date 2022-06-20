package de.habelitz.uebung06;

/*
 * Programm Girokontotest zum Testen der Klasse Girokonto
 * @author Hans-Peter Habelitz
 * @date 2019-08-29
 */

public class Girokontotest {
    public static void main(String args[]) {
	var gk = new Girokonto("0000000001", 10000.0, 1000.0);
	gk.auszahlen(11000.0);
	System.out.println("Kontostand: " + gk.getKontostand());
	gk.einzahlen(11000.0);
	gk.auszahlen(11001.0);
	System.out.println("Kontostand: " + gk.getKontostand());
    }
}
