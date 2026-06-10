package java_arrays;
//Original array: 2 5 4 3 6
//resultant array: 18 15 16 17 14

public class Program_4 {
		public static void main(String[]args) {
			int[] a = {2,5,4,3,6};
			solution(a);
			for(int x: a) {
				System.out.print(x+" ");
			}
		}
		public static void solution(int[] a) {
			int sum = 0;
			for(int x : a) {
				sum = x+sum;
			}
			for(int i=0;i<a.length;i++) {
				a[i]= sum - a[i];
			}
		}
}
