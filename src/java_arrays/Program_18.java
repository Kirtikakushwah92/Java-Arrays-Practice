package java_arrays;
//WAJP to rotate each element of an array by one position in right side.
//Original array: 10 20 30 40 50 60 70
//Rotated array: 70 10 20 30 40 50 60
public class Program_18 {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70};

        rightRotate(a);

        for (int x : a) {
            System.out.print(x + " ");
        }
    }

    public static void rightRotate(int[] a) {
        int temp = a[a.length - 1]; // Store last element

        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1]; // Shift elements right
        }

        a[0] = temp; // Place last element at first position
    }
}