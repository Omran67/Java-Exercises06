package de.habelitz.uebung06;

/*
 * Klasse Kreissegment
 * @author Hans-Peter Habelitz
 * @date 2019-08-29
 */

public class Kreissegment extends TeilMitRundung {
    double winkel;
    
    Kreissegment() {
	super();
	winkel = 90;
    }
    
    Kreissegment(double r, double w) {
	super(r);
	winkel = w;
    }
    
    double getFlaeche() {
	return Math.PI * getRadius() * getRadius() * winkel / 360;
    }
    
    double getUmfang() {
	return 2 * Math.PI * getRadius() * winkel / 360 + 2 * getRadius();
    }

}
