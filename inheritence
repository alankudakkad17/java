package javapkg;
import java.util.Scanner;
class employee
{ static int basic_sal;
  static int ta;
  static int oa;
  int net_sal;
   Scanner sc= new Scanner(System.in);
   void getData()
  { System.out.println("Enter the basic salary of the employee:");
        basic_sal=sc.nextInt();
        System.out.println("Enter the TA of the employee:");
        ta=sc.nextInt();
        System.out.println("Enter the OA of the employee:");
        oa=sc.nextInt();      
}
   void calcNet()
  { System.out.println("Net salary of the employee:"+(basic_sal+ta+oa));}
}
class engineer extends employee
{
   void calcEngSal()
  {System.out.println("salary of the engineer:"+(basic_sal+ta+oa)*2);
}}

public class inheritence {

public static void main(String[] args) {
engineer en = new engineer();
en.getData();
en.calcNet();
en.calcEngSal();
// TODO Auto-generated method stub

}

}
