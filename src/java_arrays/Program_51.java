package java_arrays;
//WAJP to print all the elements of array whose
//frequency are even.
public class Program_51 {
	public static void main(String[] args) {
		int[] a = {1,1,3,4,5,4,4,4,7};
		printEvenFreqElement(a);
	}
	public static void printEvenFreqElement(int[] a) {
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
			if(freq[i]>0 && freq[i] % 2==0) {
				System.out.print((i+min)+" ");
			}	
		}
	}

}
