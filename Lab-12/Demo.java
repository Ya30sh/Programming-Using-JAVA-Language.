import java.io.*;
public class Demo{
	public static void main(String[] args) {
		FileReader r1 = null;
		FileWriter w1= null;
		try{
			r1 = new FileReader("Content.txt");
			w1 = new FileWriter("Writer.txt");
			char ch;
			//char i = r1.read();
			while((ch=r1.read()) != -1){
				w1.write(ch);
				System.out.print(i);
				i=r1.read();
			}
			w1.close();
			//sw1.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			//w1.close();
		}
	}	
}
