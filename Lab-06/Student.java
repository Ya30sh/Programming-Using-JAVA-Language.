class StudentDetail{
	int enrollmentNo;
	String name;
	String gender;
	int marks;
	static String college;
	static int count = 0;

	public StudentDetail(int enrollmentNo, String name, String gender, int marks){
		this.enrollmentNo = enrollmentNo;
		this.name = name;
		this.gender = gender;
		this.marks = marks;
		college = "DIET";
		count++;
	}
	
	void display(){
		System.out.println(enrollmentNo);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(marks);
		System.out.println(college);
 		System.out.println("");
	}
}

public class Student{
	public static void main(String[] args){
		StudentDetail s1 = new StudentDetail(180,"yash","male",100);
		StudentDetail s2 = new StudentDetail(181,"vaibhav","male",100);
		s1.display(); 	
 		s2.display();
		System.out.println("Total student details are: "+(StudentDetail.count));
	}
}

	
