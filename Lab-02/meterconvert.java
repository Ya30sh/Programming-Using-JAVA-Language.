import java.lang.*;
import java.util.Scanner;
public class meterconvert{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the metres: ");
		double n=s.nextDouble();
		n=(n*3.281);
		System.out.println("The answer in feet is: "+(n));
		// 1=3.281;
	}
}