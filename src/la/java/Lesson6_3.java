package la.java;
import java.util.Scanner;

public class Lesson6_3{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			Scanner scan = new Scanner(System.in);
			System.out.print("降水確率を入力してください:");
		int prob = scan.nextInt();

	if (prob >= 70) {
			System.out.println("傘を必ず持って行きましょう。");
	}else if(20<=prob&&prob<70){
			System.out.println("傘はあったほうがいいかも。");
	}else {
		System.out.println("傘はいらないでしょう。");
		}
	}
}
