package java_arrays;
//WAJP to print the smaller element and its frequency which has appeared for the
//maximum time in the array if more than one
//elements have maximum frequency.
public class Program_55 {

	public static void main(String[] args) {
		int[] a = {3,4,5,6,8,3,2,2,7,2};
		printSmallestElementMaxFreq(a);

	}
	public static void printSmallestElementMaxFreq(int[] a) {
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
		int element = min;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>big) {
				big = freq[i];
			}
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]==big) {
				System.out.println("Smallest Element : "+(i+min));
				System.out.println("Frequency : "+ freq[i]);
				break;
			}
		}
		
	}

}
