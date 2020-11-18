package Easy_Cipher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		
		try {
			
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			EasyCaesarCipher code = new EasyCaesarCipher();
			
				code.text = "Alma";
				code.println(code.encoding("Alma"));
				
				code.println(code.decoding(code.caesarText));
			
			String input, output, what;
			
			System.out.print("Irja be a kódolandó fájl nevét: ");
				input = read.readLine();
			System.out.print("Irja be a kimeneti fájl nevét: ");
				output = read.readLine();
			System.out.print("Irja be mit szeretne csinálni ( coding, decoding ): ");
				what = read.readLine();
			
			code.writeFromFileToFile(input, output, what);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}

	}

}
