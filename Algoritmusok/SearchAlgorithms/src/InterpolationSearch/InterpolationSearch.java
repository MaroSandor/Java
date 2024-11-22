package InterpolationSearch;

public class InterpolationSearch {
    public int search(int[] arr, int x) {
        int low = 0, high = arr.length - 1;

        while (low <= high && x >= arr[low] && x <= arr[high]) {
            if (low == high) {
                if (arr[low] == x) return low;
                return -1;
            }

            // Probing the position with interpolation formula
            int pos = low + ((x - arr[low]) * (high - low) / (arr[high] - arr[low]));

            // Check if the element is found
            if (arr[pos] == x) {
                return pos;
            }

            // If x is larger, x is in the upper part
            if (arr[pos] < x) {
                low = pos + 1;
            } else { // If x is smaller, x is in the lower part
                high = pos - 1;
            }
        }
        return -1;
    }
}
