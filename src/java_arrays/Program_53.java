package java_arrays;
//WAJP to print the element and its frequency
//which has appeared for the maximum time in
//the array.
public class Program_53 {
	public static void main(String[] args) {
		int[] a = {1,1,3,4,5,4,4,4,7,5,6,7,5,5,5,6,6,7,7,7,7,9,7,9,7};
		printMaxFreq(a);
	}
	public static void printMaxFreq(int[] a) {
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
		int big=freq[0];
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>big) {
				big = freq[i];
			}
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]==big) {
				System.out.println("Element : "+(i+min));
				System.out.println("Frequency : "+ freq[i]);
			}
		}
	}

}
