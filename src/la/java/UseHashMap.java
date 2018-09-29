package la.java;
import java.util.HashMap;
import java.util.Map;

public class UseHashMap {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String, String> map = new HashMap<String, String>();
		map.put("honda", "090-1111-2222");
		map.put("nagatomo", "090-3333-4444");
		map.put("kagawa", "090-5555-6666");

		System.out.println("hondaの電話番号は" + map.get("honda"));
		System.out.println("nagatomoの電話番号は" + map.get("nagatomo"));
		System.out.println("kagawaの電話番号は" + map.get("kagawa"));
	}
}
