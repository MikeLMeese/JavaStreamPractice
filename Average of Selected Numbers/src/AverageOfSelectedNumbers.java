import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

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

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String response = scan.nextLine();

        if (response.equalsIgnoreCase("n")) {
            double avg = listOfNumbers.stream()
            .mapToInt(num -> num)
            .filter(num -> num < 0)
            .average()
            .getAsDouble();

            System.out.println("Average of the negative numbers: " + avg);
            
        } else {
            double avg = listOfNumbers.stream()
            .mapToInt(num -> num)
            .filter(num -> num > 0)
            .average()
            .getAsDouble();

            System.out.println("Average of the positive numbers: " + avg);
        }
    }
}
