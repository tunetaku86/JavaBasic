package la.java;

public class UsePhone6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Phone4 p = new HandyPhone4("090-9999-0000", "abc@aaa.com");
		System.out.println("HandyPhoneをPhoneとして使う");
		p.tel("090-1111-2222");

		HandyPhone4 h = (HandyPhone4) p;
		//参照型のキャスト変換

		System.out.println("HandyPhoneをHandyPhoneとして使う");
		h.mail("ddd@aaa.com");



	}

}
