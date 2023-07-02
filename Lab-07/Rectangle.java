import java.util.Scanner;
class RectangleDetail{
	int length;
	int breath;
	static int count=0;

	RectangleDetail(int length, int breath){
		this.length = length;
		this.breath = breath;
		count++;
	}

	RectangleDetail(){
		this.length = 10;
		this.breath = 20;
		count++;
	}

	RectangleDetail(RectangleDetail r){
		length = r.length;
		breath = r.breath;
		count++;

	}


	void rectangleArea(){
		int area = length*breath;
		System.out.println("Area is: "+area);
	}

	void rectanglePerimeter(){
		int perimeter = 2*(length+breath);
		System.out.println("perimeter is: "+perimeter);
	}
}


public class Rectangle{
	public static void main(String[] args) {
		RectangleDetail r1 = new RectangleDetail();
		RectangleDetail r2 = new RectangleDetail(565,32);
		RectangleDetail r3 = new RectangleDetail(r2);

		r1.rectangleArea();
		r1.rectanglePerimeter();
		System.out.println("");
		r2.rectangleArea();
		r2.rectanglePerimeter();
		System.out.println("");
		r3.rectangleArea();
		r3.rectanglePerimeter();

		System.out.println("");
		System.out.println("Total rectangle is: "+RectangleDetail.count);

	}
}