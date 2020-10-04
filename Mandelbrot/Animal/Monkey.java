package AnimalUML;

public class Monkey extends Animal
{
	
	public String specie;

	public Monkey(){
		super();
	}
	
	public void getSpecie() {
		System.out.println(this.specie);	
	}
	
	public void setSpecie(String specie) {
			this.specie = specie;
	}
	
}

