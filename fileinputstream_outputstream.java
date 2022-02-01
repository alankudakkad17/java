package program1;
import java.io.*;
public class Filedata {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				File fin=new File("DATAFile.txt");
				if(fin.exists())
				{
					System.out.println("exist");
				}else
				{
					fin.createNewFile();
					System.out.println("file created");
					
				}
				try {
					FileOutputStream fout=new FileOutputStream("DATAFile.txt",true);
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					System.out.println("enter data");
					String s=br.readLine();
					byte[] arr=s.getBytes();
					fout.write(arr);
					System.out.println("data added");
					fout.flush();
					br.close();
					fout.close();
				}
				catch(Exception e) {
					System.out.println("File not found");
				}
				int i=0;
				FileInputStream fin1=new FileInputStream("DATAfile.txt");
				System.out.println(fin1.available());
				while((i=fin1.read())!=-1)
				{
					char c=(char)i;
					System.out.print(c);
						
				}
				fin1.close();
			}
}
