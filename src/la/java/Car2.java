package la.java;

public class Car2 {

	String maker;
	int displacement;
	String colore;

	public Car2() {
		// TODO 自動生成されたコンストラクター・スタブ
		maker = "TOYOTA";
		displacement = 1000;
		colore = "白";
	}

	public Car2(String m,int d,String c) {
		// TODO 自動生成されたコンストラクター・スタブ
		maker = m;
		displacement = d;
		colore = c;
	}

	void start() {
		System.out.println("発進します");
	}
	void stop(){
		System.out.println("停止します");

	}
	void curve() {
		System.out.println("曲がります");
	}


	}





