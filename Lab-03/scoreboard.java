import java.lang.*;
import java.util.Scanner;
public class scoreboard{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a[][],i,j,sum=0;
		a=new int[3][6];
		for (i=0;i<3;i++){
			System.out.println("Enter the score for "+(i+1)+" over: ");
			for (j=0;j<6;j++){
				System.out.print(+(j+1)+" ball: ");
				a[i][j]=s.nextInt();
				sum=sum+a[i][j];
			}
		}
		sum=sum/3;
		System.out.println("The average run is: "+(sum));
	}
}