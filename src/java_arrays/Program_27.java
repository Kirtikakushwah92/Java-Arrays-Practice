package java_arrays;
//WAJP to check whether a given array is in
//sorted order or not.
//i/p: [2, 7, 7, 8, 9]
//o/p: Array is sorted
public class Program_27 {

    public static void main(String[] args) {
        int[] a = {2, 7, 7, 8, 9};
        checkSorted(a);
    }

    public static void checkSorted(int[] a) {
        boolean isSorted = true;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
