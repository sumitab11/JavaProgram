package sumit.com;

public class CompressionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaabbbcccdde";
		int count = 1;
		for (int i = 0 ; i< str.length(); i++) {
			if(i< str.length()-1) {
				if(str.charAt(i)== str.charAt(i+1)) {
					count++;
				}else {
					System.out.print(str.charAt(i) +""+count);
					count = 1;
				}
			}
			else {
				System.out.println(str.charAt(i)+""+count);
			}
		}

	}

}
