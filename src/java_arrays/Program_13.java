package java_arrays;
//WAJP to check array is a palindromic array or not. Return true or false accordingly.
//Original array: 10 20 30 40 30 20 10
//Output: true
//Original array: 10 20 30 40 30 50 10
//Output: false
public class Program_13 {
	public static void main(String[] args) {
		int [] a = {10,20,30,40,30,20,10};
		boolean res = checkPalindrome(a);
		System.out.println(res);

	}
	public static boolean checkPalindrome(int[] a) {
		int start = 0;
		int end = a.length-1;
		while(start<end) {
			if(a[start] == a[end]) {
				start++; end--;
			}
			else {
				return false;
			}
		}
		return true;
		
	}

}
