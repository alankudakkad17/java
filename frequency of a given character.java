package program; 

 

import java.util.Scanner; 

 

public class frequency { 

 

public static void main(String[] args) { 

// TODO Auto-generated method stub 

String word; 

char letter; 

int ln,i,c=0; 

System.out.println("Enter the word"); 

Scanner scan=new Scanner(System.in); 

word=scan.next(); 

ln=word.length(); 

System.out.println("Enter specific charater to check"); 

letter=scan.next().charAt(0); 

for(i=0;i<=ln-1;i++) 

{ 

if(word.charAt(i)==letter) 

c++; 

 

} 

System.out.println("The letter "+letter+" is "+c+" in the word "+word); 

} 

} 
