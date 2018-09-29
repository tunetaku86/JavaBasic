package la.java;
import java.util.ArrayList;
import java.util.List;

public class UsePhone9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Phone4> list = new ArrayList<Phone4>();
		list.add(new Phone4("090-9897-6566"));
		list.add(new HandyPhone4("090-9897-6566", "abc@aaa.com"));
		list.add(new Phone4("080-2343-4444"));

		for (Phone4 p : list) {
			p.tel("090-6666-7777");

		}



	}

}
