import java.util.Scanner;
class CandidatesDetail{
	int id;
	String name;
	int age;
	double weight;
	int height;
	int a=0;
	void getCandidateDetail(){
	Scanner s=new Scanner(System.in);
	System.out.println("For Candidates"+(a));
	System.out.println("Enter id: ");
	id=s.nextInt();
	System.out.println("Enter name: ");
	name=s.next();
	System.out.println("Enter age");
	age=s.nextInt();
	System.out.println("Enter weight: ");
	weight=s.nextDouble();
	System.out.println("Enter height in 'cm': ");
	height=s.nextInt();
	}
	void displayCandidateDetail(){
		System.out.println("");
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(height);
	}
}
public class Candidates{
	public static void main(String[] args) {
	CandidatesDetail c1 = new CandidatesDetail();
	c1.getCandidateDetail();
	c1.displayCandidateDetail(); 
	}

}