package la.java;

public class UseCar2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car c1 = new Car();
		Car c2 = new Car();

		c1.maker = "HONDA";
		c1.displacement = 2000;
		c1.color = "青";

		c2.maker = "TOYOTA";
		c2.displacement = 3000;
		c2.color = "赤";

		System.out.println("c1のメーカーは" + c1.maker + "です。");
		System.out.println("c1の色は" + c1.color + "です。");
		System.out.println("c2のメーカーは" + c2.maker + "です。");
		System.out.println("c2の色は" + c2.color + "です。");

	}

}
