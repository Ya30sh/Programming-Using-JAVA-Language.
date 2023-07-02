import java.io.*;
public class CopyPaste{
	public static void main(String[] args){
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try{
			fis = new FileInputStream("yash.txt");
			fos = new FileOutputStream("yashnew.txt");
			int i;

			while((i=fis.read()) != -1){
				fos.write((char) i);
			}
			
		}catch(Exception e){
				e.printStackTrace();
		}
		finally{
			try{
				if(fis != null){
					fis.close();
				}
				if(fos != null){
					fos.close();					
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}	
}	