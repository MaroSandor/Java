package Boxing;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);

        System.out.println(numbers);

        int x = numbers.get(0);
        System.out.println(x);
    }
}
