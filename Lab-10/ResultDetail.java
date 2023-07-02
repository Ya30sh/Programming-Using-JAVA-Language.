package result;
import java.util.Scanner;
public class ResultDetail{
	double spi;
	int backlog;
	Scanner sc = new Scanner(System.in);

	public void getDetailOfResult(){
		System.out.println("Enter the spi: ");
		spi = sc.nextDouble();
		System.out.println("Enter the backlog: ");
		backlog = sc.nextInt(); 
	}

	public void displayDetailOfResult(){
		System.out.println(spi);
		System.out.println(backlog); 
	}
}