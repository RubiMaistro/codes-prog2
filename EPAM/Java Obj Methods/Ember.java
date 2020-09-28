package EpamObjectMethods;

import java.lang.Object;

class Human2{
	String Name;
}

class Human implements Cloneable{
	
	Human2 first = new Human2();
	
	String name;
	int age;
	
	public Human() {
		name = "not init";
		age = 0;
	}
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getNev() {
		System.out.println(name);
	}
	
	public void getKor() {
		System.out.println(age);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  "toString: " + getClass().getSimpleName() + " : " + hashCode() ;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class Ember {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Human Ati = new Human("Attila", 22);
		Human Attila = (Human)Ati.clone();
		Human Laci = new Human("László", 21);
		
		
		Laci.first.Name = "Nagy";
		
		Attila.getNev();
		
		System.out.println("\nToSrting");
		System.out.println(Ati.toString());
		System.out.println(Attila.toString());
		
		System.out.println("\nHashCode");
		System.out.println(Ati.hashCode() + " " + Attila.hashCode());
		System.out.println(Attila.hashCode() + " " + Laci.hashCode());
		
		System.out.println("\nClone");
		System.out.println(Laci.name);
		System.out.println(Laci.first.Name +" "+ Laci.name);
		
		System.out.println("\nEquals");
		System.out.println("Ati = Attila ?: " + Ati.equals(Attila));
		System.out.println("Attila = Laci ?: " + Attila.equals(Laci));
		
	}
}
