//frequencyofcharacters 
package program1;

import java.util.Scanner;

public class frequencyofcharacters {

public static void main(String[] args) {
// TODO Auto-generated method stub\
String ch;
char ch1;
int i,x=0,n,flag=1;
System.out.println("Enter the string");
Scanner scan=new Scanner(System.in);
ch=scan.next();
n=ch.length();
System.out.println("Enter a Specific Character");
ch1=scan.next().charAt(0);
for(i=0;i<n;i++)
{
if(ch1==ch.charAt(i))
{
x++;
flag=1;
}
}
   System.out.println("The Character "+ch1+" occurs:"+x+" times");;
       
}

}

