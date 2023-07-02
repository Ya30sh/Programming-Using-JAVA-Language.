import java.util.Scanner;
class Phone{
	String name;
	double price;
	int ram;
	int storage;
	Scanner sc = new Scanner(System.in);

	public void getPhoneDetail(){
		System.out.println("");
		System.out.println("Enter the NAME of phone ");
		name = sc.next();
		System.out.println("Enter the PRICE of phone ");
		price = sc.nextDouble();
		System.out.println("Enter the RAM of phone ");
		ram = sc.nextInt();
		System.out.println("Enter the STORAGE of phone ");
		storage = sc.nextInt();
	}

	public void displayPhoneDetail(){
		System.out.println("");
		System.out.println("Phone name is "+name);
		System.out.println("Phone price is "+price);
		System.out.println("Phone ram is "+ram);
		System.out.println("Phone storage is "+storage);
	}
}

class AndroidPhone extends Phone(){
	int androidversion;
	Scanner s = new Scanner(System.in);

	public getAndroidPhoneDetail(){
		System.out.println("Enter detail for android phone");
		super.getPhoneDetail();
		System.out.println("Enter Android Version");
		androidversion = s.nextInt();
	}

	public void displayAndroidPhoneDetail(){
		super.displayPhoneDetail();
		System.out.println("Phone android Version is "+androidversion);
	}
}

public class SingleInheritanceDemo{
	public static void main(String[] args) {
		
	}
}