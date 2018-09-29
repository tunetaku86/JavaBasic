package la.java;

public class HandyPhone4 extends Phone4{

	private String mailAddress;

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public void mail(String to) {
			System.out.println(mailAddress + "から" + to + "へメールしました。");
	}

	public void info() {
			System.out.println("電話番号:" + getNo() + "メールアドレス:" + mailAddress);
	}

	public HandyPhone4(String no,String mailAdress) {
			super(no);
			this.mailAddress = mailAdress;


	}


}
