package la.java;

public class HandyPhone extends Phone {
	String mailAddress;

	public void mail(String to) {
		System.out.println(mailAddress +  "から" + to + "へ電話しました。");
	}

}
