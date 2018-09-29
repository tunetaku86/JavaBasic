package la.java;
import java.util.HashSet;
import java.util.Set;

public class UseHashSet {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set<String> set= new HashSet<String>();
		set.add("Hello");
		set.add("Java");
		set.add("78");
		set.add("Java");
		set.add("123");

		for (String elem : set) {
			System.out.println(elem);

		}
	}

}
