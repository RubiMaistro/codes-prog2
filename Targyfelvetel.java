package EpamUML;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Targy {
	protected int csoport;
	protected int ferohely;
	abstract void getHely();
	abstract int getRand();
	
		
	public void eredmeny(String muvelet, String nev) {
		if( muvelet.equalsIgnoreCase("FELVESZ") ) {
			if( getRand() < (csoport*ferohely ))
				System.out.println("Sikeresen felvetted a " + nev + " t�rgyat a " + (int) (Math.random() * (csoport - 1) + 1 ) + ". csoportba.");
			else 
				System.out.println("A kurzusok beteltek.");
			
			for(int i=1; i<=csoport; i++) {
				System.out.println(i+". csoport: " + ferohely + "/" + ferohely);
			}
		}
		else if(muvelet.equalsIgnoreCase("LEAD")) {
			System.out.println("Sikeresen leadtad a " + (int) (Math.random() * (csoport - 1) + 1 ) + ". " + nev + " csoport t�rgy�t.");
		}
		else 
			System.out.println("Nincs ilyen parancs. Pr�b�ld �jra.");
			
	}
	
	
	
}

class Prog2 extends Targy {
	public int getRand() {
		return (int) ((Math.random() * (120-60)) + 60);
	}
	public void getHely() {
		ferohely = 18;
		csoport = 5;
	}
}

class WebTech extends Targy {
	public int getRand() {
		return (int) ((Math.random() * (100-70)) + 70);
	}
	public void getHely() {
		ferohely = 22;
		csoport = 4;
	}
}


class getTargyNev {
	
	public Targy getName( String name ) {
		ArrayList<String> targyak = new ArrayList<String>();
		targyak.add("webtech");
		targyak.add("prog2");
		
		String vantargy = null;
		
		for(String i : targyak) {
			if(name.equalsIgnoreCase(i))
				vantargy = name;
		}
		if(vantargy != null) {
			if(name.equalsIgnoreCase("PROG2")) {
				return new Prog2();
			}
			else if(name.equalsIgnoreCase("WEBTECH")) {
				return new WebTech();
			} 
		}
		else {
				System.out.println("Helytelen t�rgyn�v vagy m�velet.");
				
			}
		return null;
		
	}
}


public class Targyfelvetel {
	
	public static void main(String[] args) throws IOException {
		
		getTargyNev targyMelyik = new getTargyNev();
		
		BufferedReader targyfelvetel = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("T�rgyfelv�tel\n");
		System.out.println("Ha v�gezt�l ird be az 'exit' kilcssz�t.");
		boolean fut;
		
		do {
			
			System.out.println("Ird be egy t�rgy nev�t ( prog2 vagy webtech ) : ");
			String targynev = targyfelvetel.readLine();
			
			System.out.println("Felvesz vagy Lead?: ");
			String muvelet = targyfelvetel.readLine();
			
			Targy t = targyMelyik.getName(targynev);
			
			t.getRand();
			t.getHely();
			t.eredmeny(muvelet,targynev);
			
			System.out.println("Ha nem akarsz tov�bbi m�veleteket v�gezni\nird be az 'exit' kulcssz�t egy�bk�nt nyomj entert:");
			String exit = targyfelvetel.readLine();
			if(exit.equalsIgnoreCase("EXIT"))
				fut = false;
			else 
				fut = true;
			
		} while ( fut == true);
		
		System.out.println("A t�rgyfelv�tel megt�rt�nt.");
	}
}
