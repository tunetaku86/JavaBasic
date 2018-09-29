package la.java;

import java.util.Scanner;

public class Keyboard {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);

		System.out.print("一つ目の整数を入力してください：");
		int num1 = scan.nextInt();
		System.out.print("二つ目の整数を入力してください：");
		int num2 = scan.nextInt();

		int sum =num1 + num2;
		System.out.println("入力された値は" + sum + "です。");
	}

}
