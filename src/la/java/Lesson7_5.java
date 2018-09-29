package la.java;

import java.util.Scanner;

public class Lesson7_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int[]scores = new int[5];

	for (int i = 0; i < scores.length; i++) {
		System.out.print((i + 1) + "人目の点数:");
		scores[i] = scan.nextInt();
	}
		int max = scores[0];
	for (int i = 0; i < scores.length; i++) {
		if (max<scores[i]) {
			max = scores[i];
			}
		}
		System.out.println("最高得点は" + max + "です");
	}

}
