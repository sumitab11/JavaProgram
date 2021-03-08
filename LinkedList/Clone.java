package sumit.com.list;

import java.util.LinkedList;

public class Clone {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("My");
		ll.add("name");
		ll.add("is");
		ll.add("Sumit");
	
		System.out.println("fisrt List:"+ll);
		
		LinkedList<String> ll_sec = new LinkedList<String>();
		ll_sec = (LinkedList<String>) ll.clone();
		System.out.println("Second List After cloning:"+ll_sec);
	}

}
