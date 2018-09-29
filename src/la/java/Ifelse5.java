package la.java;
import java.util.Scanner;

public class Ifelse5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			Scanner scan = new Scanner(System.in);
			System.out.print("テストの点数を入力してください:");
		int score = scan.nextInt();

	if (score >= 80) {
			System.out.println("よくできました");
	}else if(score >= 60){
			System.out.println("頑張りましょう");
	}else {
		System.out.println("不合格です");
	}
	}

}
