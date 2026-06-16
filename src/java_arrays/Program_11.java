package java_arrays;
// WAJP to reverse each element of the array.
// Original array: 10 20 30 40 50 60 70
// Reversed array: 70 60 50 40 30 20 10

public class Program_11 {
	public static void main(String[]args) {
		int[] a = {10,20,30,40,50,60,90,80};
		for(int x : a) {
			System.out.print(x+" ");
		}
		System.out.println();
		int[] res = reverse(a);
		for(int y : res) {
			System.out.print(y+" ");
		}
	}
	public static int[] reverse(int[] a) {
		int start = 0;
		int end = a.length-1;
		while(start<end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
		start++;
		end--;
		}
	return a;
	}
}
