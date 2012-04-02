import java.util.Scanner;

/**
 * @author RJ Hill
 *
 */
public class Interface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		EncodeDecode enDecode = new EncodeDecode();
		
		System.out.print("Text to encode/decode: ");
		
		String stuffToDecode = in.nextLine();
		
		System.out.println(enDecode.rotText(stuffToDecode));
	}

}
