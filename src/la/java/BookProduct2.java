package la.java;

public class BookProduct2 extends Book3 {
	private String title;
	private String publisher;




	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public BookProduct2(int price, String title, String publisher) {
		super(price);
		this.title = title;
		this.publisher = publisher;
	}

	public void showBook() {
		super.showBook();
		System.out.println("タイトル:" + title);
		System.out.println("出版社:" + publisher);
	}

}
