package la.java;

	class Calc2{
		static int add(int a,int b) {
			int answer = a + b;
			return answer;
	}
		static double add(double a,double b) {
			double answer = a + b;
			return answer;
	}
		static int add(int a,int b,int c) {
			int answer = a + b + c;
			return answer;

		}

	}
public class UseCalc2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("1 + 5 = " + Calc2.add(1, 5));
		System.out.println("3.14 + 2.5 = " + Calc2.add(3.14, 2.5));
		System.out.println("1 + 5 + 6= " + Calc2.add(1, 5, 6));


	}

}
