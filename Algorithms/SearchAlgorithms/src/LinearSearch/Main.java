package LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        int x = 10;

        System.out.println("Array: " + java.util.Arrays.toString(array));
        System.out.println("Element to search: " + x);

        // LinearSearch example
        LinearSearch linearSearch = new LinearSearch();
        int result = linearSearch.search(array, x);

        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
