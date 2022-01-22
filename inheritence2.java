package program1;
import java.util.Scanner;
class employeer{
    String name, address;
    int age, salary, phonenumber;
    Scanner sc= new Scanner(System.in);
    void input(){
    System.out.println("Enter name:");
    name=sc.next();
    System.out.println("Enter the phone number:");
    phonenumber=sc.nextInt();
    System.out.println("Enter the address:");
    address=sc.next(); 
    System.out.println("Enter the age:");
    age=sc.nextInt(); 
    System.out.print("Enter the salary:");
    salary=sc.nextInt(); 
    }
    void output() {
    	System.out.println("Name:"+name);
    	System.out.println("address:"+address);
    	System.out.println("phonenumber:"+phonenumber);
    	System.out.println("age:"+age);
        System.out.println("Salary:" + salary);
    }
}
	
class officer extends employeer{
	String specialization;
	void getdata(){
	      Scanner  scan = new Scanner(System.in);
	      super.input();
	      System.out.print("Enter Specialization: ");
	      specialization = scan.nextLine();
	}
	void printdata() {
		  System.out.println("officer details:");
	      super.output();
	      System.out.print("Specialization:" +specialization+"\n\n");
	}
}

class manager extends employeer{
	String department;
	void getdata(){
	      Scanner  scan = new Scanner(System.in);
	      super.input();
	      System.out.print("department: ");
	      department = scan.nextLine();
        }
	void printdata(){
		  System.out.println("manager details:");
	      super.output();
	      System.out.print("department: " +department);
	}
	
}

public class Inheritence2{
    public static void main(String[] args){
        officer officer1 = new officer();
        manager manager1 = new manager();
        System.out.println("enter officer details");
        officer1.getdata();
        System.out.println("enter manager details");
        manager1.getdata();
        officer1.printdata();
        manager1.printdata();
    }
}
