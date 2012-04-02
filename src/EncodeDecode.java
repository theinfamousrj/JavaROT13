/**
 * @author RJ Hill
 *
 */
public class EncodeDecode {
	
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	String alpharot = "nopqrstuvwxyzabcdefghijklm";
	
	public EncodeDecode() {
		
	}
	
	
	public String rotText(String theData) {
		String rotdText = "";
		
		for (int i=0; i<theData.length(); i++) {
			
			if (charExists(theData.substring(i, i+1)) < 30) {
				int j = charExists(theData.substring(i, i+1));
				rotdText = rotdText + alpharot.substring(j, j+1);
			}
			else {
				rotdText = rotdText + theData.substring(i, i+1);
			}
			
		}
		
		return rotdText;
	}
	
	private int charExists(String theData) {
		for (int i=0; i<alphabet.length(); i++) {
			if (theData.equals(alphabet.substring(i, i+1)) == true) {
				return i;
			}
		}
		
		return 30;
	}
}
