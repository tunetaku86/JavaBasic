package la.java;

public class UseDay4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Day4 d1 = new Day4(2012, 12, 30);
		Day4 d2 = new Day4(1995, 3);

		System.out.println("インスタンスd1の年は" + d1.getYear() + "です。");
		System.out.println("インスタンスd1の日付は" + d1.formatDay() + "です。");
		System.out.println("インスタンスd2の日付は" + d2.formatDay() + "です。");

	}

}
