public class Time {
	private int _hour;
	private int _minute;
	private int _second;
	public Time(int _hour, int _minute, int _second) {
		super();
		this._hour = _hour;
		this._minute = _minute;
		this._second = _second;
	}
	/**
	 * @return the _hour
	 */
	public int get_hour() {
		return _hour;
	}
	/**
	 * @param _hour the _hour to set
	 */
	public void set_hour(int _hour) {
		this._hour = _hour;
	}
	/**
	 * @return the _minute
	 */
	public int get_minute() {
		return _minute;
	}
	/**
	 * @param _minute the _minute to set
	 */
	public void set_minute(int _minute) {
		this._minute = _minute;
	}
	/**
	 * @return the _second
	 */
	public int get_second() {
		return _second;
	}
	/**
	 * @param _second the _second to set
	 */
	public void set_second(int _second) {
		this._second = _second;
	}
	
	public void setTime(int hour, int minute, int second) {
		_hour = hour;
		_minute = minute;
		_second = second;
	}
	
	@Override
	public String toString() {
		return String.format("{0}:{1}:{2}", _hour, _minute, _second);
	}
	
	public Time nextSecond() {
		_second++;
		
		return this;
	}
	
	public Time previousSecond() {
		_second--;
		
		return this;
	}
}