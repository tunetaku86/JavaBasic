package la.java;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> list =new LinkedList<String>();
		list.add("Hello");
		list.add("Java");
		list.add("こんにちは");
		list.add("おはよう");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("----remove----");
		list.remove(3);
		for (String str : list) {
			System.out.println(str);

		}
	}

}
