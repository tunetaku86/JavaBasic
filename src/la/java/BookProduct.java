package la.java;


public class BookProduct extends Product{

			String title;
			String publisher;

			void showBook() {
				System.out.println("タイトル:" + title);
				System.out.println("出版社:" + publisher);
				showPrice();
			}




}
