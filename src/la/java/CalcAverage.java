package la.java;

public class CalcAverage {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[]ary = {34,69,99,48,69};
		double avg = average(ary);
		System.out.println("平均点は" + avg + "です。");
	}
	static double average(int[]scores) {
		int sum = 0;
	for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
	double average = (double)sum / scores.length;
			return average;
	}
}
