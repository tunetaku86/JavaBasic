package la.java;

public class Lesson8_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double a = div(34.2,8.23);
		double b = div(6.58,3.9);

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
		static double div(double num1,double num2) {
			double result = num1 / num2;
			return result;
		}

}
