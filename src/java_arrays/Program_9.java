package java_arrays;
// Max consecutive n in any array
// 6 1 1 1 7 7 1 7 1 1
// If n=7
// o/p: 2
public class Program_9 {
	public static void main(String[]args) {
		int[] a = {6, 1, 1, 1, 7, 7, 1, 7, 1 ,1};
		int n = 7;
		int result = maxConsecutive(a,n);
		System.out.println(result);
		
	}
	public static int maxConsecutive(int[] a,int n) {
		int tempCount =0;
		int finalCount=0;
		for(int x :a) {
			if(x==n) {
				tempCount++;
				if(tempCount >finalCount) {
					finalCount = tempCount;
				}
			}
			else {
				tempCount=0; 
			}
			
		}
//		if(tempCount>finalCount) {
//			finalCount = tempCount;
//		}
		return finalCount;
	}
}
