package sumit.com;

import java.util.Arrays;

public class ParmutationString {
	static String sort(String s) {
		char[] str = s.toCharArray();
		Arrays.sort(str);
	     return new String(str);	
	}
	static boolean permutation(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(permutation("god","dog"));
		
	}

}
