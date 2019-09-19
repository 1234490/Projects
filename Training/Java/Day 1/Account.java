public class Account {
	private String _id;
	private String _name;
	private int _balance = 0;
	public Account(String _id, String _name, int _balance) {
		super();
		this._id = _id;
		this._name = _name;
		this._balance = _balance;
	}
	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}
	/**
	 * @return the _name
	 */
	public String get_name() {
		return _name;
	}
	/**
	 * @param _name the _name to set
	 */
	public void set_name(String _name) {
		this._name = _name;
	}
	/**
	 * @return the _balance
	 */
	public int get_balance() {
		return _balance;
	}
	/**
	 * @param _balance the _balance to set
	 */
	public void set_balance(int _balance) {
		this._balance = _balance;
	}
	
	public int credit(int amount) {
		_balance += amount;
		
		return _balance;
	}
	
	public int debit(int amount) {
		if (amount <= _balance) {
			_balance -= amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		
		return _balance;
	}
	
	public int transferTo(Account another, int amount) {
		if (amount <= _balance) {
			another.set_balance(amount);
			_balance -= amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		
		return _balance;
	}
	
	@Override
	public String toString() {
		return "Account [_id=" + _id + ", _name=" + _name + ", _balance=" + _balance + "]";
	}
	
	
}