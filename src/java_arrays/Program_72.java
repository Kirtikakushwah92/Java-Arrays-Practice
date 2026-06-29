package java_arrays;
// bubble sort 
public class Program_72 {

	public static void main(String[] args) {
		int[] a = {3,4,5,8,9,1};
		System.out.print("Before Sorting : ");
		for(int x : a) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.print("After Sorting : ");
		bubbleSort(a);
		for(int x : a) {
			System.out.print(x+" ");
		}
	}
	public static void bubbleSort(int[] a) {
		int n = a.length-1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				if(a[j] >a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	

}
