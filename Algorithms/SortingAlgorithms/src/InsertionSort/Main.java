package InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Original array: " + java.util.Arrays.toString(array));

        // InsertionSort example
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array);

        System.out.println("Sorted array using Insertion Sort: " + java.util.Arrays.toString(array));
    }
}
