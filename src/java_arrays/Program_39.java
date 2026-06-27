package java_arrays;
//WAJP to print all the prime numbers up to n by using Sieve of Eratosthenes
//mechanism.
import java.util.Scanner;
public class Program_39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		boolean [] prime = new boolean[n+1];
		for(int i=2;i<n;i++) {
			prime[i]=true;
		}
		for(int i=2;i*i<=n;i++) {
			if(prime[i]) {
				for(int j=i*i;j<n;j+=i) {
					prime[j]=false;
				}
			}
		}
	     System.out.println("Prime Numbers:");

	       for (int i = 2; i < n; i++) {

	            if (prime[i]) {
	                System.out.print(i + " ");
	            }
	       }

	        sc.close();
	}

}
