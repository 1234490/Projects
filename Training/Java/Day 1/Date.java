public class Date {
	private int _day;
	private int _month;
	private int _year;
	public Date(int _day, int _month, int _year) {
		super();
		this._day = _day;
		this._month = _month;
		this._year = _year;
	}
	/**
	 * @return the _day
	 */
	public int get_day() {
		return _day;
	}
	/**
	 * @param _day the _day to set
	 */
	public void set_day(int _day) {
		this._day = _day;
	}
	/**
	 * @return the _month
	 */
	public int get_month() {
		return _month;
	}
	/**
	 * @param _month the _month to set
	 */
	public void set_month(int _month) {
		this._month = _month;
	}
	/**
	 * @return the _year
	 */
	public int get_year() {
		return _year;
	}
	/**
	 * @param _year the _year to set
	 */
	public void set_year(int _year) {
		this._year = _year;
	}
	@Override
	public String toString() {
		return String.format("{0}/{1}/{2}", _day, _month, _year);
	}
}