package la.java;

class Day8{
		int year;
		int month;
		int date;

		public Day8(int year, int month, int date) {
			super();
			this.year = year;
			this.month = month;
			this.date = date;
		}

		@Override
		public String toString() {
			return year + "年" + month + "月" + date + "";
		}
}

public class UseDay8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Day8 d1 = new Day8(2010, 6, 7);
		Day8 d2 = new Day8(2010, 6, 7);

		if (d1.equals(d2)) {
			System.out.println("d1とd2は同じ日付です");
	}else {
			System.out.println("d1とd2は違う日付です");
	}


	}

}
