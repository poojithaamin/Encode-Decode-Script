import java.io.UnsupportedEncodingException;    
import javax.xml.bind.DatatypeConverter;
import java.util.*;

public class EncodeDecode {

    public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str;  // Line of text entered by user.
      	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the String to be encoded: ");
    	str = sc.nextLine();
      
        // encode data using BASE64
        String encoded = DatatypeConverter.printBase64Binary(str.getBytes());
        System.out.println("encoded value is \t" + encoded);

        // Decode data 
        String decoded = new String(DatatypeConverter.parseBase64Binary(encoded));
        System.out.println("decoded value is \t" + decoded);

        System.out.println("original value is \t" + str);

    }

}
