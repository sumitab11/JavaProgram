package sumit.com;

import java.util.Scanner;

public class ReplaceSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String with spaces::");
		str = sc.nextLine();
		sc.close();
		str = str.trim();
		str = str.replaceAll("\\s", "%20");
		
		System.out.println(str);
		
	}

}
