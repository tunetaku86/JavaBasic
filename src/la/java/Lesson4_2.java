package la.java;

import java.util.Scanner;
public class Lesson4_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("商品の値段を入力してください：");
		int price = scan.nextInt();
		int priceWithTax = (int)(price * 1.08);
	
		
		System.out.print("消費税（８％)込みの値段：" + priceWithTax + "です。");
		

	}

}
