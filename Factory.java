
/*
 * Factory Method Pattern
 * meg kell határozni egy inteface-t vagy absztrakt osztályt hogy obijektumokat hozzunk létre
 * és az alosztályok döntik el, melyik osztályok példányosítanak
 * Az az, az alosztályok felelösek az osztályok példányosításában
 * 
 * Használat
 * Ha egy osztály nem tudja, melyik alosztályt kell majd létrehozni
 * Ha egy osztály azt akarja, hogy az alosztály adja meg az objektumot
 * Amikor a szülõ osztály az alosztályban hozza létre az obijektumot
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
        
	      System.out.print("Tejet vagy kenyeret szeretnél vásárolni a Tescoban?: ");  
	      BufferedReader vasarlas = new BufferedReader(new InputStreamReader(System.in));  
	  
	      String kajaNeve = vasarlas.readLine();  
	      System.out.print("Hány darabot szeretnél vásárolni?: ");  
	      int db = Integer.parseInt(vasarlas.readLine());  
	  
	      Tesco kaja = planFactory.getKaja(kajaNeve);  
	  
	       System.out.print("A " + db + " " + kajaNeve + " ára forintban: ");    
	       kaja.getCost();
	       kaja.nyugta(db);  

	}

}
