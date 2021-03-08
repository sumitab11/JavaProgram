package sumit.com.list;

import java.util.LinkedList;

public class ClearMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              LinkedList<Integer> ll = new LinkedList<Integer>();
              ll.add(1);
              ll.add(2);
              ll.add(5);
              ll.add(22);
              
              System.out.println("Before clearing:"+ll);
              ll.clear();
              
              System.out.println("After Clearing:"+ll);
              
              ll.add(65);
              ll.add(44);
              ll.add(66);
              ll.add(88);
              System.out.println("Afte adding element in empty list:"+ll);
	}

}
