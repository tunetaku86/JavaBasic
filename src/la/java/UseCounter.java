package la.java;

class Counter{

	int counter =1;

	void countUp() {
		 counter++;
	}

	void countUp(int num) {
		counter += num;
	}

	int getCount() {
		return counter;
	}
}

public class UseCounter {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Counter c = new Counter();
		System.out.println("カウンターの値は" + c.getCount() + "です");
		c.countUp();
		System.out.println("カウンターの値は" + c.getCount() + "です");
		c.countUp(300);
		System.out.println("カウンターの値は" + c.getCount() + "です");
		c.countUp(300);
		System.out.println("カウンターの値は" + c.getCount() + "です");


	}

}
