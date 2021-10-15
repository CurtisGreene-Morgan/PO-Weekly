public class Rotation {
	
	public static void main(String[] args) {
		
		System.out.println("\"abcd\" and \"dcab\"");
		System.out.println(isRotation("abcd","dcab"));
		
		System.out.println("\"doobie\" and \"iedoob\"");
		System.out.println(isRotation("doobie","edoobi"));
		
		System.out.println("\"Zelda\" and \"Malon\"");
		System.out.println(isRotation("Zelda","Malon"));
		
		System.out.println("\"Eberron\" and \"ronEber\"");
		System.out.println(isRotation("Eberron","ronEber"));
	}
	
	public static boolean isRotation(String base, String rotated) {
		//If base and rotated are the same length, concatenate rotated onto itself and see if it contains base.
		return (base.length() == rotated.length())
				&& ((rotated + rotated).contains(base));
	}
}
