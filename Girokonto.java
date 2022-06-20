package de.habelitz.uebung06;

/*
 * Klasse Girokonto abgeleitet von Konto
 * @author Hans-Peter Habelitz
 * @date 2019-08-29
 */

public class Girokonto extends Konto {
    double limit;

    Girokonto(String knr, double ks, double l) {
	super(knr, ks);
	limit = l;
    }

    double getLimit() {
	return limit;
    }

    void setLimit(double l) {
	limit = l;
    }

    void auszahlen(double betrag) {
	if ((getKontostand() - betrag) >= limit * (-1)) {
	    super.auszahlen(betrag);
	} else {
	    System.out.println("Fehler - Kreditlimit überschritten!");
	}
    }
}
