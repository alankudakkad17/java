package program1;
import java.util.Scanner;
class area{
	int area(int b,int h) {
		System.out.print("area of triangle ="+(b/2*h)+"\n");
		return 0;
	}
	float area(float l,float b) {
		System.out.print("area of rectangle ="+(l*b)+"\n");
		return 0;
	}
	float area(float r) {
		System.out.print("area of circle ="+(3.14f*r*r)+"\n");
		return 0;
	}
}

public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area a=new area();
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the base of triangle");
		float baseoftriangle=sc.nextint();
		System.out.println("enter the height of triangle");
		float heightoftriangle=sc.nextint();
		
		
		System.out.println("enter the base of rectangle");
		float breathofrectangle=sc.nextFloat();
		System.out.println("enter the lenght of triangle");
		float lenghtofrectangle=sc.nextFloat();
		
		System.out.println("enter the radius of circle");
		float radiusofcircle=sc.nextFloat();
		
		
		a.area(lenghtofrectangle, breathofrectangle);
		a.area(baseoftriangle, heightoftriangle);
		a.area(radiusofcircle);
	}

}
