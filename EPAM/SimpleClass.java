package EPAM;

class Worker_Simple {
	public long payment;
	public int worktime;
	
	public Worker_Simple() {
		payment = 210000;
		worktime = 8;
	}
	
	public void getPayment() {
		System.out.println("The payment of prog: " + payment + " Ft.");
	}
	
	public void getWorktime() {
		System.out.println("The worktime of prog: " + worktime + " hour/day.");
	}
}

class Programmer_Simple extends Worker_Simple { }

public class SimpleClass {

	public static void main(String[] args) {
		Programmer_Simple obj = new Programmer_Simple();
		
		obj.getPayment();
		obj.getWorktime();

	}

}
