package sumit.com;

public class BinarySearch {

	int binarySearch(int arr[], int l, int r, int x) {
		    while(l <= r) {
			int mid = l + (r - 1) / 2;

			if (arr[mid] == x)
				return mid;
			if (arr[mid]>x) {
				return binarySearch(arr, l, mid - 1, x);
			    } else {
				return binarySearch(arr, mid + 1, r, x);
			      }
		    }
         return -1;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs = new BinarySearch();
		int arr[] = { 1, 2, 4, 8, 14, 20 };
		int x = 14;
		int n = arr.length;
		int result = bs.binarySearch(arr, 0, n-1, x);
		if (result == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println("Fount At index:" + result);
		}

	}

}
