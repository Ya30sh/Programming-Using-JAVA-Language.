import java.util.Scanner;
public class VowelConsontants{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char c = sc.next().charAt(0);
		if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
			System.out.println("The entered character is vowels");	
		}
		else{
			System.out.println("The entered character is consonants");
		}
	}
}