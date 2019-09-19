public class InvoiceItem {
	private String _id;
	private String _desc;
	private int _qty;
	private double _unitPrice;
	public InvoiceItem(String _id, String _desc, int _qty, double _unitPrice) {
		super();
		this._id = _id;
		this._desc = _desc;
		this._qty = _qty;
		this._unitPrice = _unitPrice;
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
	 * @return the _desc
	 */
	public String get_desc() {
		return _desc;
	}
	/**
	 * @param _desc the _desc to set
	 */
	public void set_desc(String _desc) {
		this._desc = _desc;
	}
	/**
	 * @return the _qty
	 */
	public int get_qty() {
		return _qty;
	}
	/**
	 * @param _qty the _qty to set
	 */
	public void set_qty(int _qty) {
		this._qty = _qty;
	}
	/**
	 * @return the _unitPrice
	 */
	public double get_unitPrice() {
		return _unitPrice;
	}
	/**
	 * @param _unitPrice the _unitPrice to set
	 */
	public void set_unitPrice(double _unitPrice) {
		this._unitPrice = _unitPrice;
	}
	
	public double getTotal() {
		return _unitPrice * _qty;
	}
	
	@Override
	public String toString() {
		return "InvoiceItem [_id=" + _id + ", _desc=" + _desc + ", _qty=" + _qty + ", _unitPrice=" + _unitPrice + "]";
	}
}