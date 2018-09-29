package la.java;

 	class Stereo implements Audio{
 		public void play() {
 			System.out.println("ステレオを再生します");
	 }

 		public void stop() {
 			System.out.println("ステレオを停止します");
	 }
 }

 	class MP3Player implements Audio {
 		public void play() {
 			System.out.println("MP3Playerを再生します");
	 }

 		public void stop() {
 			System.out.println("MP3Playerを停止します");
	 }
 	}



public class UseAudio {

	public static void main(String[] args) {

		Stereo s = new Stereo();
		System.out.println("----Stereoを使う----");
		s.play();
		s.stop();
		System.out.println();
		System.out.println("----MP3を使う----");
		MP3Player m = new MP3Player();
		m.play();
		m.stop();



	}

}
