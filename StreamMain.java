import java.util.Arrays;
import java.util.List;

public class StreamMain {

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        array.stream()
                .filter(num -> num >= 0)
                .filter(num -> (num & 1) == 0)
                .sorted()
                .forEach(System.out::println);
    }
}
