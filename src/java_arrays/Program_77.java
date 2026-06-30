package java_arrays;
//Merge two sorted array in sorted manner. i/p: 
//arr1 = {20, 30, 50, 60} arr2 = {2, 28, 32, 35, 42} 
//merged: {2, 20, 28, 30, 32, 35, 42, 50, 60}

public class Program_77 {

	public static void main(String[] args) {
		int[] a = {20,30,50,60};
		int[] b = {2, 28, 32, 35, 42} ;
		int[] c = mergedTwoArraySorted(a,b);
		for(int x : c) {
			System.out.print(x+" ");
		}
	}
	public static int[] mergedTwoArraySorted(int[] a,int[]b) {
		int[] merged = new int[a.length+b.length];
		
		int i=0,j=0,ind=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				merged[ind++]=a[i++];
			}
			else {
				merged[ind++]=b[j++];
			}
		}
		while(i<a.length) {
			merged[ind++]=a[i++];
		}
		while(j<b.length) {
			merged[ind++]=b[j++];
		}
	return merged;	
	}

}
