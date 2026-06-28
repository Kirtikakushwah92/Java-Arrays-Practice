package java_arrays;
//WAJP to print Biggest and second biggest element of the array.
//int[] a= {80, 80, 43, 50, 38, 63, 58, 80};
//o/p
//80
//63
public class Program_41 {

	public static void main(String[] args) {
		int[] a = {80, 80, 43, 50, 38, 63, 58, 80};
		printBiggestSmallest(a);
	}
	public static void printBiggestSmallest(int[] a) {
		int big = Integer.MIN_VALUE;
		int secondBig = Integer.MIN_VALUE;
		for(int x : a) {
			if(x>big) {
				secondBig=big;
				big = x;		
			}
			else if(x>secondBig && x!=big) {
				secondBig=x;
			}
		}	
		System.out.println("First Big : "+big);
		System.out.println("Second Big : "+secondBig);
	}

}
