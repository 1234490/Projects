package Day2;
import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Member> members = new HashSet<Member>();
		Member b1 = new Member("A", 10);
		Member b2 = new Member("B", 12);
		Member b3 = new Member("C", 13);
		Member b4 = new Member("B", 12);
		members.add(b1);
		members.add(b2);
		members.add(b3);
		members.add(b4);
		
		for(Member m:members){
			System.out.println(m.name + " " + m.id);  
		}  
	}  
}