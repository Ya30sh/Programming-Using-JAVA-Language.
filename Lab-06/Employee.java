import java.util.Scanner;
class Members{
	long employee_Id;
	String employee_Name;
	String designation;
	int age,salary;
	static int i =1;
	static int m =1;
	Scanner string = new Scanner(System.in);
	Scanner s = new Scanner(System.in);


	void getEmployeeDetail(){
		System.out.println("Enter the detil for Member "+i);
		System.out.println("Enter the ID of Employee: ");
		employee_Id = s.nextLong();
		System.out.println("Enter the name of the Employee: ");
		employee_Name = string.next();
		System.out.println("Enter the Designation of the Employee: ");
		designation = string.next();
		System.out.println("Enter the age of the Employee: ");
		age = s.nextInt();
		System.out.println("Enter the salary of the Employee: ");
		salary = s.nextInt();
		System.out.println(" ");
		i++;
	}

	void displayEmployeeDetail(){
		System.out.println("detail of member "+m);
		System.out.println(employee_Id);
		System.out.println(employee_Name);
		System.out.println(designation);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(" ");
		m++;
	}
}

public class Employee{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter the number of the member: ");
		int n = s.nextInt();

		Members m[] = new Members[n];

		for(int i =0;i<n ;i++){
			m[i] = new Members();				
		}

		for (int i=0;i<n;i++){
			m[i].getEmployeeDetail();			
		}

		for (int i=0;i<n;i++){
			m[i].displayEmployeeDetail();			
		}			
	}
}