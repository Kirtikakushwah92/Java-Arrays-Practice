package java_arrays;
//Implement binary search algorithm.
// apply only sorted array
public class Program_88 {

	public static void main(String[] args) {
		int[] a = {10,13,18,20,24};
		int index =binarySearch(a,24);
		System.out.println(index);
	}
	public static int binarySearch(int[] a,int key) {
		int low = 0; int high = a.length-1;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(a[mid]==key) {
				return mid;
			}
			else if(a[mid]>key) {
				high = mid-1;
			}
			else if(a[mid]<key) {
				low= mid+1;
			}
		}
		return -1;
	}

}
