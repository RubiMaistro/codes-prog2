package EPAM;

abstract class Worker_abstract {
	public abstract void getPayment();
	
	public void getWorktime(int worktime) {
		System.out.println("The worktime of prog: " + worktime + " hour/day.");
	}
}

class Programmer_abstract extends Worker_abstract {

	public long payment = 210000;
	public int worktime = 8;
	
	public void getPayment() {
		System.out.println("The payment of prog: " + this.payment + " Ft.");
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {
		
		Programmer_abstract mypro = new Programmer_abstract();
				
		mypro.getPayment();
		mypro.getWorktime(8);

	}

}
