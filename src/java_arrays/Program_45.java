package java_arrays;
//WAJP to print the frequency of each element of
//the array if all given elements are in range from
//0 to 100.
public class Program_45 {
	public static void main(String[] args) {
		int[] a = {10,9,10,2,3,2,2,10,8};
		frequencyArray(a);
	}
	public static void frequencyArray(int[] a) {
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
			if(freq[i]>0) {
				System.out.println((i+min)+" is : "+freq[i]+" times");
			}	
		}
	}

}
