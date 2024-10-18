import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> result_1 = PyUtils.range(20);
        List<Integer> result_2 = PyUtils.range(5, 20);
        List<Integer> result_3 = PyUtils.range(5, 20, 2);

        System.out.println(result_1);
        System.out.println(result_2);
        System.out.println(result_3);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);

        printConsole(numbers);
    }

    public static void printConsole(List<Integer> list) {
        System.out.println(list);
    }
}
