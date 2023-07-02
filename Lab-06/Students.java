import java.util.Scanner;
class Members{
	long enrollmentNo;
	String name;
	int semester;
	double spi,cpi;
	static int i =1;
	static int m =1;
	Scanner string = new Scanner(System.in);
	Scanner s = new Scanner(System.in);


	void getStudentDetail(){
		System.out.println("Enter the detil for Student "+i);
		System.out.println("Enter the Enrollment_No of Student: ");
		enrollmentNo = s.nextLong();
		System.out.println("Enter the name of the Student: ");
		name = string.next();
		System.out.println("Enter the semester of the Student: ");
		semester = s.nextInt();
		System.out.println("Enter the spi of the Student: ");
		spi = s.nextDouble();
		System.out.println("Enter the cpi of the Student: ");
		cpi = s.nextDouble();
		System.out.println(" ");
		i++;
	}

	void displayStudentDetail(){
		System.out.println("detail of Student "+m);
		System.out.println(enrollmentNo);
		System.out.println(name);
		System.out.println(semester);
		System.out.println(spi);
		System.out.println(cpi);
		System.out.println(" ");
		m++;
	}
}

public class Students{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter the number of the Student: ");
		int n = s.nextInt();

		Members m[] = new Members[n];

		for(int i =0;i<n ;i++){
			m[i] = new Members();				
		}

		for (int i=0;i<n;i++){
			m[i].getStudentDetail();			
		}

		for (int i=0;i<n;i++){
			m[i].displayStudentDetail();			
		}			
	}
}