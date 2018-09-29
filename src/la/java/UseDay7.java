package la.java;

	class Day7{

		int year;
		int month;
		int date;

		public Day7(int year, int month, int date) {
			super();
			this.year = year;
			this.month = month;
			this.date = date;
		}

		public String toString() {
				return year + "年" + month + "月" + date + "日";
		}
	}

public class UseDay7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Day7 d = new Day7(2010, 6, 7);
		System.out.println(d);


	}

}
