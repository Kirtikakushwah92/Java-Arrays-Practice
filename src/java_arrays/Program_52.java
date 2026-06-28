package java_arrays;
//WAJP to print all the elements of array whose
//frequency are odd.
public class Program_52 {
	public static void main(String[] args) {
		int[] a = {1,1,3,4,5,4,4,4,7};
		printOddFreqElement(a);
	}
	public static void printOddFreqElement(int[] a) {
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
			if(freq[i]>0 && freq[i] % 2==1) {
				System.out.print((i+min)+" ");
			}	
		}
	}

}
