package AnimalUML;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);

		Animal tiger = new Tiger();
		//Animal monkey = new Monkey();
		//Animal dolphin = new Dolphin();
		
		System.out.println(tiger.getClass().getSimpleName() + "property: ");
		System.out.println("Enter the name: ");
		tiger.setName(sc.nextLine());
		System.out.println("Enter the location: ");
		tiger.setLocation(sc.nextLine());
		System.out.println("Enter the age: ");
		tiger.setAge(sc.nextInt());
		
		sc.close();
		
		tiger.getName();
		tiger.getAge();
		tiger.getLoc();
		
	}
}
