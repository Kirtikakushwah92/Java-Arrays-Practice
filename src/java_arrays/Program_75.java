package java_arrays;
//WAJP to merge two arrays into a single array.
//i/p:
//arr1 = {1, 3, 5}
//arr2 = {2, 4, 6, 8, 10}
//merged: {1, 3, 5, 2, 4, 6, 8, 10}
public class Program_75 {

	public static void main(String[] args) {
		int [] arr1 = {1, 3, 5};
		int [] arr2 = {2, 4, 6, 8, 10};
		int[] result = mergedArray(arr1,arr2);
		for(int x: result) {
			System.out.print(x+" ");
		}
	}
	public static int[] mergedArray(int[] a,int[] b) {
		int [] newArray = new int[a.length+b.length];
		int k =0; int l =0;
		for(int i=0;i<newArray.length;i++) {
			if(i<a.length) {
				newArray[i]=a[k++];
			}
			else{
				newArray[i]=b[l++];
			}
		}
		return newArray;
	}

}
