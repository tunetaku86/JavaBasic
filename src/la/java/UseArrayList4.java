package la.java;
import java.util.ArrayList;
import java.util.List;

public class UseArrayList4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> list = new ArrayList<String>();
		list.add("りんご");
		list.add("みかん");
		list.add("メロン");
		list.add("いちご");

		for (String str : list) {
			System.out.println(str);

		}
		System.out.println("----remove----");

		list.remove(2);

		for (String str : list) {
			System.out.println(str);

		}




	}

}