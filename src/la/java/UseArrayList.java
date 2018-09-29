package la.java;
import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		// コレクションのList
		List<String> list= new ArrayList<String>();
		list.add("Hello");
		list.add("Java");
		list.add("こんにちは");
		list.add("おはよう");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));;
		}
		System.out.println("----remove----");
		list.remove(2);
		for (String str : list) {
			System.out.println(str);

		}




	}

}
