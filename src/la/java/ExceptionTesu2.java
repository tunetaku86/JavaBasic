package la.java;

public class ExceptionTesu2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			int i = 10, j = 0;
			int k = i / j;
			System.out.println("K = " + k);

		} catch (ArithmeticException e) {
		
			System.out.println("エラー:0で割りました。");
			e.printStackTrace();
		}
		System.out.println("main終了しました");
	}

}
