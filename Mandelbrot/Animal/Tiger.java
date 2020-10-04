package AnimalUML;

public class Tiger extends Animal
{
	
	public int weight;

	public Tiger(){
		super();
	}
	
	public void getWeight() {
		System.out.println(this.weight);
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}

