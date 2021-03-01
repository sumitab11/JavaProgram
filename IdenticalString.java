package sumit.com;

public class IdenticalString {

	static boolean permutation(String s, String t) {
		if(s.length() != t.length()) {
			return false;

		}
		int [] letters = new int[128];
	    char[] s_array = s.toCharArray();
		for(char c : s_array) {
			letters[c]++;
		}
		for(int i=0; i<t.length(); i++) {
			int c = (int) t.charAt(i);
			letters[c]--;
			if(letters[c]<0) {
				return false;
			}
			
		}
		return s.equals(t);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(permutation("sumit","sumit"));
		
	}

}
