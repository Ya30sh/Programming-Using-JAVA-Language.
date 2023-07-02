package student;
import java.util.Scanner;
public class StudentDetail{
	String name;
	long enrollmentNo;
	Scanner sc = new Scanner(System.in);
	Scanner string = new Scanner(System.in);

	public void getDetailOfStudent(){
		System.out.println("Enter the Name of the student: ");
		name =string.next();
		System.out.println("Enter the enrollmentno: ");
		enrollmentNo = sc.nextLong();
	}

	public void displayDetailOfStudent(){
		System.out.println(name);
		System.out.println(enrollmentNo);
	}
}