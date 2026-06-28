package java_arrays;
//Design a method to return the index of the first
//non-repeating element in an array otherwise
//return -1 if no such element is found.
public class Program_57 {
	public static void main(String[] args) {
		int[] a = {7,8,8,9,9,5,5,2,2,3,2};
		int result =nonRepeatElement(a);
		System.out.println(result);
	}
	public static int nonRepeatElement(int[] a) {
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
			if(freq[a[i]-min]==1) {
				return i;
			}	
		}
	return -1;
	}

}
