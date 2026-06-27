package java_arrays;
//WAJP to store n terms of Fibonacci series into an array.
import java.util.Scanner;
public class Program_37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number n : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		if(n>0) {
			a[0]=0;
		}
		if(n>1) {
			a[1] = 1;
		}
		for(int i = 2;i<n;i++) {
			a[i] = a[i-1]+a[i-2];
		}
		System.out.println("Fibonacci Series:");
		
	    for (int i = 0; i < n; i++) {
	           System.out.print(a[i] + " ");
	    }
	    sc.close();

	}

}
