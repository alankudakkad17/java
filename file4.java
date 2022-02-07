package program1;
import java.io.*;
import java.util.*;
public class File_line_of_int {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		File fin=new File("intfile.txt");
		if(fin.exists())
		{
			System.out.println("exists");
			
		}else
		{
			fin.createNewFile();
			System.out.println("file created");
		}
		FileOutputStream fout=new FileOutputStream("intfile.txt");
		Scanner s=new Scanner(System.in);
		System.out.print("No of elemets:");
		int n=s.nextInt();
		System.out.println("enter the elements");
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the numbers "+i+":");
			int num=s.nextInt();	
			fout.write(num);
		}
		System.out.println("elements added\n");
		fout.close();
		FileReader fr= new FileReader("intfile.txt");
		int v;
		 while((v=fr.read())!=-1)
		{
			System.out.print(v+"\t");
		}
			
        fr.close();
	}

}
