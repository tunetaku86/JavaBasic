package la.java;

class Day10{

		private int year;
		private int month;
		private int date;

	@Override
	public String toString() {
		return   year + "年" + month + "月" + date + "日";
	}

	public Day10(int year, int month, int date)throws InvalidDayException{

	if (year < 1||year > 3000) {
		throw new InvalidDayException("年の範囲を超えました");
	}
	if (month < 1||month > 12) {
		throw new InvalidDayException("月の範囲を超えました");
	}
	if (date < 1||date > 31) {
		throw new InvalidDayException("日の範囲を超えました");
	}

		this.year = year;
		this.month = month;
		this.date = date;
	}

	public Day10(int year, int month)throws InvalidDayException {
		// TODO 自動生成されたコンストラクター・スタブ
		this(year, month, 1);
	}

}

public class UseDay10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	try {
			Day10 day1 = new Day10(2007, 12, 30);
			Day10 day2 = new Day10(-1995, 3, 5);
			Day10 day3 = new Day10(2000, 1000);

			System.out.println("インスタンスd1の日付は" + day1);
			System.out.println("インスタンスd2の日付は" + day2);
			System.out.println("インスタンスd3の日付は" + day3);


	} catch (InvalidDayException e) {
		// TODO: handle exception
		e.printStackTrace();
	}


	}

}
