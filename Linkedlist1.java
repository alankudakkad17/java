package program1;
import java.util.LinkedList;
import java.util.List;

public class LL {

public static void main(String[] args) {
// TODO Auto-generated method stub
List<Integer>numbers=new LinkedList<>();
numbers.add(2);
numbers.add(7);
numbers.add(9);
System.out.println("LL elements");
System.out.println("list elements:"+numbers);
int number=numbers.get(2);
System.out.println("accesed elements:"+number);
int index=numbers.indexOf(9);
System.out.println("accesed elements postion:"+index);
numbers.remove(2);
System.out.println("list elements:"+numbers);

}

}

