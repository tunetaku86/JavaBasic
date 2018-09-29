package la.java;

public class UseBook {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Book2[] books = new Book2[3];

		books[0] = new Book2("TCP/IP入門", "吉田茂樹", 2200);
		books[1] = new Book2("XMLの全て", "高橋麻奈", 1800);
		books[2] = new Book2("話せる英文法"	, "有小山博美", 1500);

		for (Book2 book :books) {
			book.showBook2();
		}

		System.out.println();

		books[0].showBook2();
		books[1].showBook2();
		books[2].showBook2();
	}

}
