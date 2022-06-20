package de.habelitz.uebung06;

/*
 * Klasse Bruch_mit_Seriennummer
 * @author Hans-Peter Habelitz
 * @date 2019-08-29
 */

public class BruchMitSeriennummer extends Bruch {
    static int anzahlBrueche = 0;
    private final int seriennummer;

    BruchMitSeriennummer(int x, int y) {
	super(x, y);
	anzahlBrueche++;
	seriennummer = anzahlBrueche;
    }

    BruchMitSeriennummer() {
	this(0, 1);
    }

    BruchMitSeriennummer(int x) {
	this(x, 1);
    }

    int getSeriennummer() {
	return seriennummer;
    }
}
