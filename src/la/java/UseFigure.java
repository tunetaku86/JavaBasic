package la.java;

public class UseFigure {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Figure2[] figures = {new Circle3(4), new Triangle2(4, 5), new Square4(4, 5)};
		for (int i = 0; i < figures.length; i++) {
			System.out.println("図形" + (i + 1) + "の面積:" + figures[i].getArea());

		}

		}
		}
