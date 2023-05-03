package w23.lab4_partial_solution.q1;

import w23.lab4_partial_solution.test.TestHelper;

public class AppTester {

    public static void main(String[] args) {

        test_App_typicalUsageWorks();
        test_App_repromptsOnInvalidFirstInt();
        test_App_repromptsOnInvalidSecondInt();

    }

    private static void test_App_typicalUsageWorks() {
        // Simulate the user pressing '2' then 'enter' then '3' then 'enter'
        TestHelper.setSystemIn("2%n3%n".formatted());  // Calling formatted() here converts %n to the system's line separator
        TestHelper.redirectSystemOut();  // So that the program output can be captured below...

        App.main(null);  // Run the program by calling the main method

        String expected = """
                Enter an integer: Enter another integer: Sum:               5
                Difference:       -1
                Product:           6
                Average:           2.50
                Distance:          1
                Min:               2
                Max:               3
                """;

        String actual = TestHelper.getOutput();  // Get the program output

        if ( expected.equals(actual) ) {
            TestHelper.passMessage("The app works on a typical set of inputs");
        } else {
            TestHelper.failMessage("The app fails on a typical set of inputs.%n%nExpected%n%n%s%nbut got%n%n%s".formatted(expected, actual));
        }
    }

    private static void test_App_repromptsOnInvalidFirstInt() {
        TestHelper.setSystemIn("two%ntwo%n10%n5%n".formatted());
        TestHelper.redirectSystemOut();

        App.main(null);

        String expectedStart = """
                Enter an integer: That is not an integer
                Enter an integer: That is not an integer
                Enter an integer: Enter another integer: Sum:""";

        String actual = TestHelper.getOutput();

        if (actual.startsWith(expectedStart) ) {
            TestHelper.passMessage("The app re-prompts repeatedly if the user doesn't enter a valid first integer");
        } else {
            TestHelper.failMessage("The app does not re-prompt when the user enters an invalid first integer%n%nExpected start%n%n%s%nbut got%n%n%s".formatted(expectedStart, actual));
        }
    }

    private static void test_App_repromptsOnInvalidSecondInt() {
        TestHelper.setSystemIn("-1%none%none%n1%n".formatted());
        TestHelper.redirectSystemOut();

        App.main(null);

        String expectedStart = """
                Enter an integer: Enter another integer: That is not an integer
                Enter another integer: That is not an integer
                Enter another integer: Sum:""";

        String actual = TestHelper.getOutput();

        if (actual.startsWith(expectedStart) ) {
            TestHelper.passMessage("The app re-prompts repeatedly if the user doesn't enter a valid second integer");
        } else {
            TestHelper.failMessage("The app does not re-prompt when the user enters an invalid second integer%n%nExpected start%n%n%s%nbut got%n%n%s".formatted(expectedStart, actual));
        }
    }

}
