package la.java;

	class Square2{

		int height;
		int width;
		static int numOfSide = 4;

		int area() {
			return height * width;

		}

		void setData(int h,int w) {
			height = h;
			width = w;

		}
		void setData(int len) {
			height = len;
			width = len;
		}
	}

public class UseSquare2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Square2 s1 = new Square2();
		Square2 s2 = new Square2();

		s1.setData(4,9);
		s2.setData(4);

		System.out.println("s1 高さ:" + s1.height + " 幅:" + s1.width + " 面積:" + s1.area());
		System.out.println("s2 高さ:" + s2.height + " 幅:" + s2.width + " 面積:" + s2.area());

	}

}
