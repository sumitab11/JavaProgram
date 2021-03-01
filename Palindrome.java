package sumit.com;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original, rev = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string:");
		original = sc.nextLine();
		sc.close();
		int length = original.length();

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + original.charAt(i);

		}
		if (original.equals(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}

}
