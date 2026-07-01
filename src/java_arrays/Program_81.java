package java_arrays;
// Quick Sort 
public class Program_81 {

	public static void main(String[] args) {
		int[] a = {6,4,3,1,10,8,9};
		quickSort(a,0,a.length-1);
		for(int x : a) {
			System.out.print(x+" ");
		}
	}
	
	public static void quickSort(int[] a ,int start,int end) {
		if(start<end) {
		int partitionIndex = partition(a,start,end);
		quickSort(a,start,partitionIndex -1);
		quickSort(a,partitionIndex +1,end);
		}
	}
	public static int partition(int[] a ,int start,int end) {
		int mid = start+(end-start)/2;
		int pivot = a[mid];
		swap(a,mid,end);
		int i=start;
		for(int j=start;j<end;j++) {
			if(a[j]<pivot) {
				swap(a,i++,j);
			}
		}
		swap(a,i,end);
	return i;
	}
	public static void swap(int[]a,int i,int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
}
