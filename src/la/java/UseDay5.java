package la.java;

public class UseDay5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Day5 d1 = new Day5(2012, 3, 3);
		Day5 d2 = new Day5(1999, 5);

		d1.setMonth(5);
		System.out.println("インスタンスd1の年は" + d1.getYear() + "年です");
		System.out.println("インスタンスd1の日付は" + d1.formatDay() + "です");
		System.out.println("インスタンスd2の日付は" + d2.formatDay() + "です");

	}

}
