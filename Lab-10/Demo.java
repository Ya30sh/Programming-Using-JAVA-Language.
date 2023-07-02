import student.StudentDetail;
import result.ResultDetail;
public class Demo{
	public static void main(String[] args) {
		StudentDetail s1 = new StudentDetail();
		ResultDetail r1 = new ResultDetail();
		s1.getDetailOfStudent();
		r1.getDetailOfResult();
		s1.displayDetailOfStudent();
		r1.displayDetailOfResult();
	}
}