package la.java;

public class Circle2 implements Figure {

		private int radius;
		double p = 3.14;

		public int getRadius() {
			return radius;
		}

		public void setRadius(int radius) {
			this.radius = radius;
		}

		public Circle2(int radius) {
			super();
			this.radius = radius;
		}

		public void area() {
			System.out.println("図形1の面積:" + radius * radius * p);
		}
}
