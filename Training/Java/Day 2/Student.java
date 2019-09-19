package Day2;
import java.util.*;

class Std {
	private ArrayList<String> _studentList;
	
	public Std(ArrayList<String> studentList) {
		_studentList = studentList;
	}

	/**
	 * @return the _studentList
	 */
	public ArrayList<String> get_studentList() {
		return _studentList;
	}

	/**
	 * @param _studentList the _studentList to set
	 */
	public void set_studentList(ArrayList<String> _studentList) {
		this._studentList = _studentList;
	}
	
	public boolean equals(Std other) {
		if (this._studentList == other.get_studentList()) {
			return true;
		} else {
			return false;
		}
	}
}

public class Student {
	public static void main(String[] args) {
		ArrayList<String> sList = new ArrayList<String>();
        sList.add("A");  
        sList.add("B");  
        sList.add("C");
        Std sObj = new Std(sList);
	}
}