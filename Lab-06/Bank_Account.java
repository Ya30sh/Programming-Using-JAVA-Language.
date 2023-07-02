import java.util.Scanner;
class BankAccount{
	Scanner s = new Scanner(System.in);
	int accountNo;
	String userName;
	String email;
	String accountType;
	int accountBalance;
	static int c = 1;
	static int i = 1;	

	void getAccountDetail(){
		System.out.println("Enter the detail of member"+(c)+": ");
		System.out.println("Enter the AccountNo: ");
		accountNo =s.nextInt();
		System.out.println("Enter the username: ");
		userName =s.next();
		System.out.println("Enter the email: ");
		email =s.next();
		System.out.println("Enter the AccountType: ");
		accountType =s.next();
		System.out.println("Enter the accountBalance: ");
		accountBalance =s.nextInt();
		c++;
	}

	void displayAccountDetail(){
		System.out.println("");
		System.out.println("detail of member"+(i)+": ");
		System.out.println(accountNo);
		System.out.println(userName);
		System.out.println(email);
		System.out.println(accountType);
		System.out.println(accountBalance);
		i++;
	}
}


public class Bank_Account{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of member: ");
		int n = sc.nextInt();
		int i;
		BankAccount a[] = new BankAccount[n];
		for(i=0;i<n;i++){
			a[i] = new BankAccount();
		}
		for(i=0;i<n;i++){
			a[i].getAccountDetail();
		}
		for(i=0;i<n;i++){
			a[i].displayAccountDetail();
		}
	}
}