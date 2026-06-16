package java_arrays;
// Two Sum 
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class Program_15 {

	public static void main(String[] args) {
		int[] a = {2,7,11,15};
		int[] res = twoSum(a,9);
		for(int x : res) {
			System.out.print(x+" ");
		}
	}
	public static int[] twoSum(int[]a , int n) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1 ; j<a.length;j++) {
				if(a[i]+a[j] == n) {
					return new int[]{i,j};
				}
			}
		
		}
		return null;
	}

}
