import java.lang.*;
import java.util.Scanner;
public class bmi{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your weight in kg: ");
		double w=s.nextDouble();
		System.out.println("Enter your height in centimetres: ");
		double h=s.nextDouble();
		h=(h/100);
		double b=(w)/(h*h);
		System.out.println("Your BMI is: "+(b));
	}
}