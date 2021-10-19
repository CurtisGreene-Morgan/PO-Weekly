public class Cipher {
	public static String atbash(String cleartext) {
		
		char current;
		char[] chars = cleartext.toCharArray();
		
		for (int i = 0; i < cleartext.length(); i++) {
			current = chars[i];
			
			if (Character.isLowerCase(current)) {
				chars[i] = (char)('z' - current + 'a');				
			}
			
			if (Character.isUpperCase(current)) {
				chars[i] = (char)('Z' - current + 'A');
			}
			
		}
		
		return new String(chars);
	}
}
