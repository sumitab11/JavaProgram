package sumit.com;

import java.util.Arrays;

public class BubbleSort {

	public void sort(int[] arr) {
		for(int i = 0; i<arr.length; i++)
			for(int j = 1; j<arr.length; j++)
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]= temp;
					
				}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num= {8,5,2,6,7};
		BubbleSort bs = new BubbleSort();
		bs.sort(num);
		System.out.println(Arrays.toString(num));

	}

}
