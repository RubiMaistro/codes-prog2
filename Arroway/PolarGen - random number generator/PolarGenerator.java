/*
 * A program 10 számot fog létrehozni véletlenszerűen.
 * 
 * A számok létrehozásához a polártranszformációt fogja használja a program.
 * 
 */
package Feladatok;

class PolarGen {
	
	boolean nincsTarolt = true;
	double tarolt;
	
	/// Constructor .
	public PolarGen() {
		nincsTarolt = true;
	}
	
	/// Generator .
	public double kovetkezo() {
		
		if(nincsTarolt) {
			double n1, n2, v1, v2, s;
			
			do {
				n1 = Math.random();			// nextDouble() /// .
				n2 = Math.random();			// nextDouble()
				
				v1 = 2 * n1 - 1;			// v1 = 2 * nextDouble() - 1; /// . from nextGaussian
				v2 = 2 * n2 - 1;			// v2 = 2 * nextDouble() - 1; 
				
				s = n1 * n2 + v1 * v2;
				
			} while ( s > 1 );
			
			double r = Math.sqrt(( -2 * Math.log(s)) / s);
			tarolt = r * v2;
			nincsTarolt = !nincsTarolt;
			return r * v1;
		} else {
		
			nincsTarolt = !nincsTarolt;
			return tarolt;
		}
	}
	
}


public class PolarGenerator {
	
	public static void main(String[] args) {
		
		/// Instance .
		PolarGen g = new PolarGen();
		
		for(int i=0; i<10; ++i)
			System.out.println(g.kovetkezo());
	}
	
}
	
