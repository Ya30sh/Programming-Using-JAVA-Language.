public class FinalWordDemo{
	public static void main(String[] args) {
		final int n = 1; //can't n=n+1 nor n++ nor n-- only print(n+1) or assign value to another variable 
		//if final word in method cant override if final word in class cant extend 
		int m = n+1;
		System.out.println( m);	
	}
}