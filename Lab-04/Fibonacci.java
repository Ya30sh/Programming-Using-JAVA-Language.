import java.util.Scanner;
public class Fibonacci{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number till wants: ");
		int n=s.nextInt();
		Loop l=new Loop();
		l.v(n);
	}
}

class Loop{
	void v(int n){
		int a=0;
		int b=1;
		int c,i;
		System.out.print(+a+" ");
		System.out.print(+b+" ");
		for(i=1;i<n;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.print(+b+" ");
		}
	}
}