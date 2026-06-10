package java_arrays;
//For the given array of Strings, print the largest string.
public class Program_3 {
	public static void main(String[]args) {
		String[] str = {"hello","world","kiritka"};
		String result = printLargestString(str);
		System.out.println(result);
	}
	public static String printLargestString(String[] s) {
		String largest ="";
		for(String x : s) {
			if(x.length() > largest.length()) {
				largest = x;
			}
		}
		return largest;
	}
}
