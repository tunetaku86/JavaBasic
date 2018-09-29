package la.java;

class Day9{
	int year;
	int month;
	int date;

	public Day9(int year, int month, int date) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
	}

	@Override
	public String toString() {
		return year + "年" + month + "月" + date + "";
	}

	public boolean equals(Object o) {
		Day9 d = (Day9) o;
	if (year==d.year&&month == d.month&&date == d.date){
		 return true;
	}else {
		return false;
	}
	}
	}
public class UseDay9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Day9 d1 = new Day9(2010, 6, 7);
		Day9 d2 = new Day9(2010, 6, 7);

		if (d1.equals(d2)) {
			System.out.println("d1とd2は同じ日付です");
	}else {
			System.out.println("d1とd2は違う日付です");
	}


	}
}




