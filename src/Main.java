
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Aufgabe a");
		System.out.println("---------------------------------------------------");
		
//		Es soll eine Klasse Rechteck entworfen werden. Das Rechteck wird durch die Attribute seiteA
//		und seiteB ( Typ double ) beschrieben und speichert die Daten ( Einheit cm ). Erzeugen sie
//		jeweils 2 Methoden zum Setzen und lesen der Attribute (Getter und Setter Methoden).
		
//		Testen Sie die Klasse Rechteck in einem Hauptprogramm. Erzeugen sie zwei Objekte der
//		Klasse, setzten sie die Werte f�r die Seiten A/B und geben sie anschlie�end die Werte der
//		Seiten aus.
		
		Rechteck rechteck_1 = new Rechteck(5.1, 2.3);
		Rechteck rechteck_2 = new Rechteck(3.3, 3.3);
		
		System.out.printf("%-15s %-15s %-15s", "Rechteck", "Seite_a, cm", "Seite_b, cm");
		System.out.println();
		System.out.printf("%-15s %-15s %-15s", "rechteck_1", rechteck_1.getSeite_a(), rechteck_1.getSeite_b());
		System.out.println();
		System.out.printf("%-15s %-15s %-15s", "rechteck_2", rechteck_2.getSeite_a(), rechteck_2.getSeite_b());
		System.out.println();
		System.out.println();
		
		System.out.println("Aufgabe b");
		System.out.println("---------------------------------------------------");
		
//		Es soll eine Methode hinzugef�gt werden. Die Methode showFlaeche () gibt die Fl�che im
//		Format m2 auf dem Bildschirm aus.
//		Testen Sie die neue Methode ebenfalls im Hauptprogramm, indem Sie sich die Fl�chen der
//		beiden Rechtecke ausgeben lassen.
		
		System.out.printf("%-15s %-15s %-15s", "Rechteck", "Fl�che", "Einheit");
		System.out.println();
		System.out.printf("%-15s %-15s %-15s", "rechteck_1", rechteck_1.showFlaeche(), "m2");
		System.out.println();
		System.out.printf("%-15s %-15s %-15s", "rechteck_2", rechteck_2.showFlaeche(), "m2");
		System.out.println();
		System.out.println();
		
		System.out.println("Aufgabe c");
		System.out.println("---------------------------------------------------");
		
//		Es soll eine weitere Methode erg�nzt werden, welche die Werte f�r beide Seiten setzt.
//		Hierf�r soll eine Methode mit zwei �bergabeparametern geschrieben werden. Vor dem
//		setzten der Werte sollen die �bergebenen Parameter auf Korrektheit �berpr�ft werden. Nur
//		Werte gr��er 0 sind erlaubt.
		
		Rechteck rechteck_3 = new Rechteck();
		rechteck_3.setNeueParameter(10.5, 2.7);
		System.out.printf("%-15s %-15s %-15s", "Rechteck", "Seite_a, cm", "Seite_b, cm");
		System.out.println();
		System.out.printf("%-15s %-15s %-15s", "rechteck_3", rechteck_3.getSeite_a(), rechteck_3.getSeite_b());
		System.out.println();
		System.out.println();
		
		Rechteck rechteck_4 = new Rechteck();
		rechteck_4.setNeueParameter(-5.1, 6.7);
		System.out.printf("%-15s %-15s %-15s", "Rechteck", "Seite_a, cm", "Seite_b, cm");
		System.out.println();
		System.out.printf("%-15s %-15s %-15s", "rechteck_4", rechteck_4.getSeite_a(), rechteck_4.getSeite_b());
		System.out.println();
		System.out.println();
		
		System.out.println("Aufgabe d");
		System.out.println("---------------------------------------------------");
		
//		Die n�chste Methode soll pr�fen ob es sich beim Rechteck um ein Quadrat handelt. Das
//		Ergebnis (true o. false) soll der R�ckgabewert der Methode sein.
		
		System.out.printf("%-15s %-15s", "Rechteck", "Quadrat, t/f");
		System.out.println();
		System.out.printf("%-15s %-15s", "rechteck_1", rechteck_1.istQuadrat());
		System.out.println();
		System.out.printf("%-15s %-15s", "rechteck_2", rechteck_2.istQuadrat());
		System.out.println();
		System.out.printf("%-15s %-15s", "rechteck_3", rechteck_3.istQuadrat());
		System.out.println();
		System.out.printf("%-15s %-15s", "rechteck_4", rechteck_4.istQuadrat());
		System.out.println();
		System.out.println();
		
		System.out.println("Aufgabe e");
		System.out.println("---------------------------------------------------");
		
//		Nun sollen zwei Konstruktoren definiert werden. Der Standardkonstruktor (keine
//		�bergabeparameter) soll die Werte beider Seiten auf 1 setzen. Der zweite Konstruktor hat
//		als �bergabeparameter die Werte f�r die beiden Seiten und setzte diese direkt.
		
		Rechteck rechteck_5 = new Rechteck();
		System.out.printf("%-15s %-15s %-15s", "Rechteck", "Seite_a, cm", "Seite_b, cm");
		System.out.println();
		System.out.printf("%-15s %-15s %-15s", "rechteck_5", rechteck_5.getSeite_a(), rechteck_5.getSeite_b());
		System.out.println();
		System.out.println();
		
		System.out.println("Aufgabe f");
		System.out.println("---------------------------------------------------");
		
//		Nun sollen sie Methoden zum setzten der Seiten �berladen werden. Es wird jeweils eine
//		zweite Methode mit dem gleichen Namen angelegt, allerdings sind die �bergabeparameter
//		vom Typ String
		
		Rechteck rechteck_6 = new Rechteck();
		rechteck_6.setNeueParameter("3.6", "9");
		System.out.printf("%-15s %-15s %-15s", "Rechteck", "Seite_a, cm", "Seite_b, cm");
		System.out.println();
		System.out.printf("%-15s %-15s %-15s", "rechteck_6", rechteck_6.getSeite_a(), rechteck_6.getSeite_b());
		System.out.println();
		System.out.println();
		
		Rechteck rechteck_7 = new Rechteck();
		rechteck_6.setNeueParameter("Drei", "F�nf");
		System.out.printf("%-15s %-15s %-15s", "Rechteck", "Seite_a, cm", "Seite_b, cm");
		System.out.println();
		System.out.printf("%-15s %-15s %-15s", "rechteck_7", rechteck_7.getSeite_a(), rechteck_7.getSeite_b());
		System.out.println();
		System.out.println();
		
		System.out.println("Aufgabe g");
		System.out.println("---------------------------------------------------");
		
//		Im letzten Schritt soll gez�hlt werden wie viele Instanzen der Klasse Rechteck erzeugt
//		werden. Au�erdem soll es eine Methode geben, die zur�ckgibt, die welche Instanznummer
//		ein Objekt hat
		
		System.out.println(Rechteck.anzahl);
		System.out.println();
		
		System.out.println("Aufgabe +");
		System.out.println("---------------------------------------------------");
		
//		Zeichen Rechteck		
		
		Rechteck rechteck_8 = new Rechteck(9,11);
		rechteck_8.zeichenRechteck();
	}

}
