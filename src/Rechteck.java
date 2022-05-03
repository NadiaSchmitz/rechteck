import java.text.DecimalFormat;

public class Rechteck {

	private double seite_a;
	private double seite_b;
	public static int anzahl;

	DecimalFormat df = new DecimalFormat("###.#");
	
	public Rechteck(double seite_a, double seite_b) {
		this.seite_a = seite_a;
		this.seite_b = seite_b;
		anzahl++;
	}
	
	public Rechteck() {
		this.seite_a = 1;
		this.seite_b = 1;
		anzahl++;
	}
	
	public double getSeite_a() {
		return seite_a;
	}
	
	public void setSeite_a(double seite_a) {
		this.seite_a = seite_a;
	}
	
	public double getSeite_b() {
		return seite_b;
	}
	
	public void setSeite_b(double seite_b) {
		this.seite_b = seite_b;
	}
	
	public String showFlaeche() {
		return df.format(seite_a * seite_b);
	}
	
	public void setNeueParameter(double a, double b) {
		if (a > 0 & b > 0) {
			seite_a = a;
			seite_b = b;
		} else {
			System.out.println("Nur die Werte größer 0 sind erlaubt.");
		}
	}
	
	public void setNeueParameter(String a, String b) {
		double convert_a = 0;
		double convert_b = 0;
		try {
			convert_a = Double.parseDouble(a);
			convert_b = Double.parseDouble(b);
			
			if (convert_a > 0 & convert_b > 0) {
				seite_a = convert_a;
				seite_b = convert_b;
			} else {
				System.out.println("Nur die Werte größer 0 sind erlaubt.");
			}
			
	    } catch (NumberFormatException e) {
	        System.err.println("String kann nicht in double konvertiert werden.");
	    }    
	}
	
	public boolean istQuadrat() {
		boolean istQuadrat = false;
		if (this.seite_a > 0 & this.seite_b > 0) {
			if (this.seite_a == this.seite_b) {
				istQuadrat = true;
			}
		}
		return istQuadrat;
	}
	
	public void zeichenRechteck() {
		for (int i = 0; i < seite_a; i++) {
			for (int j = 0; j < seite_b; j++) {
				System.out.print("@ ");
			}
			
			System.out.print("@");
			System.out.println();
		}
	}
	
}
