package java_arrays;
// Insertion sort 
public class Program_74 {

	public static void main(String[] args) {
		int[] a = {3,4,4,5,8,9,1};
		System.out.print("Before Sorting : ");
		for(int x : a) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.print("After Sorting : ");
		insertionSort(a);
		for(int x : a) {
			System.out.print(x+" ");
		}
	}
	public static void insertionSort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j]>key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
	}
	

}
