package dayseven.overriding.v1;


	class Circle extends Shape {
		private double radius;

		// Constructor for Circle
		public Circle(double radius) {
			this.radius = radius;
		}

		// Override draw method for Circle
		@Override
		public void draw() {
			System.out.println("Drawing a circle with radius " + radius);
		}
}
