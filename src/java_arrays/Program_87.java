package java_arrays;
// Linear Search
// when array is not sorted manner we can apply linear search
public class Program_87 {

	public static void main(String[] args) {
		int[] a = {2,3,4,5,7,8};
		int index = linearSearch(a,7);
		System.out.println(index);
		
	}
	public static int linearSearch(int[]a,int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}

}
