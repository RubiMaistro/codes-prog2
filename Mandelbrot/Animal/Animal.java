package AnimalUML ;

public class Animal
{
	
	public String Name;
	public int Age;
	public String Location;
	
	
	public Animal(){
		
	}

	public void getName() {
		System.out.println(getClass().getSimpleName() + " name: " + this.Name);
	}
	
	public void getAge() {
		System.out.println(getClass().getSimpleName() + " age: " + this.Age);
	}
	
	public void getLoc() {
		System.out.println(getClass().getSimpleName() + " location: " + this.Location);	
	}

	public void setName(String name) {
		this.Name = name;
	}
	
	public void setAge(int age) {
		this.Age = age;	
	}
	
	public void setLocation(String loc) {
		this.Location = loc;
	}
	
}

