package java_arrays;
//WAJP to print and count all the prime number elements from array.
public class Program_32 {

	public static void main(String[] args) {
		int [] a = {2, 5, 8, 11, 15, 17, 20, 23, 24, 29};
		checkPrime(a);
	}
	public static void checkPrime(int[] a) {
		int count =0;
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])) {
				System.out.print(a[i]+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Total prime number is : "+count);
	}
	public static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		else if(n==2 || n==3) {
			return true;
		}
		if(n%2==0) {
			return false;
		}
		for(int i=3;i*i<n;i+=2) {
			if(n%i==0) {
				return false;
			}
		}
	return true;
	}

}
