package de.habelitz.uebung06;

/*
 * Programm Seriennummerntest zum Testen der Klasse
 * Bruch_mit_Seriennummer
 * @author Hans-Peter Habelitz
 * @date 2019-08-29
 */

public class Seriennummerntest {
    public static void main(String[] args) {
	var a = new BruchMitSeriennummer(1, 2);
	var b = new BruchMitSeriennummer(1, 3);
	var c = new BruchMitSeriennummer(1, 4);
	var d = new BruchMitSeriennummer(1, 6);
	var e = new BruchMitSeriennummer(1, 8);
	System.out.println(a.bruchToString() + " Seriennummer: "
		+ a.getSeriennummer());
	System.out.println(b.bruchToString() + " Seriennummer: "
		+ b.getSeriennummer());
	System.out.println(c.bruchToString() + " Seriennummer: "
		+ c.getSeriennummer());
	System.out.println(d.bruchToString() + " Seriennummer: "
		+ d.getSeriennummer());
	System.out.println(e.bruchToString() + " Seriennummer: "
		+ e.getSeriennummer());
    }

}
