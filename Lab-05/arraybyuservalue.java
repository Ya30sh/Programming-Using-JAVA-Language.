import java.lang.*;
import java.util.Scanner;
public class arraybyuservalue{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a[],n,i;
		System.out.println("Enter the size of your Array: ");
		n=s.nextInt();
		a=new int[n];
		for(i=0;i<n;i++){
			System.out.println("Enter the "+(i+1)+" Elements: ");
			a[i]=s.nextInt();
		}
		for (i=0;i<n;i++){
			System.out.println("The element "+(i+1)+" is: ");
			System.out.println(""+(a[i]));
		}
	}
}