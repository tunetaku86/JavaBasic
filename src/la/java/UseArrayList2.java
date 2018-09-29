package la.java;
import java.util.ArrayList;
import java.util.List;

public class UseArrayList2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(3));
		list.add(new Integer(5));
		list.add(new Integer(10));
		list.add(new Integer(7));

	for (Integer i : list) {
			System.out.println(i);

	}

			System.out.println("----挿入----");
		list.add(1, new Integer(-7));
	for (Integer i : list) {
		System.out.println(i);
	}



	}

}
