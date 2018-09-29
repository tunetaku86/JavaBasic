package la.java;

class Sample{

	int a;
	int b;

	int sum() {
		return a + b;
	}
}

public class UseSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		s1.a = 10;
		s1.b = 20;
		s2.a = -30;
		s2.b = 100;

		System.out.println("インスタンスs1のaの値は" + s1.a + "です。");
		System.out.println("インスタンスs1のbの値は" + s1.b + "です。");
		System.out.println("インスタンスs1のaとbの合計は" + s1.sum() + "です。");

		System.out.println("インスタンスs2のaの値は" + s2.a + "です。");
		System.out.println("インスタンスs2のbの値は" + s2.b + "です。");
		System.out.println("インスタンスs2のaとbの合計は" + s2.sum() + "です。");
	}

}
