package java_arrays;
//WAJP to remove an element from the certain position of the array.
//Original array: 10 20 30 40 50 60 70
//Updated array: 10 20 40 50 60 70

public class Program_16 {

	public static void main(String[] args) {
		int[] a = {10 ,20 ,30, 40 ,50 ,60 ,70};
		int[] res = removeElement(a,2);
		for(int x : res) {
			System.out.print(x+" ");
		}

	}
	public static int[] removeElement(int[] a,int n) {
		int[] res = new int [a.length-1];
		for(int i=0;i<res.length;i++) {
			if(i<n) {
				res[i]=a[i];
			}
			else {
				res[i] = a[i+1];
			}
		}
		return res;
	}

}
