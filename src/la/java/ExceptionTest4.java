package la.java;

public class ExceptionTest4 {
	public static void main(String[]args) {

	try {
		int i = 10, j =0;
		System.out.println("メソッド呼出し前");
		int k = calc(i, j);
		System.out.println("メソッド呼出し後");
		System.out.println("K = " + k);

	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("メソッド呼び出し元の例外");
		System.out.println("エラー:0で除算しました");
		System.out.println(e);
	}
	}
	static int calc(int i, int j) {
		int ans;
		ans = i / j;
		return ans;
	}



}
