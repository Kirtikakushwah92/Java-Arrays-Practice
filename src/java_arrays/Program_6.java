package java_arrays;
//1929. Concatenation of Array
//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
public class Program_6 {
	public static void main(String[]args) {
		int[] a = {1,2,1};
		int [] b =solution(a);
		for(int x: b) {
			System.out.print(x+" ");
		}
	}
	public static int[] solution(int[] a) {
		int[] res = new int[a.length * 2];
		
		for(int i =0;i<a.length;i++) {
			res[i] = a[i];
			res[a.length + i] = a[i];
		}
	return res;
	}
}
