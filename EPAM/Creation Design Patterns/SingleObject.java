/*
 * Egyke programtervez�si minta
 * 
 * Egy obijektumra korl�tozza az oszt�ly l�trehozhat� p�ld�nyainak a sz�m�t
 * 
 * Mem�ri�t sporol, mert nem lesz minden alkalommal l�trehozva, amikor kell, csak egyszer �s �jra �s �jra lesz haszn�lva
 * A glob�lis v�ltoz�kkal szemben gyakran az egyk�ket r�szes�tik el�nyben, mivel:
 * 	Nem szennyezik a n�vteret sz�ks�gtelen v�ltoz�kkal.
 * 	Lehet�v� teszik a lusta allok�ci�t �s inicializ�ci�t, m�g a glob�lis v�ltoz�k mindig fogyasztanak er�forr�sokat. 
 * Az egyke haszn�lhat� lusta inicializ�ci�val. Ekkor a p�ld�ny csak az oszt�lymet�dus els� h�v�sakor j�n l�tre. 
 * Ha ezt p�rhuzamos k�rnyezetben haszn�lj�k, akkor biztos�tani kell, hogy ne legyen race condition, k�l�nben 
 * t�bb sz�l is l�trehozhat egy p�ld�nyt, ami kritikus a rendszer szempontj�b�l, �s annak �sszeoml�s�t 
 * okozhatja
 */


package CreationDesignPatterns;

public class SingleObject {

   //create an object of SingleObject
   private static SingleObject instance = new SingleObject();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingleObject(){}

   //Get the only object available
   public static SingleObject getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("Hello World!");
   }
}