import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();

        System.out.println("Input numbers, type 'end' to stop.");

        while (true) {
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            listOfNumbers.add(Integer.valueOf(input));
        }

        double average = listOfNumbers.stream()
        .mapToInt(num -> num)
        .average()
        .getAsDouble();

        System.out.println("average of the numbers: " + average);
    }
}
