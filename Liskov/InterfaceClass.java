package EPAM;

interface Worker_interface {
	public void getPayment();
	public void getWorktime();
}

class Programmer_interface implements Worker_interface {

	public long payment = 210000;
	public int worktime = 8;
	
	public void getPayment() {
		System.out.println("The payment of prog: " + this.payment + " Ft.");
	}
	
	public void getWorktime() {
		System.out.println("The worktime of prog: " + this.worktime + " hour/day.");
	}
}

public class InterfaceClass {

	public static void main(String[] args) {
		
		Programmer_interface mypro = new Programmer_interface();
		
		mypro.getPayment();
		mypro.getWorktime();

	}

}
