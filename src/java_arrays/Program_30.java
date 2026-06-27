package java_arrays;
//For the given array of 0’s, 1’s and 2’s
//Sort the elements(Without Sorting).
//i/p: [0, 2, 0, 1, 2, 1, 0, 2]
//o/p: [0, 0, 0, 1, 1, 2, 2, 2]
public class Program_30 {
	public static void main(String[]args) {
		int[] a = {0, 2, 0, 1, 2, 1, 0, 2};
		sortArray(a);
		for(int x : a) {
			System.out.print(x+" ");
		}
	}
	public static void sortArray(int[] a) {
		int zero=0,one=0,two=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				zero++;
			}
			else if(a[i]==1) {
				one++;
			}
			else {
				two++;
			}
		}
		int n = 0;
		while(zero >0) {
			a[n++] =0;
			zero--;
		}
		while(one>0) {
			a[n++]=1;
			one--;
		}
		while(two > 0) {
			a[n++] = 2;
			two--;
		}
	}
}
