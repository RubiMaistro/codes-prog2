package Feladatok;

class Madar {
	public void repul() {
		System.out.println("A " + super.getClass().getSimpleName() + " repül.");
	};
}

class Prog {
	public void fgv ( Madar madar) {
		madar.repul();
	}
}

class Golya extends Madar {};
class Struc extends Madar {};


public class LSPsértés {

	public static void main(String[] args) {
		
		Prog kod = new Prog();
		Madar mad = new Madar();
		kod.fgv (mad);
		Golya golya = new Golya();
		kod.fgv (golya);
		Struc struc = new Struc();
		kod.fgv(struc);

	}

}
