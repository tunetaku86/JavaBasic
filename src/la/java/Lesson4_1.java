package la.java;

import java.util.Scanner;

public class Lesson4_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("三角形の底辺を入力してください：");
		int num1 = scan.nextInt();
		System.out.print("三角形の高さを入力してください：");
		int num2 = scan.nextInt();

		double area = num1 * num2 / 2.0;
		System.out.print("三角形の面積は：" + area+ "です。");

	}
}

