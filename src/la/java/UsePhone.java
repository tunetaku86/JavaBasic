package la.java;

public class UsePhone {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Phone p = new Phone();
		p.no = "03-1234-5678";
		System.out.println("Phoneを使います");
		p.tel("0120-7777-9999");

		HandyPhone h = new HandyPhone();
		h.no = "090-8888-6666";
		h.mailAddress = "abc@aaa.com";
		System.out.println("HandyPhoneを使います");
		h.tel("080-4444-5555");
		h.mail("myfriend@zzz.com");



	}

}
