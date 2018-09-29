package la.java;

public class Employee {

	private String name;
	private String address;
	private Day5 hireDate;

	public Employee(String name, String address, Day5 hireDate) {
		super();
		this.name = name;
		this.address = address;
		this.hireDate = hireDate;
	}

	public Employee(String name, String address, int year, int month, int date) {
		super();
		this.name = name;
		this.address = address;
		this.hireDate = new Day5(year, month, date);
	}

	public Employee(String name, String address, int year, int month) {
		super();
		this.name = name;
		this.address = address;
		this.hireDate = new Day5(year, month, 1);
	}

	public void introduce() {
		System.out.println("こんにちは、私は" + name + "です。");
		System.out.println("住所は" + address + "です。");
		System.out.println("入社日は" + hireDate.formatDay() + "です。");

	}




}
