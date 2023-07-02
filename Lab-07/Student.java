import java.util.Scanner;
class StudentDetail{
	long enrollmentNo;
	String name;
	char result;
	static int numberOfPassingStudent = 0;
	Scanner sc = new Scanner(System.in);
	Scanner string = new Scanner(System.in);

	void getDetails(){
		System.out.println("Enter the enrollmentno: ");
		this.enrollmentNo = sc.nextLong();
		System.out.println("Enter the name: ");
		this.name = string.nextLine();
		System.out.println("Enter 'p' for pass and 'f' for fail: ");
		this.result = sc.next().charAt(0);
		System.out.println("");
		if(result == 'p'){
			this.numberOfPassingStudent++;
		}
	}

	void showDetails(){
		if(result == 'p'){
			System.out.println(enrollmentNo);
			System.out.println(name);
			System.out.println("");
		}
	}	
}


public class Student{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of student: ");
		int n = sc.nextInt();
		int i;
		StudentDetail s[] = new StudentDetail[n];
		for(i=0;i<n;i++){
			s[i] = new StudentDetail();
		}
		for(i=0;i<n;i++){
			s[i].getDetails();
		}
		System.out.println("The total no. of student pass is: "+(StudentDetail.numberOfPassingStudent));
		for(i=0;i<n;i++){
			s[i].showDetails();
		}
	}
}