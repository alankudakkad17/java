package program1;

import java.util.Scanner;

public class Try_catch_finally {
	public static void main(String args[]) {
		   int num1,num2,div;
		   char ch='y';
		   Scanner sc= new Scanner(System.in);
		   System.out.println("program to perform division:");
		   while(ch=='y') {
		   System.out.println("enter the first number:");
		   num1=sc.nextInt();
		   System.out.println("enter the second number:");
		   num2=sc.nextInt();
		   
		      try {
		         div=num1/num2;
		         System.out.println("result="+div);
		         
			    }
		      catch (ArithmeticException e) { 
		         System.out.println(e);
		         
		         
		       }
		      finally
              {
               System.out.println("End of Operatrion");   
              }
		      System.out.println("program to perform division:");
		      System.out.println("do you want to continue y or n");
		      ch=sc.next().charAt(0);
		      
		   }
}
}
