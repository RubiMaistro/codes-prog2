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
			
			System.out.print("Irja be a k�doland� f�jl nev�t: ");
				input = read.readLine();
			System.out.print("Irja be a kimeneti f�jl nev�t: ");
				output = read.readLine();
			System.out.print("Irja be mit szeretne csin�lni ( coding, decoding ): ");
				what = read.readLine();
			
			code.writeFromFileToFile(input, output, what);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}

	}

}
