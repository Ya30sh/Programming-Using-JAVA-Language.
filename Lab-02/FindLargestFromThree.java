import java.util.Scanner;
public class FindLargestFromThree{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int a = s.nextInt();
		System.out.println("Enter the 2nd number: ");
		int b = s.nextInt();
		System.out.println("Enter the 3rd number: ");
		int c = s.nextInt();
		if (a>b && a>c) {
			System.out.println("1st number is greater");
		}
		else if (b>a && b>c) {
			System.out.println("2nd number is greater");
		}
		else if (c>b && c>a) {
			System.out.println("3rd number is greater");
		}
	}
}