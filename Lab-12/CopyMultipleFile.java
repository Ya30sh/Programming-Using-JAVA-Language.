import java.io.*;
public class CopyMultipleFile{
	public static void main(String[] args){
		try{
			FileInputStream file1 = new FileInputStream("Gokul Hospital - Copy.pdf");
			FileInputStream file2 = new FileInputStream("Gokul Hospital - Copy (2).pdf");
			FileOutputStream outfile1 = new FileOutputStream("Gokul Hospital.pdf");

			int i=0;
			while((i=file1.read()) != -1){
				outfile1.write((char)i);
			}
			outfile1.write((char)10);
			while((i=file2.read()) != -1){
				outfile1.write((char)i);
			}
		}catch(Exception e){
			e.printStackTrace(); 
		}
	}
}