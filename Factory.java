
/*
 * Factory Method Pattern
 * meg kell hat�rozni egy inteface-t vagy absztrakt oszt�lyt hogy obijektumokat hozzunk l�tre
 * �s az aloszt�lyok d�ntik el, melyik oszt�lyok p�ld�nyos�tanak
 * Az az, az aloszt�lyok felel�sek az oszt�lyok p�ld�nyos�t�s�ban
 * 
 * Haszn�lat
 * Ha egy oszt�ly nem tudja, melyik aloszt�lyt kell majd l�trehozni
 * Ha egy oszt�ly azt akarja, hogy az aloszt�ly adja meg az objektumot
 * Amikor a sz�l� oszt�ly az aloszt�lyban hozza l�tre az obijektumot
 */

package CreationDesignPatterns;

import java.io.*;

abstract class Tesco{  
    protected double ar;  
    abstract void getCost();  

    public void nyugta(int termek){  
         System.out.println(termek*ar);  
     }  
}

class Tej extends Tesco{  
    //@override  
     public void getCost(){  
         ar=320;              
    }  
}

class Kenyer extends Tesco{  
	   //@override   
	    public void getCost(){   
	        ar=400;  
	   }
}

class GetPlanFactory{  
    
	       public Tesco getKaja(String kaja){  
	            if(kaja == null){  
	             return null;  
	            }  
	          if(kaja.equalsIgnoreCase("TEJ")) {  
	                 return new Tej(); 
	               }   
	           else if(kaja.equalsIgnoreCase("KENYER")){  
	                return new Kenyer();  
	            }    
	      return null;  
	   }  
	}

public class Factory {

	public static void main(String[] args) throws IOException {
		
		GetPlanFactory planFactory = new GetPlanFactory();  
        
	      System.out.print("Tejet vagy kenyeret szeretn�l v�s�rolni a Tescoban?: ");  
	      BufferedReader vasarlas = new BufferedReader(new InputStreamReader(System.in));  
	  
	      String kajaNeve = vasarlas.readLine();  
	      System.out.print("H�ny darabot szeretn�l v�s�rolni?: ");  
	      int db = Integer.parseInt(vasarlas.readLine());  
	  
	      Tesco kaja = planFactory.getKaja(kajaNeve);  
	  
	       System.out.print("A " + db + " " + kajaNeve + " �ra forintban: ");    
	       kaja.getCost();
	       kaja.nyugta(db);  

	}

}
