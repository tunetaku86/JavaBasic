package la.java;

import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.print("整数を入力してください：");
		int num = scanner.nextInt();

		if ((num % 2)==0) {
			System.out.println("numは偶数です");
			System.out.println("複数の命令文をブロックに入れることができます");
		}else{
			System.out.println("numは奇数です");

		}


	}

}
