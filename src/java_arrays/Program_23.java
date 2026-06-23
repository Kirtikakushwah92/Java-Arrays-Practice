package java_arrays;
//WAJP find missing element from a given array
//which has a missing element in a range of n.
//N=7
//i/p: [7, 4,3, 0, 5, 1, 6]
//o/p: 2
public class Program_23 {
	public static void main(String[]args) {
		int[] a = {7,4,3,0,5,1,6};
		int result = findMissingNumber(a,7);
		System.out.println(result);
	}
	public static int findMissingNumber(int[] a , int n) {
		int expectedSum = n* (n+1)/2;
		int actualSum = 0;
		for(int i=0 ;i<n;i++) {
			
			actualSum = a[i] + actualSum;
		}
	return expectedSum - actualSum;
	}
	
}
