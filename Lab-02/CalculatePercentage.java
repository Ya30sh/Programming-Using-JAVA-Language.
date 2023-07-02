import java.util.Scanner;
public class CalculatePercentage{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of Subject1: ");
		int sub1 = sc.nextInt();
		System.out.println("Enter the marks of Subject2: ");
		int sub2 = sc.nextInt();
		System.out.println("Enter the marks of Subject3: ");
		int sub3 = sc.nextInt();
		System.out.println("Enter the marks of Subject4: ");
		int sub4 = sc.nextInt();
		System.out.println("Enter the marks of Subject5: ");
		int sub5 = sc.nextInt();
		int total = sub1 + sub2 + sub3 + sub4 + sub5;
		double percentage = total/5.0;
		if(percentage >= 70){
			System.out.println((percentage)+"% Distinction class");
		}
		else if(percentage >= 60){
			System.out.println((percentage)+"% First class");
		}
		else if(percentage >= 45){
			System.out.println((percentage)+"% Second class");
		}
		else if(percentage >= 35){
			System.out.println((percentage)+"% Pass class");
		}
		else if(percentage < 35){
			System.out.println((percentage)+"% Fail");
		}

	}
}