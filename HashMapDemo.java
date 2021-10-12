import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("First",10);
		map.put("Second",20);
		map.put("Third",30);
		
		printFor(map);
		printWhile(map);
	}
	
	public static void printFor(HashMap map) {
		System.out.println("As a For loop:");
		for (Object s : map.keySet()) {
			System.out.println("\n\tKey: " + s.toString() + "\n\tValue: " + map.get(s).toString());
		}
		
		System.out.println();
	}
	
	public static void printWhile(HashMap map) {
		int i = 0;
		
		Object[] keys = map.keySet().toArray();
		
		System.out.println("As a While loop:");
		
		while (i < keys.length) {
			System.out.println("\n\tKey: " + keys[i].toString() + "\n\tValue: " + map.get(keys[i]));
			
			i++;
		}
		
		System.out.println();
	}
}
