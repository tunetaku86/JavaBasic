package la.java;

abstract class Fruit{
	abstract String whatColor();

}

class Apple extends Fruit{
	String whatColor() {
		return "りんごの色は赤です";
	}

}
 class Orange extends Fruit{
	String whatColor() {
		return "オレンジの色はオレンジです";
	}


}
class Melon extends Fruit{
	String whatColor() {
		return "メロンの色は緑です";
		}


}

class UseFruit{
	public static void main(String[]args) {
		Fruit[] fruits = {new Apple(), new Orange(), new Melon()};
	for (int i = 0; i < fruits.length; i++) {
		System.out.println(fruits[i].whatColor());

	}
	}
}
