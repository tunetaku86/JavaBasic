package la.java;

public class Book {
	String title;
	String author;
	int price;

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
		// TODO 自動生成されたコンストラクター・スタブ

	public void showBook(){
		System.out.println("タイトル:" + title + "著者:" + author + "価格:" + price + "円");


	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Book b1 = new Book("TCP/IP", "吉田茂樹", 2200);
		Book b2 = new Book("XMLの全て", "高橋麻奈", 1800);

		b1.showBook();
		b2.showBook();

	}

}
