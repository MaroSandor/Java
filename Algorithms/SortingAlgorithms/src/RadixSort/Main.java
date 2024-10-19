package RadixSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Original array: " + java.util.Arrays.toString(array));

        // RadixSort example
        RadixSort radixSort = new RadixSort();
        radixSort.sort(array);

        System.out.println("Sorted array using Radix Sort: " + java.util.Arrays.toString(array));
    }
}