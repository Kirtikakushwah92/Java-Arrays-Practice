package java_arrays;
//Third Maximum Number

public class Program_43 {

	public static void main(String[] args) {
		int[] a = {80, 80, 43, 50, 38, 63, 58, 80};
		int result = printThirdMax(a);
		System.out.println(result);

	}
	public static int printThirdMax(int[] a) {
		Long first = null;
		Long second = null;
		Long third = null;
		for(int x : a) {
			if( (first != null && x==first) || 
				(second != null && x==second) ||
				(third != null && x==third)){
					continue;
			}
			if(first == null || x>first) {
				third = second;
				second=first;
				first = (long)x;
			}
			else if(second == null || x>second) {
				third = second;
				second = (long)x;
			}
			else if(third == null || x>third) {
				third = (long)x;
			}
		}
		return third==null ? first.intValue():third.intValue();
		
	}

}
