package de.habelitz.uebung06;

/*
 * Klasse VogelMitLambda
 * Die Klasse verwendet das Interface Vogelgesang zur Demonstration von Lanbda in der abgeleiteten Klasse Kuckuck
 * @author Hans-Peter Habelitz
 * @date 2019-12-03
 */

public abstract class VogelMitLambda {
    boolean kannFliegen;
    VogelgesangInterface gesang;
    
    
    VogelMitLambda(boolean kannFliegen, VogelgesangInterface gesang) {
	super();
	this.kannFliegen = kannFliegen;
	this.gesang = gesang;
    }
    
    public void singe() {
	System.out.println(gesang.melodie());
    }
}
