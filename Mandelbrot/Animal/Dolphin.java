package AnimalUML;

public class Dolphin extends Animal
{

	public String jumpHeigh;
	

	public Dolphin(){
		super();
	}

	public void getJump() {
		System.out.println(this.jumpHeigh);	
	}
	
	public void setJump(String jump) {
		this.jumpHeigh = jump;
	}
	
}

