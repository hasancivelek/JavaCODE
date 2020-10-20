package Week_8_1;

abstract class Shape {
	abstract float area();
}

class Square extends Shape {

	int side;

	public Square(int side) {
		this.side = side;
	}

	@Override
	float area() {
		return side * side;
	}

}

class Circle extends Shape {

	int radius;
	static final double pi = Math.PI;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	float area() {
		return (float) (radius * radius * pi);
	}
}

public class AbstractConcept2 {

	public static void main(String[] args) {
		// upcasting
//superclass	           Subclass object
		Shape shape = new Square(9);
//            refName
		System.out.println(shape.area());

		shape = new Circle(9);
		System.out.println(shape.area());

	}

}
