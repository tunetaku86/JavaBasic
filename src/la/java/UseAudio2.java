package la.java;

public class UseAudio2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Audio a = new Stereo();
		System.out.println("----Stereoを使う----");
		a.play();
		a.stop();
		System.out.println();
		a = new MP3Player();
		System.out.println("----MP3を使う----");
		a.play();
		a.stop();


	}

}
