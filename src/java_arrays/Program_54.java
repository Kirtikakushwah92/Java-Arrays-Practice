package java_arrays;
//WAJP to return the element which has highest frequency in the array.
public class Program_54 {
	public static void main(String[] args) {
		int[] a = {1,1,3,4,5,4,4,4,7,5,6,7,5,5,5,6,6,7,7,7,7,9,7,9,7};
		int result = printMaxFreq(a);
		System.out.println(result);
	}
	public static int printMaxFreq(int[] a) {
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
				big= freq[i];
				element=i+min;
			}
		}
		return element;
	}

}
