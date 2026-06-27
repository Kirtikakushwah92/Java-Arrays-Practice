package java_arrays;
//WAJP to store first n prime numbers into array.
import java.util.Scanner;
public class Program_35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number n : ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int num = 2;
		int index =0;
		while(index<n) {
			if(isPrime(num)) {
				a[index] = num;
				index++;
			}
			num++;
		}
		System.out.println("first "+n+" prime number in the array : ");
		for(int x: a) {
			System.out.print(x+" ");
		}
	}
		public static boolean isPrime(int n) {
			if(n==2 || n==3) {
				return true;
			}
			else if(n%2 ==0) {
				return false;
			}
			for(int i=3;i*i<=n;i+=2) {
				if(n%i==0) {
					return false;
				}
			}
		return true;
		}
	
	

}
