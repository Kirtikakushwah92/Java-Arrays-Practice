package java_arrays;
//WAJP to check if an array is strictly increasing.
//i/p: [2, 3, 7, 8, 9]
//o/p: Array is strictly increasing
public class Program_26 {

	public static void main(String[] args) {
		int[] a = {2,3,7,8,9};
		checkStrictlyIncreasing(a);
		
		
		
	}
	
	 public static void checkStrictlyIncreasing(int[] a) {
	        boolean isIncreasing = true;

	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[i] >= a[i + 1]) {
	                isIncreasing = false;
	                break;
	            }
	        }

	        if (isIncreasing) {
	            System.out.println("Array is strictly increasing");
	        } else {
	            System.out.println("Array is not strictly increasing");
	        }
	    }

}
