package la.java;

public class BookSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Book3[] books = {new BookProduct2(1400, "桃太郎", "集英社"),
						new BookProduct2(1500, "金太郎", "講談社"),
						new BookProduct2(1600, "浦島太郎", "小学館"),
						new Book3(1600)

		};
		for (Book3 book :books) {
			book.showBook();
			System.out.println();
		}

	}

}
