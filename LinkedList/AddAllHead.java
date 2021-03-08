package sumit.com.list;

import java.util.*;

public class AddAllHead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<Integer>();
		 ll.add(2);
		 ll.add(3);
		 ll.add(4);
		 ll.add(6);
		 System.out.println("LinkedList before append::"+ll);

		  Collection<Integer> cl = new ArrayList<Integer>();
		  cl.add(9);
		  cl.add(10);
		  cl.add(13);
		  ll.addAll(0, cl);
		  System.out.println("LinkedList after append::"+ll);
		 
	}

}
