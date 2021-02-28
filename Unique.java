package sumit.com;

public class Unique {
	
	static boolean isUnique(String str) {
		if(str.length()>128) {
			return false;
		}
		
		boolean[] charCheck =  new boolean[128];
		for(int i=0; i<str.length();i++) {
			int val= str.charAt(i);
			if(charCheck[val]) {
				return false;
			}
			charCheck[val] =  true;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	System.out.println(isUnique("sumit"));
	}

}
