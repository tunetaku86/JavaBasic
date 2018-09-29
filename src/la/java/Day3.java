package la.java;

public class Day3 {

	int year;
	int month;
	int date;

	String formatDay() {

		return year + "年" + month + "月" + date + "日";
	}

	public Day3(int y,int m, int d) {
		//int型を３つとるコンストラクタを生成
		year = y;
		month = m;
		date = d;
	}
	public Day3(int y,int m) {				//自分でコンストラクタを追加した場合は、自動的にデフォルトコンストラクタは作られなくなる。
		//int型を２つとるコンストラクタを生成
		year = y;
		month = m;
		date = 1;
	}
		//デフォルトコンストラクタ
	public Day3() {
		//引数を取らないコンストラクタのことをデフォルトコンストラクタと言います。

	}

}
