import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class CreditCard {

	public static boolean validateNumber(String number) {
		int checkDigit = number.charAt(number.length()-1) - '0';
		int scratch;
		
		StringBuilder builder = new StringBuilder(number);
		
		//If CC number is not between 14 and 19 chars long, it is invalid
		if (!(number.length() > 13 && number.length() < 20)) {
			return false;
		}
		
		//If CC number is NOT all digits, it is invalid
		try {
			new BigInteger(number);
		} catch (NumberFormatException e) {
			return false;
		}
		
		
		//Delete the check digit
		builder.deleteCharAt(number.length() - 1);
		
		//Reverse the number
		builder.reverse();
		
		//Double the number in odd-numbered positions (even-numbered indices)
		for (int i = 0; i < builder.length(); i++) {
			
			if (i % 2 == 0) {
				scratch = (builder.charAt(i) - '0') * 2;
				
				//Add the two digits together if the doubled digit > 10
				if (scratch > 9) {
					scratch = (scratch / 10) + (scratch % 10);
				}
				
				//This has the side-effect of converting the string from representing characters to essentially being a byte[]
				builder.setCharAt(i, (char)(scratch + '0'));
			}
		}
		
		//IDK why, but somehow the StringBuilder was adding extra characters into the string. This trims them off.
		//-2 because -1 from the check digit being removed and another -1 to change character count to index
		builder.setLength(number.length()-2);
		
		//Add up all the numbers
		scratch = 0;
		for (int i = 0; i < builder.length(); i++) {
			scratch += builder.charAt(i);
		}
		
		//Get the last digit of the digit sum
		scratch %= 10;
		
		//Check the last digit to see if the checksum completes correctly.
		return (10 - scratch) == checkDigit;
	}
	
}
