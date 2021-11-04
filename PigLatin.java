import java.util.ArrayList;
import java.util.StringTokenizer;

public class PigLatin {
	
	public static final String vowels = "aeiouAEIOU";
	public static final String punctuation = "~`!@#$%^&*()-_=+,.<>;:'\"/?";
	
	public static String toPigLatin(String cleartext) {
		boolean beginsWithVowel;
		char finalPunctuation;
		
		ArrayList<String> words = new ArrayList<String>();
		StringBuilder sentence = new StringBuilder();
		StringBuilder word;
		StringTokenizer tokenizer = new StringTokenizer(cleartext," ");
		
		while (tokenizer.hasMoreTokens()) {
			words.add(tokenizer.nextToken());
		}
		
		for (String s : words) {
			word = new StringBuilder(s);
			
			
			//if last character or the word is punctuation, store it in the finalPunctuation variable. If not, store a
			//null character in it.
			if (punctuation.contains(Character.toString(word.charAt(word.length() - 1)))) {
				finalPunctuation = s.charAt(s.length() - 1);
				word.deleteCharAt(word.length() - 1);
			} else {
				finalPunctuation = '\0';
			}
			
			if (vowels.contains(Character.toString(s.charAt(0)))) {
				word.append("way");
				//if last character or the word is punctuation, move punctuation to end.
//				if (punctuation.contains(Character.toString(s.charAt(s.length() - 1)))) {
//					word.append(s.charAt(s.length() - 1));
//					word.deleteCharAt(word.length() - 4);
//				}
			} else {
				word.append(Character.toLowerCase(word.charAt(0)));
				word.deleteCharAt(0);
				word.append("ay");
				//if last character or the word is punctuation, move punctuation to end.
//				if (punctuation.contains(Character.toString(s.charAt(s.length() - 1)))) {
//					word.append(s.charAt(word.length() - 1));
//					word.deleteCharAt(word.length() - 3);
//				}
			}
			
			//if last character or the word is punctuation, move punctuation to end.
			if (finalPunctuation != '\0') {
				word.append(finalPunctuation);
			}
			sentence.append(word);
			sentence.append(' ');
		}
		
		//Capitalize first letter
		sentence.setCharAt(0,Character.toUpperCase(sentence.charAt(0)));
		
		return sentence.toString().trim();
	}
}
