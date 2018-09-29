package la.java;

public class Book3 {

	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public Book3(int price) {
		this.price = price;
	}

	void showBook() {
		System.out.println("価格:" + price + "円");
	}
}
