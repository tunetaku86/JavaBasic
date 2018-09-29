package la.java;

public class SwitchSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int dice = 3;

		switch (dice) {
		case 1:
			System.out.println("大吉です");
			break;
			
		case 2:
			System.out.println("小吉です");
			break;
			
		case 3:
			System.out.println("凶です");
			break;
			
		default:
			System.out.println("吉です");
			break;
		}
	}
}
