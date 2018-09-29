package la.java;

	class A2{
		int x;

		public A2(int x) {
			this.x = x;
			System.out.println("クラスAのコンストラクタを実行しました。");
		}
	class B2 extends A2{
		int y;
		public B2() {
			super(10);
			y = 20;
			System.out.println("クラスBのコンストラクタを実行しました。");
		}
	}
}


public class Simple2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		B b = new B();
		System.out.println("bのxの値は" + b.x + "、のyの値は" + b.y + "です。");


	}

}
