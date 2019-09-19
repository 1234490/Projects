package Day2;
import java.util.*;  

class JavaArrayList {  
	public static void main(String args[]){  
		ArrayList<String> sList = new ArrayList<String>(); // Creating ArrayList
		sList.add("Ravi"); // Adding object in ArrayList
		sList.add("Vijay");
		sList.add("Ravi");
		sList.add("Ajay");   
		System.out.println(sList); // Invoking ArrayList object
		
		ArrayList<Integer> iList = new ArrayList<Integer>();
		iList.add(4);
		iList.add(3);
		iList.add(1);
		iList.add(7);
		iList.add(3);
		System.out.println(iList);
		
		ArrayList<Circle> cList = new ArrayList<Circle>();
		Circle c1 = new Circle(2, "Yellow");
		Circle c2 = new Circle(5, "Orange");
		cList.add(c1);
		cList.add(c2);
		System.out.println(cList);
		
		// 1) forEach()
		iList.forEach(n -> System.out.println(n));
		
		// 3) removeIf()
		iList.removeIf(n -> (n % 2 == 0));
		System.out.println(iList);
		
		// 4) contains()
		System.out.println(sList.contains("Ravi"));
		
		// 5) remove()
		sList.remove(1);
		System.out.println(sList);
		
		// ) removeIf()
		sList.removeIf(n -> (n.equals("Ravi")));
		System.out.println(sList);
		
		// 7) get()
		System.out.println(cList.get(0));
		
		// 10) set()
		sList.set(0, "Name");
		System.out.println(sList);
		
		// 11) size()
		System.out.println(iList.size());
		
		// 16) isEmpty()
		System.out.println(iList.isEmpty());
		
		// 18) clear()
		sList.clear();
		System.out.println(sList);
		
		// 19) add()
		sList.add(0, "N");
		System.out.println(sList);
		
		// 21) indexOf()
		System.out.println(iList.indexOf(3));
		
		// 22) lastIndexOf()
		System.out.println(iList.lastIndexOf(3));
		
		// 27) add()
		sList.add("L");
		System.out.println(sList);
	}
}