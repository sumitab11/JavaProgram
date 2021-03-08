package sumit.com.list;

import java.util.*;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("wlecome");
		ll.add("to");
		ll.add("the");
		ll.add("india");
		 
		Collection<String> cl = new ArrayList<String>();
		cl.add("this");
		cl.add("is");
		cl.add("the");
		cl.add("Beutiful");
		cl.add("country");
		System.out.println("The LinkedList before append::"+ll);
		ll.addAll(cl);
		System.out.println("The LinkedList after append::"+ll);
	}

}
