import java.util.Scanner;
class TimeDetail{
	int hour;
	int minute;
	int second;
	static int h=0;
	static int m=0;
	static int sec=0;
	static int day=0;
	static int i=1;
	Scanner s = new Scanner(System.in);

	void getDetail(){
		System.out.println("time"+(i));
		System.out.println("Enter the hours: ");
		hour = s.nextInt();
		System.out.println("Enter the minute: ");
		minute = s.nextInt();
		System.out.println("Enter the second: ");
		second = s.nextInt();
		i++;
	}

	void addTime(){
		h= h + hour;
		m= m + minute;
		sec = sec + second;
	}

	void displayDetail(){
		while(sec > 59){
			if (sec >= 60){
				m++;
				sec = sec-60;
			}
		}
		while(m > 59){
			if(m >= 60){
				h++;
				m = m-60;
			}
		}
		while(h > 23){
			if(h >= 24){
				day++;
				h = h-24;
			}
		}
		System.out.println(day+":"+h+":"+(m)+":"+(sec));
	}
}


public class Time{
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the total no. of time your want to add: ");
		int n = Sc.nextInt();
		TimeDetail a[] = new TimeDetail[n];
		for(i=0;i<n;i++){
			a[i] = new TimeDetail();
		}
		for(i=0;i<n;i++){
			a[i].getDetail();
		}
		for (i=0;i<n;i++) {
			a[i].addTime();
		}
		a[n-1].displayDetail();
	}
} 