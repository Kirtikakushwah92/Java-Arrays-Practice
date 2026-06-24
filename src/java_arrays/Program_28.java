package java_arrays;
//WAJP to move all zeroes of an array to the end.
//i/p: [7, 0, 2, 6, 0, 4]
//o/p: [7, 2, 6, 4, 0, 0]
public class Program_28 {

    public static void main(String[] args) {
        int[] a = {7, 0, 2, 6, 0, 4};
        moveZeroesToEnd(a);

        // print final array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void moveZeroesToEnd(int[] a) {
        int index = 0;

        // first place all non-zero elements at the beginning
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[index] = a[i];
                index++;
            }
        }

        // fill remaining positions with 0
        while (index < a.length) {
            a[index] = 0;
            index++;
        }
    }

}
