package java_arrays;
//WAJP to print and count all the palindrome number elements from array.
public class Program_34 {

	public static void main(String[] args) {
		int [] a = {212,234,567,898};
		printPalindrome(a);
	}
	public static void printPalindrome(int[] a) {
		int count=0;
		for(int i =0;i<a.length;i++) {
			if(isPalindrome(a[i])) {
				System.out.print(a[i]+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("total palindrome number is : "+count);
	}
	public static boolean isPalindrome(int n) {
		int orignal = n;
		int reverse = 0;
		while(n>0) {
			int digit = n%10;
			reverse = reverse* 10 +digit;
			n/=10;
		}
		return orignal==reverse;
	}
}
