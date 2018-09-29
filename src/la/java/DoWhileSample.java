package la.java;

import java.util.Scanner;
public class DoWhileSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int num;
		
	do {
		System.out.print("パスコードを入力してください:");
		num = scan.nextInt();
	} while (num != 5);

		System.out.print("認証しました！");


	}

}
