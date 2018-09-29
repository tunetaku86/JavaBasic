package la.java;

public class NumberFormatCheck {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		if (args.length !=1) {
			System.out.println("整数を1つ入力してください");
			System.exit(1);
		}

		try {
			int a = Integer.parseInt(args[0]);
			System.out.println("入力された整数は:" + a);

		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("整数を入力してください");
		}

	}

}
