package java_arrays;
//WAJP to print each element of the array which
//has appeared more than once/which has
//duplicate values in the array.
public class Program_50 {
	public static void main(String[] args) {
		int[] a = {10,9,10,2,3,2,2,10,8};
		printDuplicates(a);
	}
	public static void printDuplicates(int[] a) {
		int max = a[0]; int min = a[0];
		for(int x : a) {
			if(x>max) {
				max = x;
			}
			if(x<min) {
				min = x;
			}
		}
		int [] freq = new int[max-min+1];
		for(int i=0;i<a.length;i++) {
			freq[a[i]-min]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>1) {
				System.out.print((i+min)+" ");
			}	
		}
	}

}
