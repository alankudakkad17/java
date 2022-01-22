package program1;
abstract class shape{
    abstract void numberOfSides( );
}
class Rectangle extends shape{
void numberOfSides( ){
		System.out.println("I am Recatangle, I have 4 sides.");
	}
}
class Triangle extends Abstract{
	void numberOfSides( ){
		System.out.println("I am Triangle, I have 3 sides.");
	}	
}
class Hexagon extends Abstract{
	void numberOfSides( ){
		System.out.println("I am Hexagon, I have 6 sides.");
	}	
}
public class Abstract{
	public static void  main(String[] args){
	    Rectangle R= new Rectangle();
	    R.numberOfSides();
		Triangle t = new Triangle();
	    t.numberOfSides();
	    Hexagon H = new Hexagon();
	    H.numberOfSides();
	}
}
