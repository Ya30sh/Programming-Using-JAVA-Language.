import java.lang.*;
import java.util.Scanner;
public class areaofcircle{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		int r=s.nextint();
		float a=(3.14)*r*r;
		System.out.println("The area is: "+(a));
	}
}