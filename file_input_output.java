package program1;
import java.io.File;
import java.io.*;
import java.util.Scanner;
public class Filename_1 {
		public static void main(String[] args) throws IOException{
			// TODO Auto-generated method stub
			File fin=new File("myfile.txt");
			if(fin.exists())
			{
				System.out.println("exists");
				
			}else
			{
				fin.createNewFile();
				System.out.println("file created");
			}
			FileOutputStream fout=new FileOutputStream("myfile.txt");
			Scanner s=new Scanner(System.in);
			System.out.print("No of elemets:");
			int n=s.nextInt();
			for(int i=1;i<=n;i++)
			{
				System.out.println("Enter the numbers "+i+":");
				int num=s.nextInt();	
				fout.write(num);
				}
			
			int i;
			FileInputStream fis=new FileInputStream("myfile.txt");
			System.out.println("Elemets:");
			while((i=fis.read())!=-1)
			{
				System.out.println(i);
			}
			fout.close();
		}
