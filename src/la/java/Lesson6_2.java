package la.java;
import java.util.Scanner;

public class Lesson6_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			Scanner scan = new Scanner(System.in);
			System.out.print("1~3の数値を入力してください:");
		int num = scan.nextInt();



		switch (num) {
		case 1:
			System.out.println("優です");
			break;
		case 2:
			System.out.println("良です");
			break;
		case 3:
			System.out.println("可です");
			break;
		default:
			System.out.println("1~3を入力してください");
			break;
		}

	}

}


