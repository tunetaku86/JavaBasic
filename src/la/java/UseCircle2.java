package la.java;

class Circle4{

	public static final double PI = 3.14;
	private double radius;

	public Circle4(double radius) throws InvalidSizeException {
		if (radius <= 0) {
			throw new InvalidSizeException("半径は0以下です");

		}

		this.radius = radius;
	}

	public double area() {
	return radius * radius * PI;

	}
}

public class UseCircle2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	try {
		Circle4 c1 = new Circle4(7);
		Circle4 c2 = new Circle4(-3);

		System.out.println("c1の面積:" + c1.area());
		System.out.println("c2の面積:" + c2.area());



	} catch (InvalidSizeException e) {
		// TODO: handle exception
		e.printStackTrace();

	}

	}

}
