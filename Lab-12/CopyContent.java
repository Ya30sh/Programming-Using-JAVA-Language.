import java.io.*;
public class CopyContent{
	public static void main(String[] args){
		try{
			FileInputStream fil = new FileInputStream("Content.txt");
			FileOutputStream ofil = new FileOutputStream("Outputfile.txt");
			int i = 0;
			while((i = fil.read()) != -1){
				ofil.write((char)i);
				System.out.print((char)i);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}