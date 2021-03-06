package de.habelitz.uebung06;

/*
 * Programm Kontotest zum Testen der Klasse Konto
 * @author Hans-Peter Habelitz
 * @date 2019-08-29
 */

public class Kontotest {
    public static void main(String[] args) {
	var k = new Konto("0000000001", 1000);
	System.out.println("Kontonummer: " + k.getKontonummer());
	System.out.println("Kontostand: " + k.getKontostand());
	k.einzahlen(500);
	System.out.println("500,00 ? eingezahlt!");
	k.auszahlen(750.50);
	System.out.println("750,50 ? ausgezahlt!");
	System.out.println("Kontonummer: " + k.getKontonummer());
	System.out.println("Kontostand: " + k.getKontostand());

    }

}
