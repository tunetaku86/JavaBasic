package la.java;

public class Square3 implements Figure {

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
	public Square3(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	public void area() {

		System.out.println("図形3の面積:" + base * height);
	}



}
