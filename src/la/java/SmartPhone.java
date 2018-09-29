package la.java;

public class SmartPhone extends HandyPhone4 implements Audio,Remotable{



	public void upload() {
		System.out.println("スマートフォンでデータをアップロードしました。");

	}


	public void download() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("スマートフォンでデータをダウンロードしました。");
	}


	public void play() {
		// TODO 自動生成されたメソッド・
		System.out.println("スタブスマートフォンで音楽を再生しました。");
	}


	public void stop() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("スタブスマートフォンで音楽を停止しました。");

	}
	public SmartPhone(String no, String mailAdress) {
		super(no, mailAdress);
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
