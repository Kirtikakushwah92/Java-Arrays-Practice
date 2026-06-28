package java_arrays;
import java.util.PriorityQueue;
// kth Largest Element 
import java.util.Scanner;
public class Program_44 {
	public static void main(String[] args) {
		int[] a = {9,8,7,5,6,2,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int result = findKthElement(a,n);
		System.out.println(result);
	}
	public static int findKthElement(int[] a,int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int x : a) {
			pq.offer(x);
			
			if(pq.size()>k) {
				pq.poll();
			}
		}
		return pq.peek();
	}

}
