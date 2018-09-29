package la.java;

class Triangle2 extends Figure2{
		private int base;
		private int height;


		public Triangle2(int base, int height) {

			this.base = base;
			this.height = height;
		}
		public double getArea() {
			return (base * height)/ 2.0;
		}
}