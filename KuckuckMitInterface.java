package de.habelitz.uebung06;

/*
 * Klasse KuckuckMitInterface abgeleitet von der Klasse VogelMitInterface
 * @author Hans-Peter Habelitz
 * @date 2019-12-03
 */

public class KuckuckMitInterface extends VogelMitInterface {

    @Override
    public String melodie() {
	return "Kuckuck";
    }

}
