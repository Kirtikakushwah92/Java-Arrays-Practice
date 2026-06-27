package java_arrays;
//WAJP to store first n palindrome numbers into array.
import java.util.Scanner;
public class Program_36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int num = 10;
		int index =0;
		while(index < n) {
			if(isPalindrome(num)) {
				a[index] = num;
				index++;
			}
			num++;
		}
		System.out.println("First "+n+" palindrome numbers in the array ");
		for(int x: a) {
			System.out.print(x+" ");
		}
		
	}
	
	public static boolean isPalindrome(int n) {
		int reverse = 0; int orignal =n;
		while(n>0) {
			int digit = n%10;
			reverse = reverse*10+digit;
			n/=10;
		}
		return reverse==orignal;
	}
}
