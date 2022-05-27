import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Enter a number. Enter a negative number to stop.");

        while (true) {
            Integer input = Integer.valueOf(scan.nextLine());
            if (input < 0) {
                break;
            }
            numbers.add(input);
        }

        numbers.stream()
        .filter(num -> num >= 1 && num <= 5)
        .forEach(num -> System.out.println(num));
    }
}
