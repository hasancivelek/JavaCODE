package Week_7_1;
//overriding : Overriding provide us specific implementation for methods in subclasses and super classes .
/*
 * Difference between overloading and overriding
 * overloading methods will have different method signature,methods have to be in same classes
 * overriding methods will have same method signature,methods have to be in different classes
 */
class Shape{
	void findArea() {
		System.out.println("finding the area");
	}
}
class Rectangle extends Shape {
	int width;
	int lenght;
	//in order to call it overriding , methods needs to be inherited
	void findArea() {//Overriding the find Area Method
		super.findArea();//super keyword acts as reference for superclass object
		System.out.println(" Rectangle area is " + width*lenght);
	}
}

class Circle extends Shape {
	int radius;
	double pi=Math.PI;
	void findArea() {
		super.findArea();
		System.out.println("Area of the circle is : " +(int)(pi*Math.pow(radius, 2)));
	}
}

class Square extends Shape{
	int side;
	void findArea() {
		super.findArea();
		System.out.println("Area of the square is : " + side*side);
	}
}
//Constructor can not be final
//if method would be final,it can not be overridden .
//static,private and final methods can not be overridden
//overridden methods must have the same return type
public class OverridingConcept {

	public static void main(String[] args) {
		
Rectangle rectangle = new Rectangle();
rectangle.width=10;
rectangle.lenght=9;
rectangle.findArea();

Circle circle =new Circle();
circle.radius=10;
circle.findArea();

Square square = new Square();
square.side=8;
square.findArea();

	}

}
