package la.java;
import java.util.Scanner;

public class WhileSample3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int num , sum = 0;
		System.out.print("数値を入力してください:");

	while ((num=scan.nextInt())!=0) {
		sum += num;
		System.out.print("数値を入力してください:");
		}

		System.out.println("入力された数値の合計は" + sum + "です");

	}

}
