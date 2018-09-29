package la.java;

import java.util.Scanner;

public class Keyboard2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("苗字を入力してください：");
			String lastName = scanner.nextLine();
			System.out.print("名前を入力してください：");
			String firstName = scanner.nextLine();
			
			System.out.println("あなたのフルネームは" + lastName + firstName + "ですね。");
			
		
	}

}
