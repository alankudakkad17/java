package program1;

import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x,y;
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER:");
        x=scan.nextInt();
        System.out.println("ENTER THE SECOND NUMBER:");
        y =scan.nextInt();
        System.out.println("sum="+(x+y));
	}

}
