package java_arrays;
//WAJP to print true if all the elements in two
//arrays are same otherwise print false.
public class Program_31 {
	public static void main(String[]args) {
		int[] a = {1,2,3,4,5,6};
		int[] b = {1,2,3,4,5,16};
		boolean res = checkElementSame(a,b);
		System.out.println(res);
		
	}
	public static boolean checkElementSame(int[] a,int[] b) {
		if(a.length != b.length) {
			return false;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
	return true;
	}
}
