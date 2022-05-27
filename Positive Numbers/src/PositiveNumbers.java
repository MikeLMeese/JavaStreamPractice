import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static void main(String[] args) throws Exception {
        List<Integer> list = Arrays.asList(12, -3, 4, -6, 5, -22, 10, -78, 90);
        System.out.println(positive(list));
    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
        .filter(n -> n > 0)
        .collect(Collectors.toList());
    }
}
