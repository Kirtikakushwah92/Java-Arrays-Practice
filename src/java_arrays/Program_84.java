package java_arrays;
// sort array descending order
public class Program_84 {

	public static void main(String[] args) {
		int[] a = {2,1,3,3,5,9,8,8};
		sortDesc(a);
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
	public static void sortDesc(int[] a) {
		int n = a.length-1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				if(a[j]<a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}
