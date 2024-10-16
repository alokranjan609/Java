import java.util.Scanner;

public class EvenOddCheck {

    // Function to check if a number is even or odd using bit manipulation
    public static String checkEvenOdd(int number) {
        // Edge case: Handling zero explicitly
        if (number == 0) {
            return "0 is neither even nor odd (considered even).";
        }

        // Bit manipulation to check if the last bit is 1 (odd) or 0 (even)
        if ((number & 1) == 0) {
            return number + " is even.";
        } else {
            return number + " is odd.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        // Check and print if the number is even or odd
        System.out.println(checkEvenOdd(input));

        // Edge cases tests:
        System.out.println(checkEvenOdd(0)); // 0 case
        System.out.println(checkEvenOdd(-2)); // Negative even number
        System.out.println(checkEvenOdd(-3)); // Negative odd number
        System.out.println(checkEvenOdd(Integer.MAX_VALUE)); // Maximum int value (odd)
        System.out.println(checkEvenOdd(Integer.MIN_VALUE)); // Minimum int value (even)
    }
}
