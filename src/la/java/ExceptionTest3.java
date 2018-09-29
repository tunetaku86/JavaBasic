package la.java;

public class ExceptionTest3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			System.out.println("try文中");
			int[] a = new int[2];
			a[0] = 5;
			a[2] = 4;
			int i = 10, j = 0;
			int k = i / j;
			System.out.println("K = " + k);


		} catch (ArithmeticException e) {
			System.out.println("catch文中");
			System.out.println("エラー:0で割りました");
			System.out.println(e);

		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("catch文中");
			System.out.println("配列のインデックスをオーバーしました");
			System.out.println(e);


		}finally {
			System.out.println("finally文中");
		}
		System.out.println("プログラム終了");

	}

}
