//swapnotusingtemp 

package program1;

import java.util.Scanner;

public class swapnotusingtemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter  the first number x=");
		x=scan.nextInt();
		System.out.println("Enter  the second number y=");
		y=scan.nextInt();
		System.out.println("Before swappig");
		System.out.println("x="+x+" "+"y="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swappig");
		System.out.println("x="+x+" "+"y="+y);
	}

}
