package program1;
import java.util.Scanner;
class b extends Thread{
public void run() {

for(int i=1;i<=5;i++) {
System.out.println(i);
try {
Thread.sleep(400);
}
catch(Exception e){
System.out.println(e);
}
}
  }
}
class a  extends Thread{

public void run() {
for(char i='a';i<='e';i++) {
System.out.println(i);
try {
Thread.sleep(400);
}
catch(Exception e){
System.out.println(e);
}
}

}
}
public class Muli_threading_jion {

public static void main(String[] args) {
// TODO Auto-generated method stub
a a1=new a();
b b1=new b();
   try {
    a1.start();
    b1.start();
    a1.join();
    b1.join();
   }
   catch(Exception e) {
    System.out.println(e);
   }
   

}

}
