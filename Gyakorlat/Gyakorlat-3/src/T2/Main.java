package T2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {45, 64, 44, 75, 74, 54, 65};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
