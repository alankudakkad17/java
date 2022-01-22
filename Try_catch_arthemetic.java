package program1;
import java.util.Scanner;
public class Try_catch_arthemetic {
		   public static void main(String args[]) {
			   int num1,num2,div; 
			   Scanner sc= new Scanner(System.in);
			   System.out.println("enter the first number:");
			   num1=sc.nextInt();
			   System.out.println("enter the second number:");
			   num2=sc.nextInt();
			  try {
		         div=num1/num2;
			  }
		      catch (ArithmeticException e) { 
		         System.out.println("exception thrown:"+e);
		      }

}
}
