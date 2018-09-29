package la.java;

public class Increment {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x;
		int y;
		x = 10;
		y = ++x; //前に付けた場合
		System.out.println("**前に付けた場合**");
		System.out.print("x=" + x);
		System.out.println(",y=" + y);

		x = 10;
		y = x++; //後に付けた場合
		System.out.println("**後に付けた場合**");
		System.out.print("x=" + x);
		System.out.print(",y=" + y);



	}

}
