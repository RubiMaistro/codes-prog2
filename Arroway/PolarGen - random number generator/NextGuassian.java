/*
 * A PolárGenerátor beépitett változata.
 * 
 * */

package Feladatok;

public class NextGuassian {
		
		 private double nextNextGaussian;
		 private boolean haveNextNextGaussian = false;

		 public double nextGaussian() {
		   if (haveNextNextGaussian) {
		     haveNextNextGaussian = false;
		     return nextNextGaussian;
		   } else {
		     double n1, n2, v1, v2, s;
		     do {
		    	 n1 = Math.random();	/// nextDouble()
		    	 n2 = Math.random();
		    	
			     v1 = 2 * n1 - 1;   // between -1.0 and 1.0
			     v2 = 2 * n2 - 1;   // between -1.0 and 1.0
			     s = v1 * v1 + v2 * v2;
		     } while (s >= 1 || s == 0);
		     double multiplier = StrictMath.sqrt(-2 * StrictMath.log(s)/s);
		     nextNextGaussian = v2 * multiplier;
		     haveNextNextGaussian = true;
		     return v1 * multiplier;
		   }
		 }

	
}
