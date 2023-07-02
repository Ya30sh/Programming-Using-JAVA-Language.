import java.lang.*;
import java.util.Scanner;
public class tempconvert{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the temperature: ");
		float f=s.nextFloat();
		float c;
		c=(f-32)*(5/9f);
		System.out.println("Temperature in celsius: "+(c));
	}
}