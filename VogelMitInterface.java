package de.habelitz.uebung06;

/*
 * Klasse VogelMitInterface
 * Die Klasse implementiert das Interface Vogelgesang
 * @author Hans-Peter Habelitz
 * @date 2019-12-03
 */

public abstract class VogelMitInterface implements VogelgesangInterface {
    boolean kannFliegen;
    
    VogelMitInterface() {
	kannFliegen = true;
    }
    
    VogelMitInterface(boolean kannFliegen) {
	super();
	this.kannFliegen = kannFliegen;
    }
    
    public void singe() {
	System.out.println(melodie());
    }
    
}
