package la.java;

public class UseAudio3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Audio[] players =
				new Audio[] {new Stereo(), new MP3Player(), new Truck()};
		for (Audio audio : players) {
			audio.play();
			audio.stop();

		}
	}
}