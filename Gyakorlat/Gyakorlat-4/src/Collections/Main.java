package Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(6);
        numbers.add(9);
        numbers.add(1);

        List<Integer> copy = new ArrayList<>(numbers);
        copy.set(0, 99);

        System.out.println(numbers);
        System.out.println(copy);

        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
        Collections.shuffle(numbers);
        System.out.println(numbers);
    }
}
