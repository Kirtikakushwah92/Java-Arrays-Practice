package java_arrays;
// Selection sort 
public class Program_73 {

	public static void main(String[] args) {
		int[] a = {3,4,4,5,8,9,1};
		System.out.print("Before Sorting : ");
		for(int x : a) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.print("After Sorting : ");
		SelectionSort(a);
		for(int x : a) {
			System.out.print(x+" ");
		}
	}
	public static void SelectionSort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int min = a[i]; int index = i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<min) {
					min=a[j];
					
					index=j;
				}
			}
			a[index] = a[i];
			a[i] = min;
		}
	}
	

}
