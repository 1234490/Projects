package Day2;
import java.util.*;

public class JavaPractice {
	public static void main(String[] args) {
		// 4)
		System.out.println("4)");
		String[] elements = {"JAVA", "J2EE", "JSP", "SERVLETS", "JAVA", "STRUTS", "JSP"};
		HashSet<String> elementSet = new HashSet<String>();  
	    
		for (int i = 0; i < elements.length; i++) {
			elementSet.add(elements[i]);
		}
		
		System.out.println(elementSet);
		LinkedHashSet<String> linkedSet = new LinkedHashSet<String>();
		
		for (int i = 0; i < elements.length; i++) {
			linkedSet.add(elements[i]);
		}
		
		System.out.println(linkedSet);
		
		// 5)
		System.out.println("\n5)");
		LinkedList<String> linkedList = new LinkedList<String>();
		
		for (int i = 0; i < elements.length; i++) {
			linkedList.add(elements[i]);
		}
		
		Iterator<String> itr = linkedList.descendingIterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());  
		}
		
		// 6)
		System.out.println("\n6)");
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
		HashSet<String> common = new HashSet<String>();
		
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					common.add(s1[i]);
				}
			}
		}
		
		System.out.println(common);
	}
}