import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ArrayList<String> listOfStrings = new ArrayList<String>();
        System.out.println("Please input a string. Enter a blank string to stop");

        while (true) {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
            }
            listOfStrings.add(input);
        }

        listOfStrings.stream()
        .forEach(string -> System.out.println(string));
    }
}
