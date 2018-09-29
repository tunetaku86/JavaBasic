package la.java;

import java.util.Scanner;
public class Lesson8_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.print("点数を入力してください:");
		int score = scan.nextInt();
		System.out.println(score + "点は" + judge(score) + "です");

	}
	static String judge(int score) {
		if (score >= 70) {
			return "合格";
	}else {
			return "不合格";
		}
	}
}


