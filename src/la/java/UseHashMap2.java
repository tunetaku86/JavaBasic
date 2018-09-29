package la.java;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UseHashMap2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String, String> map = new HashMap<String, String>();
		map.put("honda", "090-1111-2222");
		map.put("nagatomo", "090-3333-4444");
		map.put("kagawa", "090-5555-6666");

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + "の電話番号は" + map.get(key));


		}


	}
}
