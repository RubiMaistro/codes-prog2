package Feladatok;

class Parent {
	public void parent() {
		System.out.println("Parent class.");
	}
}

class Child extends Parent {
	public void child() {
		System.out.println("Child class");
	}
}

public class ParentChild {

	public static void main(String[] args) {
			
		Parent parent = new Parent();
		Child child = new Child();
		
		parent.parent();
		child.parent();
		child.child();
		// Nem l�tja a sz�l� oszt�ly a gyerek oszt�ly f�ggv�nyeit.
		//parent.child();

	}

}
