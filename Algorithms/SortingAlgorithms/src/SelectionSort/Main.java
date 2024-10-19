package SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Original array: " + java.util.Arrays.toString(array));

        // SelectionSort example
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);

        System.out.println("Sorted array using Selection Sort: " + java.util.Arrays.toString(array));
    }
}