package java_arrays;
//485. Max Consecutive Ones
//Input: nums = [1,1,0,1,1,1]
//Output: 3
//Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
public class Program_7 {
	public static void main(String[]args) {
		int[] a = {1,1,1,1,0,1,1,1,0,1,1,1,1,1,1};
		int result = maxConsecutive(a);
		System.out.println(result);
	}
	public static int maxConsecutive(int[] a) {
		int tempCount = 0;
		int finalCount = 0;
		for(int x: a) {
			if(x==1) {
				tempCount++;
			}
			if(tempCount > finalCount) {
				finalCount = tempCount;
			}
			else if(x==0) {
				tempCount=0;
			}
		}
		if(tempCount >finalCount) {
			finalCount = tempCount;
		}
	return finalCount;
	}
}
