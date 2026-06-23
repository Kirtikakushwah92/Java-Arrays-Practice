package java_arrays;
//WAJP to rotate each element of an array by one position in left side.
//Original array: 10 20 30 40 50 60 70
//Rotated array: 20 30 40 50 60 70 10

public class Program_20 {
	public static void main(String[]args) {
		int[] a = {10,20,30,40,50,60,70};
		leftRotate(a);
		for(int x : a) {
			System.out.print(x+" ");
		}
	}
	public static void leftRotate(int[] a) {
		int first = a[0];
		for(int i=0;i<a.length -1;i++) {
			a[i] = a[i+1];
		}
		a[a.length-1] = first;
	}
}
