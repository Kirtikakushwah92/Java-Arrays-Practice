package java_arrays;
// WAJP to swap two index values of the array.
// Original array: 10 20 30 40 50 60 70
//Swapped array: 10 60 30 40 50 20 70
public class Program_10 {
		public static void main(String[]args) {
			int [] orignal = {10,20,30,40,50,60,70};
			swappedArray(orignal,1,5);
			for(int x : orignal) {
				System.out.print(x+" ");
			}
		}
		public static void swappedArray(int[] a, int i , int j) {
			 if (i < 0 || j < 0 || i >= a.length || j >= a.length) {
			        System.out.println("Invalid index");
			        return;
			 }
			int temp =a[i];
			a[i] = a[j];
			a[j]=temp;
			
		}
}
