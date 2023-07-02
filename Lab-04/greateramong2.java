import java.lang.*;
import java.util.Scanner;
public class greateramong2{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int a=s.nextInt();
		System.out.println("Enter the value: ");
		int b=s.nextInt();
		Greater g=new Greater();
		g.great(a,b);
	}
}
class Greater
{
	void great(int a,int b)
	{
	if(a>b){
		System.out.println(""+a+" is grater");
	}
	else{
		System.out.println(""+b+" is grater");
	}
	}
}