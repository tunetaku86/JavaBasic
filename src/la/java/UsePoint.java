package la.java;

public class UsePoint {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Point[] points = {
							new Point(3, 9),
							new ColorPoint(12, -3, "RED"),
							new Point(56, 2),
							new ColorPoint(7, -28, "BLUE")};
		for(Point point:points) {
			point.showPoint();
			System.out.println();
		}

	}

}
