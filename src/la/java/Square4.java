package la.java;

class Square4 extends Figure2{

	private int base;
	private int height;

	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Square4(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	public double getArea() {
		return base * height ;
	}
}