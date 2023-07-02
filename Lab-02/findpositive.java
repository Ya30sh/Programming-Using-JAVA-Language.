import java.lang.*;
import java.util.Scanner;
public class findpositive{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=s.nextInt();
		if(a>0){
			System.out.println("Number is Positive ");
		}
		else{
			System.out.println("Number is Negative ");
		}
	}
}