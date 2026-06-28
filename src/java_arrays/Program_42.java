package java_arrays;
//WAJP to print Smallest and second Smallest
//element of the array.
//int[] a= {80, 80, 43, 50, 38, 63, 58, 80};
//o/p
//38
//43
public class Program_42 {

	public static void main(String[] args) {
		int[] a = {80, 80, 43, 50, 38, 63, 58, 80};
		printBiggestSmallest(a);
	}
	public static void printBiggestSmallest(int[] a) {
		int small = Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;
		for(int x : a) {
			if(x<small) {
				secondSmall=small;
				small = x;		
			}
			else if(x<secondSmall && x!=small) {
				secondSmall=x;
			}
		}	
		System.out.println("First Small : "+small);
		System.out.println("Second Small : "+secondSmall);
	}

}
