package la.java;

public class Plus {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		if (args.length == 2) {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			int answer = i + j;
			System.out.println("答えは" + answer + "です");
		} else {

			System.out.println("数値を２つ入力してください");
		}

	}

}
