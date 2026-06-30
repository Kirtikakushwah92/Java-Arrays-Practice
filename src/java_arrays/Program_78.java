package java_arrays;
//nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
public class Program_78 {

	public static void main(String[] args) {
		int[] a = {1,2,3,0,0,0};
		int[] b = {2, 5,6} ;
		mergedTwoArraySorted(a,3,b,3);
	
	}
	public static void mergedTwoArraySorted(int[] a,int m ,int[]b,int n) {
		int[] merged = new int[m+n];
		
		int i=0,j=0,ind=0;
		while(i<m && j<n) {
			if(a[i]<=b[j]) {
				merged[ind++]=a[i++];
			}
			else {
				merged[ind++]=b[j++];
			}
		}
		while(i<m) {
			merged[ind++]=a[i++];
		}
		while(j<n) {
			merged[ind++]=b[j++];
		}
	for(int k =0;k<m+n;k++) {
		a[k]=merged[k];
	}	
	for(int p : a) {
		System.out.print(p+" ");
	}
	}

}
