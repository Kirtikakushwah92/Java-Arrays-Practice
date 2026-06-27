package java_arrays;
//WAJP to count all prime numbers up to n.

import java.util.Scanner;
public class Program_40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		boolean [] prime = new boolean[n+1];
		for(int i=2;i<=n;i++) {
			prime[i]=true;
		}
		for(int i=2;i*i<n;i++) {
			if(prime[i]) {
				for(int j=i*i;j<n;j+=i) {
					prime[j]=false;
				}
			}
		}
	     
	     int count =0;
	       for (int i = 2; i < n; i++) {

	            if (prime[i]) {
	                count++;
	            }
	       }
	       System.out.println("Count of Prime Numbers: "+count);
	        sc.close();
	}

}
