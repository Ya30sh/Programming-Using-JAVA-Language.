import java.util.Scanner;
class ShapeDetail{
	int length;
	double area;
	Scanner sc = new Scanner(System.in);

	void getDetail(){
		System.out.println("Enter the length");
		length = sc.nextInt();
	}
}

class Sqaure extends ShapeDetail{
	Sqaure(){
		System.out.println("Enter the detail for Sqaure");
		getDetail();
	}

	void displayArea(){
		area = length * length;
		System.out.println("Area of square is "+area);
	}
}

class Circle extends ShapeDetail{
	Circle(){
		System.out.println("Enter the detail for Circle");
		getDetail();
	}

	void displayArea(){
		area = Math.PI * length * length;
 		System.out.println("Area of circle is "+area);
	}
}

class Rectangle extends ShapeDetail{
	int breadth;
	Rectangle(){
		System.out.println("Enter the detail for Rectangle");
		getDetail();
		System.out.println("Enter the breadth is");
		breadth = sc.nextInt();
	}

	void displayArea(){
		area = length * breadth;
		System.out.println("Area of Rectangle "+area);
	}
}

class Triangle extends ShapeDetail{
	int base;
	Triangle(){
		System.out.println("Enter the detail for Triangle");
		getDetail();
		System.out.println("Enter the base");
		base = sc.nextInt();
	}

	void displayArea(){
		area = (base * length)/2.0;
		System.out.println("Area of Triangle is "+area);
	}
}
public class Shape{
	public static void main(String[] args) {
		Sqaure s1 = new Sqaure();
		System.out.println("");
		Circle s2 = new Circle();
		System.out.println("");
		Rectangle s3 = new Rectangle();
		System.out.println("");
		Triangle s4 = new Triangle();
		System.out.println("");
		s1.displayArea();
		s2.displayArea();
		s3.displayArea();
		s4.displayArea();
	}
}