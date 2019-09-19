package Day2;
import java.util.*;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<Integer, String> hashM = new HashMap<Integer, String>();
		// put()
		hashM.put(100, "A");
		hashM.put(101, "C");
		hashM.put(102, "B");
		hashM.put(103, "A");
		System.out.println(hashM);
		
		// isEmpty()
		System.out.println(hashM.isEmpty());
		
		// remove()
		hashM.remove(102);
		System.out.println(hashM);
		
		// replace()
		hashM.replace(101, "D");
		System.out.println(hashM);
		
		// entrySet()
		System.out.println(hashM.entrySet());
		
		// keySet()
		System.out.println(hashM.keySet());
		
		// containsValue()
		System.out.println(hashM.containsValue("D"));
		
		// containsKey()
		System.out.println(hashM.containsKey(100));
		
		// values()
		System.out.println(hashM.values());
		
		// size()
		System.out.println(hashM.size());
		
		// clear()
		hashM.clear();
		System.out.println(hashM);
	}
}