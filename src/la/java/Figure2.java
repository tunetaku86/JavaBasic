package la.java;

public abstract class Figure2 {
	public abstract double getArea();

}

class Circle3 extends Figure2{
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle3(int radius) {
		super();
		this.radius = radius;

	}

	public double getArea() {
		return radius * radius * 3.14;
	}






}



