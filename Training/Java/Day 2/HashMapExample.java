package Day2;
import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, Member> members = new HashMap<Integer, Member>();
		Member b1 = new Member("A", 10);
		Member b2 = new Member("B", 12);
		Member b3 = new Member("C", 13);
		Member b4 = new Member("B", 12);
		members.put(111, b1);
		members.put(222, b2);
		members.put(333, b3);
		members.put(444, b4);
		
		System.out.println(members);
	}  
}