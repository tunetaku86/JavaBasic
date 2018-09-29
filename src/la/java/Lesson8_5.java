package la.java;

public class Lesson8_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[]a= {23,56,82,35,91};
		int sum = calcTotal(a);
		System.out.println("合計は" + sum + "です");

	}
	static int calcTotal(int[]ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
}
