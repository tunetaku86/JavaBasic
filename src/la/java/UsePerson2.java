package la.java;

public class UsePerson2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person2 p1 = new Person2();
		Person2 p2 = new Person2();

		p1.setName("John Lennon");
		p1.setAge(40);

		p2.setName("@:[:[@;");
		p2.setAge(-400);

		System.out.println("私の名前は" + p1.getName() + "です。年齢は" + p1.getAge() + "才です。");
		System.out.println("私の名前は" + p2.getName() + "です。年齢は" + p2.getAge() + "才です。");

	}

}
