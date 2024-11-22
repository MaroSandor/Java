package InterpolationSearch;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int x = 70;

        System.out.println("Array: " + java.util.Arrays.toString(array));
        System.out.println("Element to search: " + x);

        // Interpolation Search example
        InterpolationSearch interpolationSearch = new InterpolationSearch();
        int index = interpolationSearch.search(array, x);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}