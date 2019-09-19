package Day2;
import java.util.*;

public class Hashset {
	public static void main(String[] args) {
		// Creating HashSet and adding elements  
	    HashSet<String> set = new HashSet<String>();  
	    // 1) add()
		set.add("One");    
		set.add("Two");    
		set.add("Three");   
		set.add("Two");  
		set.add("Five");
		
		// 6) iterator();
		Iterator<String> i=set.iterator();  
		
		while(i.hasNext()) {  
			System.out.println(i.next());  
		}
		
		System.out.println(set);
		
		// 3) clone()
		HashSet<String> clone = new HashSet<String>();  
		clone = (HashSet<String>) set.clone();
		System.out.println(clone);
		
		// 4) contains()
		System.out.println(set.contains("One"));
		
		// 5) isEmpty()
		System.out.println(set.isEmpty());
		
		// 7) remove()
		set.remove("Three");
		System.out.println(set);
		
		// 8) size()
		System.out.println(set.size());
		
		// 2) clear()
		set.clear();
		System.out.println(set);
	}
}