package sumit.com.list;

import java.util.LinkedList;

public class AddByIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("welcome");
		ll.add("to");
		ll.add("this");
		ll.add("is");
		ll.add("the");
		ll.add("country");
		System.out.println("Before Append:"+ll);
		ll.add(2, "india");
		ll.add(6, "beutiful");
		System.out.println("Current list :"+ll);
		
	}

}
