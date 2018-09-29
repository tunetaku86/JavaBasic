package la.java;

public class ShowPrice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int price1 = 500;

		double discountPrice = price1 * 0.9;
		double tax = 0.08;
		double taxPrice1 = discountPrice * (1 + tax);
		price1 = (int)taxPrice1;
		System.out.println("1つ目の商品は" + price1 + "です.");

		int price2 = 800;

		discountPrice = price2 * 0.9;
		tax = 0.08;
		double taxPrice2 = discountPrice * (1 + tax);
		price2 = (int)taxPrice2;
		System.out.println("1つ目の商品は" + price2 + "です.");
	}

}
