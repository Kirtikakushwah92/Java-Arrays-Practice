package java_arrays;
//For the given array of Strings, print and count all the Strings which has even number of characters.
public class Program_2 {
		public static void main(String[]args) {
			String[] s = {"abcd","efgh","klmnopo"};
			countAndPrintEvenNumberOfCharacter(s);
		}
		public static void countAndPrintEvenNumberOfCharacter(String [] s) {
			int count =0;
			for(int i=0;i<s.length;i++) {
				if(s[i].length() %2 ==0) {
					count ++;
					System.out.println(s[i]);
				}
			}
//			 for (String str : s) {
//			        if (str.length() % 2 == 0) {
//			            System.out.println(str);
//			            count++;
//			        }
//			 }
			System.out.println("count : "+count);
		}
}
