package la.java;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	try {
		int i = 10, j = 0;
		int k = i / j;
		System.out.println("K = " + k);

	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("エラー:0で割りました。");
	}

	}

}
