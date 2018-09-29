package la.java;

import java.util.Calendar;

public class UseCalender {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Calendar cal1 = Calendar.getInstance();

		int year = cal1.get(Calendar.YEAR);//現在の年を取得
		int month = cal1.get(Calendar.MONTH)+1;//現在の月を取得
		int day = cal1.get(Calendar.DATE);//現在の日を取得
		int hour = cal1.get(Calendar.HOUR_OF_DAY);//現在の時間を取得
		int minute = cal1.get(Calendar.MINUTE);//
		int second = cal1.get(Calendar.SECOND);//

		String dow = "";
		switch (cal1.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			dow = "日曜日";
			break;

		case Calendar.MONDAY:
			dow = "月曜日";
			break;
		case Calendar.TUESDAY:
			dow = "火曜日";
			break;
		case Calendar.WEDNESDAY:
			dow = "水曜日";
			break;
		case Calendar.THURSDAY:
			dow = "木曜日";
			break;
		case Calendar.FRIDAY:
			dow = "金曜日";
			break;
		case Calendar.SATURDAY:
			dow = "土曜日";
			break;
		}

		System.out.println(year + "/" + month + "/" + day + " " + dow + " " + hour + ":" + minute + ":" +second);

	}

}
