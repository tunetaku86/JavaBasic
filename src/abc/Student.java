package abc;

public class Student {

	private int no;
	private String name;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public void showInfo() {

		System.out.println("no:" + no);
		System.out.println("name:" + name);
	}

	@Override
	public String toString() {
		return "no:" + no + " name:" + name;
	}



}
