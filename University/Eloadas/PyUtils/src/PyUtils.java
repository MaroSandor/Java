import java.util.List;
import java.util.ArrayList;

public class PyUtils {
    private PyUtils() {
        // üres
    }

    public static List<Integer> range(int hi) {
        return range(0, hi, 1);
    }

    public static List<Integer> range(int lo, int hi) {
        return range(lo, hi, 1);
    }

    public static List<Integer> range(int lo, int hi, int step) {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = lo; i < hi; i += step) {
            result.add(i);
        }

        return result;
    }
}
