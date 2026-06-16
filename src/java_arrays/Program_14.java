package java_arrays;
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
public class Program_14 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] res = runningArray(a);
		for(int x: a) {
			System.out.print(x+" ");
		}
	}
	public static int[] runningArray(int[] a) {
		for(int i=1;i<a.length;i++) {
			a[i] = a[i]+a[i-1];
		}
		return a;
	}

}
