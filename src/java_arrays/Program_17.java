package java_arrays;
//WAJP to insert an element at certain position of the array.
//Original array: 10 20 30 40 50 60 70
//Updated array: 10 20 30 35 40 50 60 70
public class Program_17 {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60,70};
		int[] res = insertElement(a,3,35);
		for(int x : res) {
			System.out.print(x+" ");
		}

	}
	public static int[] insertElement(int[] a, int position, int element) {
		int[] res = new int[a.length+1];
		for(int i =0 ; i<res.length;i++) {
			if(i<position) {
				res[i]=a[i];
			}
			else if(i==position) {
				res[i] = element;
			}
			else {
				res[i] =a[i-1];
			}	
		}
	return res;
	}

}
