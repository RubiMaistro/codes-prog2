package CreationDesignPatterns;

public class Singleton {

	public static void main(String[] args) {

	      SingleObject object = SingleObject.getInstance();
	      SingleObject obj2 = SingleObject.getInstance();

	      //show the message
	      object.showMessage();
	      
	      obj2.showMessage();

	}

}
