import java.util.Scanner;
public class AreaOfCircle{
	public static void main(String[] args){
		Circle c1 = new Circle();
		c1.area();
	}
}

class Circle{
	double radius;
	Scanner sc = new Scanner(System.in);
	double area;

	Circle(){
		System.out.println("Enter the radius of circle: ");
		radius = sc.nextDouble();
	}

	void area(){
		area = Math.PI * radius * radius;
		System.out.println("Area of the circle is "+area);
	}
}