package java_arrays;
//WAJP the shift all 0’s to left and all 1’s to the
//right(Without Sorting).
//i/p: [0, 1, 1, 0, 0, 1, 0, 0]
//o/p: [0, 0, 0, 0, 0, 1, 1, 1]

public class Program_29 {
	public static void main(String[]args) {
		int[] a = {0,1,1,0,0,1,0,0};
		shiftZero(a);
		for(int x : a) {
			System.out.print(x+" ");
		}
	}
	public static void shiftZero(int[] a) {
		int index = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] != 1){
				a[index] = a[i];
				index++;
			}
		}
		while(index<a.length) {
			a[index] =1;
			index++;
		}
	}
}
