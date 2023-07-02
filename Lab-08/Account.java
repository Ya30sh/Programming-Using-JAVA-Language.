import java.util.Scanner;
class AccountDeatil{
	int principle;
	int timePeriod;
	int rateOfInterest;
	double interest;
	Scanner sc = new Scanner(System.in);

	void getAccountDetail(){
		System.out.println("Enter the principle");
		principle = sc.nextInt();
		System.out.println("Enter the timePeriod");
		timePeriod = sc.nextInt();
		System.out.println("Enter the rateOfInterest");
		rateOfInterest = sc.nextInt();
	}
}

class Interest extends AccountDeatil{
	Interest(){
		getAccountDetail();
	}

	void calculateInterest(){
		interest = (principle * timePeriod * rateOfInterest)/100;
	}

	void displayInterest(){
		System.out.println("The simple interest is "+interest);
	}
}

class Account{
	public static void main(String[] args) {
		Interest i1 = new Interest();
		i1.calculateInterest();
		i1.displayInterest();
	}
}