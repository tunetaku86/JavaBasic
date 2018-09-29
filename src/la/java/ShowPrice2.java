package la.java;

public class ShowPrice2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int price1 = 500;
		price1 = calcTax(price1, 0.8);
		System.out.println("1つ目の商品は" + price1 + "です.");

		int price2 = 800;
		price2 = calcTax(price2, 0.9);
		System.out.println("2つ目の商品は" + price2 + "です.");
	}

	static int calcTax (int price,double discount) {
			double discountPrice = price * discount;
			double tax = 0.08;
			double taxPrice = discountPrice * (1 + tax);
			return (int)taxPrice;

	}

}
