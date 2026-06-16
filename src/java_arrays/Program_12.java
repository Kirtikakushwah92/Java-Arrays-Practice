package java_arrays;
// WAJP to reverse 1st half and 2nd half elements of array.
//Original array: 10 20 30 40 50 60 70
//Reversed array: 40 30 20 10 70 60 50

public class Program_12 {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60,70};
		reverse(a,0,a.length/2);
		reverse(a,(a.length/2)+1,a.length-1);
		for(int x : a) {
			System.out.print(x+" ");
		}
	}
	public static void reverse(int[] a , int start , int end) {
		while(start<end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++; end--;
		}
	}
}
