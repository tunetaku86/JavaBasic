package la.java;

public class UseDay6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Day5[]ary = {new Day5(1993, 7, 10),
					new Day5(2010, 12, 31),
					new Day5(2000, 1, 1)};

		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i].formatDay());

		}
		System.out.println();

		for(Day5 day5:ary) {
			System.out.println(day5.formatDay());
		}

	}

}
