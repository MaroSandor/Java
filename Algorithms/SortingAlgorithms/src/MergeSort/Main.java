package MergeSort;


public class Main {
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original array: " + java.util.Arrays.toString(array));

        // MergeSort example
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.length - 1);

        System.out.println("Sorted array using Merge Sort: " + java.util.Arrays.toString(array));
    }
}
