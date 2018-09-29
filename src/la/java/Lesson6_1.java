package la.java;

import java.util.Scanner;;

public class Lesson6_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		System.out.print("月を入力してください:");
		int month = scan.nextInt();

	if ((month<=12)&&(month>0)){

		System.out.println(month + "月は正しい月です");
}else{
		System.out.println(month + "月は正しくない月です");
		}
	}
}
