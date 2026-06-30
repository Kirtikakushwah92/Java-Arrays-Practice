package java_arrays;
//WAJP to zigzag merge two arrays into a single
//array.
//i/p:
//arr1 = {20, 30, 50}
//arr2 = {2, 4, 6, 8, 10}
//merged: {20, 2, 30, 4, 50, 6, 8, 10}
public class Program_76 {

	public static void main(String[] args) {
		int [] arr1 = {20, 30, 50};
		int [] arr2 = {2, 4, 6, 8, 10};
		int[] result = zigzagArray(arr1,arr2);
		for(int x: result) {
			System.out.print(x+" ");
		}
	}
	public static int[] zigzagArray(int[] a,int[] b) {
		int [] merged = new int[a.length+b.length];
		int i=0,j=0,ind=0;
		while(i<a.length && j<b.length){
			if(ind%2==0) {
				merged[ind++] = a[i++];
			}
			else {
				merged[ind++]=b[j++];
			}
		}
		while(i<a.length) {
			merged[ind++] = a[i++];
		}
		while(j<b.length) {
			merged[ind++]=b[j++];
		}
	return merged;
	}

}
