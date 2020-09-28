/*
 * Egyke programtervezési minta
 * 
 * Egy obijektumra korlátozza az osztály létrehozható példányainak a számát
 * 
 * Memóriát sporol, mert nem lesz minden alkalommal létrehozva, amikor kell, csak egyszer és újra és újra lesz használva
 * A globális változókkal szemben gyakran az egykéket részesítik elõnyben, mivel:
 * 	Nem szennyezik a névteret szükségtelen változókkal.
 * 	Lehetõvé teszik a lusta allokációt és inicializációt, míg a globális változók mindig fogyasztanak erõforrásokat. 
 * Az egyke használható lusta inicializációval. Ekkor a példány csak az osztálymetódus elsõ hívásakor jön létre. 
 * Ha ezt párhuzamos környezetben használják, akkor biztosítani kell, hogy ne legyen race condition, különben 
 * több szál is létrehozhat egy példányt, ami kritikus a rendszer szempontjából, és annak összeomlását 
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