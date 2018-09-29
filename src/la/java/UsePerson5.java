package la.java;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UsePerson5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String, Person3> map = new HashMap<String, Person3>();
		map.put("A13",new Person3("木村"));
		map.put("A12",new Person3("山田"));
		map.put("A14",new Person3("田中"));

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println("社員番号:" + key);
			Person3 p = map.get(key);
			p.introduce();

		}

	}

}
