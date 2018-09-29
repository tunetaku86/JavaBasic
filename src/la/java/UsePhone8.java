package la.java;

public class UsePhone8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Phone4 p = new Phone4("0545-5678-3456");
		HandyPhone4 h = new HandyPhone4("090-2345-3454", "abc@aaa.com");

		communicate(p);
		communicate(h);
	}
		public static void communicate(Phone4 p) {
			p.tel("02-9999-8888");

		if (p instanceof HandyPhone4) {				//もしpの型がHandyPhone4ならば
			HandyPhone4 h = (HandyPhone4) p;		//HandyPhone4にキャスト
			h.mail("aaa@ddd.com");					//mail機能を使う

		}

	}

}
