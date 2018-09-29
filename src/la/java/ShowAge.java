package la.java;

public class ShowAge {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		message(40);
		message(-3);
		message(25);
	}
	static void message(int age) {
		if (age < 0) {
			System.out.println("エラー:年齢がマイナスです");
			return;
		}
	System.out.println("年齢は:" + age + "です。");
	}

}
