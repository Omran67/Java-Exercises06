package de.habelitz.uebung06;

/*
 * Klasse Vogel
 * @author Hans-Peter Habelitz
 * @date 2019-12-03
 */

public abstract class Vogel {
    boolean kannFliegen;
    
    Vogel() {
	kannFliegen = true;
    }
    
    Vogel(boolean kannFliegen) {
	this.kannFliegen = kannFliegen;
    }
    
    public abstract void singe();
}
