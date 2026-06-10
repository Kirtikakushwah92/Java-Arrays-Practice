package java_arrays;
//Original array:2 5 4 3 6
//resultant array: 360 144 180 240 120 

public class Program_5 {
	public static void main(String[]args) {
		int[] a = {2,5,4,3,6};
		solution(a);
		for(int x: a) {
			System.out.print(x+" ");
		}
	}
	public static void solution(int[] a) {
		int multiply = 1;
		for(int x : a) {
			multiply = x * multiply;
		}
		System.out.println(multiply);
		for(int i=0;i<a.length;i++) {
			
			a[i]= multiply / (a[i]);
		}
	}
}
