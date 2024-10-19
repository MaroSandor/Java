package HeapSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array: " + java.util.Arrays.toString(array));

        // HeapSort example
        HeapSort heapSort = new HeapSort();
        heapSort.sort(array);

        System.out.println("Sorted array using Heap Sort: " + java.util.Arrays.toString(array));
    }
}
