package java_arrays;
//Print biggest element , smallest elements and their difference from the given array.
public class Program_1 {
	public static void main(String[]args) {
		int[] a = {1,2,3,4,5,6};
		printBigAndSmallElement(a);
	}	
	public static void printBigAndSmallElement(int[] a) {
        if (a.length == 0) {
            System.out.println("Array is empty");
            return;
        }
		int big = a[0];
		int small = a[0];
		for(int x:a) {
			if(x>big)
				big = x;
			if(x<small)
				small = x;
		}
		System.out.println("Biggest Element : "+big);
		System.out.println("Smallest Element : "+small);
		System.out.println("Difference : "+(big-small));
		
	}
}
