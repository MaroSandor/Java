package QuickSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};

        System.out.println("Original array: " + java.util.Arrays.toString(array));

        // QuickSort example
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array, 0, array.length - 1);

        System.out.println("Sorted array using Quick Sort: " + java.util.Arrays.toString(array));
    }
}
