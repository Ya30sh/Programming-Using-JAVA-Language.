import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class finddiameter{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the area of circle in cm square: ");
		double a=s.nextDouble();
		double r=a/3.14;
		System.out.println("The radius is: "+Math.sqrt(r));
	}
}