  import java.util.Scanner;
  public class prime{
  	public static void main(String[] args) {
  		Scanner s=new Scanner(System.in);
  		System.out.println("Enter the value: ");
  		int n=s.nextInt();
  		prime p=new prime();
  		int k=p.check(n);
  		if(k==1){
  			System.out.println("Number is prime: ");
  		}
  		else{
  			System.out.println("Number is notprime: ");
  		}
  	}

  	int check(int n){
  		int i;
  		for(i=2;i<=(n/2);i++){
  			if(n%i==0){
  				return 0;
  			}
  			else{
  				return 1;
  			}
  		}
  		return n;
  	}
}