package java_arrays;
//WAJP to print true if all the elements in the
//array are unique otherwise false.
public class Program_60 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,7,5,8,9};
		boolean result =uniqueElement(a);
		System.out.println(result);
	}
	public static boolean uniqueElement(int[] a) {
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
				return false;
			}	
		}
	return true;
	}

}
