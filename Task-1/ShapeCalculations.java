import java.util.Scanner;
//import java.reflect.Method;

interface calculateArea{
	float calcArea();
}
interface calculatePerimeter{
	float calcPerimeter();
}
interface surfaceArea{
	float calcSurfArea();
}
interface calculateVolume{
	float calcVolume();
}
abstract class Shapes2D implements calculateArea, calculatePerimeter{
	abstract void printValues();
}

class Circle extends Shapes2D{
	float radius;
	Circle(float radius){
		this.radius = radius;
	}
	@Override
	public float calcArea() {
		return (float)3.14*this.radius*this.radius;
	}
	@Override
	public float calcPerimeter() {
		return (float)3.14*2*this.radius;
	}
	
	@Override
	void printValues() {
		System.out.println("\nArea is : "+calcArea()+ " Perimeter is : "+calcPerimeter());
	}
	
}
class Square extends Shapes2D{
	float side;
	Square(float side){
		this.side = side;
	}
	@Override
	public float calcArea() {
		return (float)this.side*this.side;
	}
	@Override
	public float calcPerimeter() {
		return (float)4*this.side;
	}
	
	@Override
	void printValues() {
		System.out.println("\nArea is : "+calcArea()+ " Perimeter is : "+calcPerimeter());
	}
}
class Triangle extends Shapes2D{
	float side1;
	float side2;
	float side3;
	Triangle(float s1, float s2, float s3){
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	@Override
	public float calcArea() {
		return (float)0.5*this.side1*this.side2*this.side3;
	}
	@Override
	public float calcPerimeter() {
		return this.side1+this.side2+this.side3;
	}
	
	@Override
	void printValues() {
		System.out.println("\nArea is : "+calcArea()+ " Perimeter is : "+calcPerimeter());
	}
}
class Sphere extends Circle implements surfaceArea, calculateVolume{
	float radius;
	Sphere(float radius){
		super(radius);
		this.radius = radius;
	}
	float area = calcArea();
	float perimeter = calcPerimeter();
	float surfArea = calcSurfArea();
	float volume = calcVolume();
	
	@Override
	public float calcSurfArea() {
		return (float)4*3.14f*this.radius*this.radius;
	}
	@Override
	public float calcVolume() {
		return (float)1.33f*this.radius*this.radius*this.radius*3.14f;
	}
	
	@Override
	void printValues() {
		System.out.println("\nArea is : "+calcArea()+ " Perimeter is : "+calcPerimeter());
		System.out.println("Surface Area is : "+calcSurfArea()+ " Volume is : "+calcVolume());
	}
	
}
class Cuboid extends Square implements surfaceArea, calculateVolume{
	Cuboid(float side){
		super(side);
	}
	float area = calcArea();
	float perimeter = calcPerimeter();
	float surfArea = calcSurfArea();
	float volume = calcVolume();
	
	@Override
	public float calcSurfArea() {
		return (float)6*this.side*this.side;
	}
	@Override
	public float calcVolume() {
		return (float)this.side*this.side*this.side;
	}
	
	@Override
	void printValues() {
		System.out.println("\nArea is : "+calcArea()+ " Perimeter is : "+calcPerimeter());
		System.out.println("Surface Area is : "+calcSurfArea()+ "Volume is : "+calcVolume());
	}
}
public class ShapeCalculations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose among the below shapes:");
		System.out.println("1 for Circle\n2 for Square\n3 for Triangle\n4 for Sphere\n5 for Cuboid");
		int option = sc.nextInt();
		
		switch(option) {
			case 1:	System.out.print("Enter the radius of the circle :  ");
			  		float radius = sc.nextFloat();
			 		Circle circle = new Circle(radius);
			 		circle.printValues();
			 		break;
			case 2:	System.out.print("Enter the radius of the square :  ");
			  		float side = sc.nextFloat();
			 		Square square = new Square(side);
			 		square.printValues();
			 		break;
			case 3:	System.out.print("Enter the sides of the triangle :  ");
			  		float s1 = sc.nextFloat();
			  		float s2 = sc.nextFloat();
			  		float s3 = sc.nextFloat();
			 		Triangle triangle = new Triangle(s1,s2,s3);
			 		triangle.printValues();
			 		break;
			case 4:	System.out.print("Enter the radius of the sphere :  ");
			  		float radiusSphere = sc.nextFloat();
			 		Sphere sphere = new Sphere(radiusSphere);
			 		sphere.printValues();
			 		break;
			case 5:	System.out.print("Enter the side of the cuboid :  ");
			  		float sideCuboid = sc.nextFloat();
			 		Cuboid cuboid = new Cuboid(sideCuboid);
			 		cuboid.printValues();
			 		break;
		}

	}

}
