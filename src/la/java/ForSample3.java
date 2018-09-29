package la.java;

import java.util.Scanner;

public class ForSample3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[]scores = new int[3];

	//入力用ループ
	for (int i = 0; i < scores.length; i++) {
		System.out.print((i + 1) + "人目の点数を入力してください:");
		scores[i]= scan.nextInt();
		}

	//出力用ループ
	int sum = 0;
	for (int i = 0; i < scores.length; i++) {
		System.out.println((i + 1) + "人目の点数は:" + scores[i] + "点");
		sum += scores[i];
		}
	double ave = (double)sum/scores.length;
		System.out.println("全体の平均点は" + ave + "点です");
	}
}
