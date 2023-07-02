import java.util.Scanner;
class Person{
	String name;
	int age;
	long id;
	Scanner sc = new Scanner(System.in);

	public void takeDetail(){
		System.out.println("Enter the name");
		name = sc.next();
		System.out.println("Enter the age");
		age = sc.nextInt();
		System.out.println("Enter the ID");
		id = sc.nextInt();
	}

	public void display(){
		System.out.println("Name is "+name);
		System.out.println("age is "+age);
		System.out.println("ID is "+id);
	}
}

class Faculty extends Person{
	double salary;
	Scanner s = new Scanner(System.in);

	Faculty(){
		System.out.println("Enter the detail for Faculty");
		takeDetail();
		salary = 0;
	}

	public void facultyDetail(){
		System.out.println("Enter the Salary");
		salary = s.nextLong();
		System.out.println("");
	}

	public void displayFacultyDetail(){
		System.out.println("");
		System.out.println("Faculty detail is as follow: ");
		display();
		System.out.println("Salary is "+salary);
	}
}

class Student extends Person{
	double spi;
	Scanner ss = new Scanner(System.in);

	Student(){
		System.out.println("Enter the detail for student");
		takeDetail();
		spi = 0;
	}

	public void studentDetail(){
		System.out.println("Enter the SPI");
		spi = ss.nextDouble();
		System.out.println("");
	}

	public void displayStudentDetail(){
		System.out.println("");
		System.out.println("Student detail is as follow: ");
		display();
		System.out.println("Spi is "+spi);
	}
}

public class HierarchicalInheritanceDemo{
	public static void main(String[] args) {
		Faculty f1 = new Faculty();
		f1.facultyDetail();
		Student s1 = new Student();
		s1.studentDetail();
		f1.displayFacultyDetail();
		s1.displayStudentDetail();
	}
}