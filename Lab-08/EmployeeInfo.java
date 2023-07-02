import java.util.Scanner;
class Person{
	String name;
	int age;
	String gender;
	Scanner string = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);

	void getDetail(){
		System.out.println("Enter the Name ");
		name = string.next();
		System.out.println("Enter the Age ");
		age = string.nextInt();
		System.out.println("Enter the Gender ");
		gender = string.next();
	}

	void printDetail(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
	}
}

class Employee extends Person{
	long employee_Id;
	int salary;
	int mobileNo;

	@Override
	void getDetail(){
		getDetail();
		System.out.println("Enter the EmployeeID ");
		employee_Id =sc.nextLong();
		System.out.println("Enter the Salary ");
		salary =sc.nextInt();
		System.out.println("Enter the MobileNumber ");
		mobileNo =sc.nextInt();
	}

	@Override
	void printDetail(){
		printDetail();
		System.out.println(employee_Id);
		System.out.println(salary);
		System.out.println(mobileNo);
	}

}

class Teacher extends Employee{
	String subject;
	int experience;


	@Override
	void getDetail(){
		super.getDetail();
		System.out.println("Enter the Subject ");
		subject =string.next();
		System.out.println("Enter the Experience ");
		experience =sc.nextInt();
	}

	@Override
	void printDetail(){
		super.printDetail();
		System.out.println(subject);
		System.out.println(experience);	
	}
} 

class EmployeeInfo{
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.getDetail();
		p1.printDetail();
		Employee e1 = new Employee();
		e1.getDetail();
		e1.printDetail();
		Teacher t1 = new Teacher();
		t1.getDetail();
		t1.printDetail();
	}
}