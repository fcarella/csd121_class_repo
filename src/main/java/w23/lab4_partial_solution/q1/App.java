package w23.lab4_partial_solution.q1;

import java.io.PrintStream;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int int1 = promptForInt("Enter an integer: ", in);
        int int2 = promptForInt("Enter another integer: ", in);
        double[] calculations = analyzeInts(int1, int2);
        printAnalysis(calculations, System.out);
    }

    /**
     * Repeatedly prompt the user with the given prompt string until they provide a valid integer
     * @param prompt The prompt to present to the user
     * @param in The user's input
     * @return The integer entered by the user
     */
    public static int promptForInt(String prompt, Scanner in) {
        while ( true ) {
            System.out.print(prompt);

            if ( in.hasNextInt() ) {
                return in.nextInt();
            } else {
                in.next();
                System.out.println("That is not an integer");
            }
        }
    }

    /**
     * @param int1 An integers
     * @param int2 Another integer
     * @return An 7-element array containing the sum, difference, product, average, distance, minimum, and maximum
     * value of two given integers, in that order.
     */
    public static double[] analyzeInts(int int1, int int2) {
        var calcs = new double[7];

        calcs[0] = int1 + int2;
        calcs[1] = int1 - int2;
        calcs[2] = int1 * int2;
        calcs[3] = ( int1 + int2 ) / 2.0;
        calcs[4] = Math.abs(int1 - int2);
        calcs[5] = Math.min(int1, int2);
        calcs[6] = Math.max(int1, int2);

        return calcs;
    }

    /**
     * Formats and prints the set of values in the given calculations array in.
     * @param calculations The set of values to print, assumed to be a 7-element array containing a sum, difference,
     *                     product, average, distance, minimum, and maximum, in that order.
     * @param out The PrintStream to which the output should be printed
     */
    public static void printAnalysis(double[] calculations, PrintStream out) {
        out.println(String.format("Sum: %15.0f", calculations[0]));
        out.println(String.format("Difference: %8.0f", calculations[1]));
        out.println(String.format("Product: %11.0f", calculations[2]));
        out.println(String.format("Average: %14.2f", calculations[3]));
        out.println(String.format("Distance: %10.0f", calculations[4]));
        out.println(String.format("Min: %15.0f", calculations[5]));
        out.println(String.format("Max: %15.0f", calculations[6]));
    }
}
