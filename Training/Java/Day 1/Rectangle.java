

public class Rectangle {
    private float _length;
    private float _width;
    
    public Rectangle() {}
    
    public Rectangle(float length, float width) {
    	_length = length;
    	_width = width;
    }

	/**
	 * @return the _length
	 */
	public float getLength() {
		return _length;
	}

	/**
	 * @param _length the _length to set
	 */
	public void setLength(float _length) {
		this._length = _length;
	}

	/**
	 * @return the _width
	 */
	public float getWidth() {
		return _width;
	}

	/**
	 * @param _width the _width to set
	 */
	public void setWidth(float _width) {
		this._width = _width;
	}
    
    public float getArea() {
    	return _length * _width;
    }
    
    public float getPerimeter() {
    	return 2 * _length + 2 * _width;
    }

	@Override
	public String toString() {
		return "Rectangle [_length=" + _length + ", _width=" + _width + "]";
	}
}