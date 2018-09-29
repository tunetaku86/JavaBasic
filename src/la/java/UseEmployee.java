package la.java;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Employee e1 = new Employee("スズキ", "東京", 2012, 10, 20);
		Employee e2 = new Employee("田中", "大阪", 2012, 10);
		Employee e3 = new Employee("佐藤", "名古屋", new Day5(2001, 10, 20));

		e1.introduce();
		e2.introduce();
		e3.introduce();

	}

}
