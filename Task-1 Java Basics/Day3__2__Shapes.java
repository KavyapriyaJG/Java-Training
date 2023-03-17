
class Circle extends Shapes2D {
	float radius;

	Circle(float radius) {
		this.radius = radius;
	}

	@Override
	public float calcArea() {
		return (float) 3.14 * this.radius * this.radius;
	}

	@Override
	public float calcPerimeter() {
		return (float) 3.14 * 2 * this.radius;
	}

	@Override
	void printValues() {
		System.out.println("\nArea is : " + calcArea() + " Perimeter is : " + calcPerimeter());
	}

}

class Square extends Shapes2D {
	float side;

	Square(float side) {
		this.side = side;
	}

	@Override
	public float calcArea() {
		return (float) this.side * this.side;
	}

	@Override
	public float calcPerimeter() {
		return (float) 4 * this.side;
	}

	@Override
	void printValues() {
		System.out.println("\nArea is : " + calcArea() + " Perimeter is : " + calcPerimeter());
	}
}

class Triangle extends Shapes2D {
	float side1;
	float side2;
	float side3;

	Triangle(float s1, float s2, float s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}

	@Override
	public float calcArea() {
		return (float) 0.5 * this.side1 * this.side2 * this.side3;
	}

	@Override
	public float calcPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}

	@Override
	void printValues() {
		System.out.println("\nArea is : " + calcArea() + " Perimeter is : " + calcPerimeter());
	}
}

class Sphere extends Circle {
	float radius;

	Sphere(float radius) {
		super(radius);
		this.radius = radius;
	}

	float area = calcArea();
	float perimeter = calcPerimeter();
	float surfArea = calcSurfArea();
	float volume = calcVolume();

	public float calcSurfArea() {
		return (float) 4 * 3.14f * this.radius * this.radius;
	}

	public float calcVolume() {
		return (float) 1.33f * this.radius * this.radius * this.radius * 3.14f;
	}

	@Override
	void printValues() {
		System.out.println("\nArea is : " + calcArea() + " Perimeter is : " + calcPerimeter());
		System.out.println("Surface Area is : " + calcSurfArea() + " Volume is : " + calcVolume());
	}

}

class Cuboid extends Square {
	Cuboid(float side) {
		super(side);
	}

	float area = calcArea();
	float perimeter = calcPerimeter();
	float surfArea = calcSurfArea();
	float volume = calcVolume();

	public float calcSurfArea() {
		return (float) 6 * this.side * this.side;
	}

	public float calcVolume() {
		return (float) this.side * this.side * this.side;
	}

	@Override
	void printValues() {
		System.out.println("\nArea is : " + calcArea() + " Perimeter is : " + calcPerimeter());
		System.out.println("Surface Area is : " + calcSurfArea() + " Volume is : " + calcVolume());
	}
}

public class Day3__2__Shapes {

	public static void main(String[] args) {

	}

}
