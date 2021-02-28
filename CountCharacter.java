package sumit.com;

import java.util.*;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		s = sc.nextLine();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("total character in string is:" + count);

	}

}
