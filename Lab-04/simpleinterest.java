import java.lang.*;
import java.util.Scanner;
public class simpleinterest{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount: ");
		int p=s.nextInt();
		System.out.println("Enter the rate of interest: ");
		int r=s.nextInt();
		System.out.println("Enter the time period: ");
		int t=s.nextInt();
		Interest a=new Interest();
		int ans=a.si(p,r,t);
		System.out.println("The simple interest is: "+(ans));
	}
}

class Interest{
	int si(int p,int r,int t){
		int i=(p*r*t)/100;
		return i;
	}
}