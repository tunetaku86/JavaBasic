package la.java;

import java.util.Scanner;
public class Lesson4_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int eng,math,sience;
		System.out.print("英語：");
		eng = scan.nextInt();
		System.out.print("数学：");
		math = scan.nextInt();
		System.out.print("理科：");
		sience = scan.nextInt();

		int total= eng + math + sience;
		double  ave= total/3.0;
		System.out.println("合計：" + total + "です。");
		System.out.print("平均：" + ave + "です。");

	}

}
