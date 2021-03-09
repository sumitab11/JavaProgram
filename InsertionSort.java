package sumit.com;

import java.util.*;

public class InsertionSort {
	
	public void sort(int[] arr) {
		for(int i = 1; i<arr.length; i++) {
			int current = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > current) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {8,2,6,1,4};
		InsertionSort is = new InsertionSort();
		is.sort(num);
		System.out.println(Arrays.toString(num));

	}

}
