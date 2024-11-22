package BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);

        System.out.println("Bubble Sort result: " + java.util.Arrays.toString(array));
    }
}
