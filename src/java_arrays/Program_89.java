package java_arrays;
//Search an element in a sorted array and return the
//index where it is found. If the element is not found
//then return the index where it will fit in the array.
public class Program_89 {

	public static void main(String[] args) {
		int[] a = {10,13,18,20,24,80};
		int index =binarySearch(a,21);
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
		return low;
	}

}
