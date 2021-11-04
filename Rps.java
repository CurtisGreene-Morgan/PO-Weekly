import java.util.Locale;

public class Rps {
	
	public static String rps(String p1, String p2) throws IllegalArgumentException{
		p1 = p1.toLowerCase();
		p2 = p2.toLowerCase();
		
		switch (p1) {
			case "rock": {
				switch (p2) {
					case "rock": {
						return "TIE";
					}
					case "paper": {
						return "Player 2 wins";
					}
					case "scissors" : {
						return "Player 1 wins";
					}
				}
			}
			case "paper": {
				switch (p2) {
					case "rock": {
						return "Player 1 wins";
					}
					case "paper": {
						return "TIE";
					}
					case "scissors" : {
						return "Player 2 wins";
					}
				}
			}
			case "scissors": {
				switch (p2) {
					case "rock": {
						return "Player 2 wins";
					}
					case "paper": {
						return "Player 1 wins";
					}
					case "scissors" : {
						return "TIE";
					}
				}
			}
		}
		
		throw new IllegalArgumentException("Bad value passed! P1: " + p1 + ", P2: " + p2);
	}
}
