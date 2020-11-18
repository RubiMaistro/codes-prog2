package Easy_Cipher;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

interface abc {
	
    char[] CharArrayAbc = {	'a', 'b', 'c', 'd', 'e', 
                            'f', 'g', 'h', 'i', 'j', 
                            'k', 'l', 'm', 'n', 'o', 
                            'p', 'q', 'r', 's', 't', 
                            'u', 'v', 'w', 'x', 'y', 
                            'z'	};
}


public class EasyCaesarCipher implements abc {
    
    private int offset;
    
    public String text, caesarText, decode;
    
    
    EasyCaesarCipher () {
        this.offset = 1;
    }
    
    EasyCaesarCipher (int start) {
        this.offset = start;
    }
    
    public void println (String str) {
		System.out.println(str);
	}
    
    public void writeFromFileToFile(String input, String output, String what) throws IOException {
		
		File myobj = new File(input);
		FileWriter fwriter = new FileWriter(output);
		Scanner myReader = new Scanner(myobj);
		
		while(myReader.hasNextLine()) {
			String data = myReader.nextLine();
			
	
			if ( what.equalsIgnoreCase("coding") )
				fwriter.write(encoding(data) + "\n");
			else if ( what.equalsIgnoreCase("decoding") )
				fwriter.write(decoding(data) + "\n");
			
		}
		fwriter.close();
		myReader.close();
		
		if ( what == "coding")
			System.out.println("A fájl titkositas fájlban iródott."); 
		if ( what == "decoding")
			System.out.println("A titkositott fájl visszafejtése a fájlba iródott."); 
	}
    
    public String encoding (String str) {
        
        caesarText = str;
        
        char ch[] = caesarText.toCharArray();
        
        for (int i = 0; i < caesarText.length(); i++) {
            
            if(isIn( ch[i]))
                ch[i] = getCharFromCharArrayAbcEncoding(ch[i]);	
        } 
        
        caesarText = new String(ch);
        
        return caesarText;
    }
    
    /*
    * Egy karakternek megkeresi a CharArrayAbc tömbben az indexét
    * amelyhez hozzáadja az offset értéket és visszatér egy bizonyos karakterrel.
    * 
    * */
    public char getCharFromCharArrayAbcEncoding (char ch) {
        
        char chaR = '?';
        
        for (int i = 0; i < CharArrayAbc.length; i++) {
            
            if( Character.toLowerCase(ch) == CharArrayAbc[i] ) {
                
                if (i + this.offset < CharArrayAbc.length) 
                    chaR = CharArrayAbc[ i + this.offset];
                
                else if (i + this.offset >= CharArrayAbc.length)
                    chaR = CharArrayAbc[ i + this.offset - CharArrayAbc.length ];
            }
            if ( ch == Character.toUpperCase(CharArrayAbc[i]) )
                chaR = Character.toUpperCase(chaR);	
        }
        return chaR;
    }
    
    
    // Benne van-e a CharArrayAbc-ben?
    public boolean isIn(char ch) {
        
        for (int i = 0; i < CharArrayAbc.length; i++) {
            if( ch == CharArrayAbc[i] || ch == Character.toUpperCase(CharArrayAbc[i]))  
                return true;
        }
        return false;
    }
    
    // Dekódolás
    public String decoding (String str) {
        
        decode = str;
        char ch[] = decode.toCharArray();
        
        for (int i = 0; i < decode.length(); i++) {
            
            if(isIn( ch[i]))
                ch[i] = getCharFromCharArrayAbcDecoding(ch[i]);	

        } 
        
        decode = new String(ch);
        
        return decode;
    }
    
    /*
    * Egy karakternek megkeresi a CharArrayAbc tömbben az indexét
    * amelyhez elveszi az offset értéket és visszatér egy bizonyos karakterrel.
    * 
    * */
    public char getCharFromCharArrayAbcDecoding (char ch) {
        
        char chaR = '?';
        
        for (int i = 0; i < CharArrayAbc.length; i++) {
            
            if( Character.toLowerCase(ch) == CharArrayAbc[i] ) {
                
                if (i - this.offset >= 0) 
                    chaR = CharArrayAbc[ i - this.offset];
                
                else if (i - this.offset < 0)
                    chaR = CharArrayAbc[ i - this.offset + CharArrayAbc.length ];
            }
            if ( ch == Character.toUpperCase(CharArrayAbc[i]) )
                chaR = Character.toUpperCase(chaR);	
        }
        return chaR;
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + offset;
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EasyCaesarCipher other = (EasyCaesarCipher) obj;
        if (offset != other.offset)
            return false;
        if (text == null) {
            if (other.text != null)
                return false;
        } else if (!text.equals(other.text))
            return false;
        return true;
    }
    
}
