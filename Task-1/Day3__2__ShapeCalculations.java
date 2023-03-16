import java.util.Scanner;

interface calculateArea{
	float calcArea();
}
interface calculatePerimeter{
	float calcPerimeter();
}
abstract class Shapes2D implements calculateArea, calculatePerimeter{
	abstract void printValues();
}

public class Day3__2__ShapeCalculations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Choose among the below shapes:");
		System.out.println("1 for Circle\n2 for Square\n3 for Triangle\n4 for Sphere\n5 for Cuboid");
		int option = scanner.nextInt();
		
		switch(option) {
			case 1:	System.out.print("Enter the radius of the circle :  ");
			  		float radius = scanner.nextFloat();
			 		Circle circle = new Circle(radius);
			 		circle.printValues();
			 		break;
			case 2:	System.out.print("Enter the radius of the square :  ");
			  		float side = scanner.nextFloat();
			 		Square square = new Square(side);
			 		square.printValues();
			 		break;
			case 3:	System.out.print("Enter the sides of the triangle :  ");
			  		float s1 = scanner.nextFloat();
			  		float s2 = scanner.nextFloat();
			  		float s3 = scanner.nextFloat();
			 		Triangle triangle = new Triangle(s1,s2,s3);
			 		triangle.printValues();
			 		break;
			case 4:	System.out.print("Enter the radius of the sphere :  ");
			  		float radiusSphere = scanner.nextFloat();
			 		Sphere sphere = new Sphere(radiusSphere);
			 		sphere.printValues();
			 		break;
			case 5:	System.out.print("Enter the side of the cuboid :  ");
			  		float sideCuboid = scanner.nextFloat();
			 		Cuboid cuboid = new Cuboid(sideCuboid);
			 		cuboid.printValues();
			 		break;
		}

	}

}
