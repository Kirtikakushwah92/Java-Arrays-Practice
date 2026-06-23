package java_arrays;
//WAJP to rotate all the elements of array k
//position to its left.
//array[] = {1, 2, 3, 4, 5, 6, 7}
//k = 2
//Output: {3, 4, 5, 6, 7, 1, 2}
public class Program_22 {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		leftRotate(a,2);
		for(int x: a) {
			System.out.print(x + " ");
		}

	}
	public static void leftRotate(int [] a ,int k) {
		for(int j=0;j<k;j++) {
			int first = a[0];
			for(int i=0;i<a.length-1;i++) {
				a[i] = a[i+1];
			}
			a[a.length-1]=first;
		}
	}

}
