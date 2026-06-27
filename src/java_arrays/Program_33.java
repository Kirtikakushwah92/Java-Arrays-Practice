package java_arrays;
//WAJP to get sum of all the prime number elements from array.
public class Program_33 {

	public static void main(String[] args) {
		int [] a = {2, 5, 8, 11, 15, 17, 20, 23, 24, 29};
		checkPrime(a);
	}
	public static void checkPrime(int[] a) {
		int allSum =0;
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])) {
				allSum = a[i]+allSum;
				
			}
		}
		
		System.out.println("Total Sum is : "+allSum);
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
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0) {
				return false;
			}
		}
	return true;
	}
}
