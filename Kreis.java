package de.habelitz.uebung06;

/*
 * Klasse Kreis
 * @author Hans-Peter Habelitz
 * @date 2019-08-29
 */

public class Kreis extends TeilMitRundung{
	
	Kreis(double r) {
		super(r);
	}

    double getFlaeche() {
	return Math.PI * getRadius() * getRadius();
    }
    
    double getUmfang() {
	return 2 * Math.PI * getRadius();
    }
}
