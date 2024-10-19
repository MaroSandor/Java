package BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;

        System.out.println("Array: " + java.util.Arrays.toString(array));
        System.out.println("Target to search: " + target);

        // BinarySearch example
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.search(array, target);

        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}