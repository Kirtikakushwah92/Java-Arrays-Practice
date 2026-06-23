package java_arrays;
//WAJP to rotate all the elements of array k
//position to its right.
//array[] = {1,2,3,4,5,6,7} ,
//k=2
//Output: {6, 7, 1, 2, 3, 4, 5}
public class Program_19 {
	public static void main(String[]args) {
		int[] a = {1,2,3,4,5,6,7};
		rightRotate(a,2);
		for(int x: a) {
			System.out.print(x+" ");
		}
	}
	public static void rightRotate(int [] a,int k) {
		for(int j = 0 ; j<k;j++) {
			int last = a[a.length-1];
			for(int i=a.length-1;i>0;i--) {
				a[i] = a[i-1];
			}
			a[0] = last;
		}
	}
}
