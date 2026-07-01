package java_arrays;
//WAJP to sort the array elements in ascending order by implementing Merge sort algorithm
public class Program_79 {

	public static void main(String[] args) {
		int[] a = {9,8,6,2,1,3,5,4};
		System.out.print("Before Sorting : ");
		for(int x : a) {
			System.out.print(x+" ");
		}
		divide(a,0,a.length-1);
		System.out.println();
		System.out.print("After Sorting : ");
		for(int y : a) {
			System.out.print(y+" ");
		}
	}
	public static void divide(int[] a,int start,int end) {
	if(start<end) {
		int mid = start+(end-start)/2;
		divide(a,start,mid);
		divide(a,mid+1,end);
		merge(a,start,mid,end);
	}
	}
	public static void merge(int[] a, int start,int mid, int end) {
		int [] merged = new int[end-start+1];
		int indx1 = start; int indx2= mid+1;int x =0;
		while(indx1<=mid && indx2<=end) {
			if(a[indx1]<a[indx2]) {
				merged[x++]=a[indx1++];
			}
			else {
				merged[x++] = a[indx2++];
			}
		}
		while(indx1<=mid) {
			merged[x++]=a[indx1++];
		}
		while(indx2<=end) {
			merged[x++] = a[indx2++];
		}
		for(int i=start,j=0;j<merged.length;j++,i++) {
			a[i] = merged[j];
		}
		}

}
