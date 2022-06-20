package de.habelitz.uebung06;

/*
 * Klasse TeilMitRundung
 * @author Hans-Peter Habelitz
 * @date 2019-08-29
 */

public class TeilMitRundung {
    private double radius;

    TeilMitRundung() {
	radius = 1;
    }

    TeilMitRundung(double r) {
	radius = r;
    }

    double getRadius() {
	return radius;
    }

    void setRadius(double r) {
	radius = r;
    }

    void radiusVergroessernUm(double vr) {
	radius = radius + vr;
    }
}
