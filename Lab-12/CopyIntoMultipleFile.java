import java.io.*;
import java.util.Scanner;
public class CopyIntoMultipleFile{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of file wants to print: ");
		int n = sc.nextInt(); 
		try{
			FileInputStream fil = new FileInputStream("Content.txt");
			FileOutputStream ofil[] = new FileOutputStream[n];

			for(int i = 0;i<n;i++){
				ofil[i] = new FileOutputStream("Outputfile"+i+".txt");
			}

			int i =0;	
			while((i=fil.read()) != -1){
				for(int j =0;j<n;j++){
					ofil[j].write((char)i);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}