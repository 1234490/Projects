public class Employee {
	private int _id;
	private String _firstName;
	private String _lastName;
	private int _salary;
	
	public Employee(int _id, String _firstName, String _lastName, int _salary) {
		super();
		this._id = _id;
		this._firstName = _firstName;
		this._lastName = _lastName;
		this._salary = _salary;
	}

	/**
	 * @return the _id
	 */
	public int get_id() {
		return _id;
	}

	/**
	 * @return the _firstName
	 */
	public String get_firstName() {
		return _firstName;
	}

	/**
	 * @return the _lastName
	 */
	public String get_lastName() {
		return _lastName;
	}
	
	public String getName() {
		return String.format("{0} {1}", this.get_firstName(), this.get_lastName());
	}

	/**
	 * @return the _salary
	 */
	public int get_salary() {
		return _salary;
	}

	/**
	 * @param _salary the _salary to set
	 */
	public void set_salary(int _salary) {
		this._salary = _salary;
	}

	public int getAnnualSalary() {
		return this._salary * 12;
	}
	
	public int raiseSalary(int percent) {
		_salary = _salary + (_salary * (percent / 100));
		
		return _salary;
	}

	@Override
	public String toString() {
		return "Employee [_id=" + _id + ", _firstName=" + _firstName + ", _lastName=" + _lastName + ", _salary="
				+ _salary + "]";
	}
}