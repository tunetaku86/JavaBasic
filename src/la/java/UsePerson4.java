package la.java;

public class UsePerson4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person3[] persons = {
								new Person3("tanaka"),
								new Employee3("suszuki", "営業部"),
								new Employee3("sato", "会計部")};

		for(Person3 p:persons) {
			p.introduce();
			System.out.println();
		}
	}

}
