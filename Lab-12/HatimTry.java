public class HatimTry{
	public static void main(String[] args) {
		try{
			int a = 1/0;
		}catch(Exception e){
			System.out.println(e.getMessage());
			// e.printStackTrace();
			// System.out.println(e);
		}
	}
}