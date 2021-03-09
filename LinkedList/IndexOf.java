package sumit.com.list;

import java.util.*;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("hello");
		ll.add("world");
		ll.add("welcome");
		System.out.println("list::"+ll);
		System.out.println("index of hello:"+ll.indexOf("hello"));
		System.out.println("Index of welcome:"+ll.indexOf("welcome"));
	

	}

}
