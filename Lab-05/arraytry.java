import java.lang.*;
import java.util.Scanner;
public class arraytry{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a[],i;
		a= new int[5];
		for(i=0;i<5;i++){
			System.out.println("Enter the value");
			a[i]=s.nextInt();
		}
		for(i=0;i<5;i++){
			System.out.println(""+(a[i]));
		}
	}
}