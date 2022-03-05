package program;
import java.util.Scanner; 
public class paliandrome { 

public static void main(String[] args) { 

// TODO Auto-generated method stub 

String word,rev=""; 

int len; 

System.out.println("Enter the word"); 

Scanner scan=new Scanner(System.in); 

word=scan.next(); 

len=word.length(); 

for(int i=len-1;i>=0;i--) 

{ 

rev=rev+word.charAt(i); 

 

} 

if(word.equals(rev)) 

System.out.println("The word "+word+" is paliandrome"); 

else 

System.out.println("The word "+word+" is not paliandrome"); 

} 

} 

