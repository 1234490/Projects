package Day2;
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class Member {  
	String name;
	int id;
	double gpa;
	String city;
	String gender;
	
	public Member(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Member(String name, int id, double gpa, String city, String gender) {
		super();
		this.name = name;
		this.id = id;
		this.gpa = gpa;
		this.city = city;
		this.gender = gender;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id +
			", gpa=" + gpa + ", city=" + city + ", gender=" + gender + "]";
	}
	
	public int compareTo(Member m) {
		return (this.name).compareTo(m.name);
	}
	
	public int compare(Member m1, Member m2) {
		if (m1.gpa > m2.gpa) {
			return 1;
		} else {
			return -1;
		}
	}
}

class SortByGPA implements Comparator<Member> {
    public int compare(Member m1, Member m2) { 
        if (m1.gpa > m2.gpa) {
			return 1;
		} else {
			return -1;
		}
    } 
} 

public class Comparator {
	public static void main(String[] args) {
		ArrayList<Member> mem = new ArrayList<Member>(); 
		mem.add(new Member("A", 10, 3.4, "CityA", "F"));
		mem.add(new Member("B", 12, 4.0, "CityB", "M"));
		mem.add(new Member("C", 13, 2.1, "CityC", "M"));
		mem.add(new Member("B", 12, 4.0, "CityB", "M"));
		
		System.out.println(mem);
		Collections.sort(mem, new SortByGPA());
		System.out.println(mem);
	}  
}