package java_arrays;
//Max consecutive 1 in any array
// 6 1 1 1 7 7 1 1 1 1
// output : - 4 
public class Program_8 {
	public static void main(String[]args) {
		int[] a = {6,1,1,1,7,7,1,1,1,1,0};
		int result = maxConsecutive(a);
		System.out.println(result);
		
	}
	public static int maxConsecutive(int[] a) {
		int tempCount =0;
		int finalCount=0;
		for(int x :a) {
			if(x==1) {
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
