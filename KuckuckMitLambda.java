package de.habelitz.uebung06;

/*
 * Klasse KuckuckMitLambda abgeleitet von VogelMitLambda zur Demonstration von Lambda-Expression
 * @author Hans-Peter Habelitz
 * @date 2019-12-03
 */

public class KuckuckMitLambda extends VogelMitLambda{
    
    KuckuckMitLambda() {
	super(true, () -> {return "Kuckuck";});
    }
}
