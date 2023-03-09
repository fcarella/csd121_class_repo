package w23.lecture3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lecture 3");
        Counter tally = new Counter();
//        int x=tally.value;
        tally.click();
        tally.click();
        int result = tally.getValue(); // Sets result to 2
        System.out.println("Tally result ="+result);
        Counter tally_2 = new Counter();
        tally_2.click();
        tally_2.click();
        tally_2.click();
        int result_2 = tally_2.getValue(); // Sets result to 2
        System.out.println("Tally result2 ="+result_2);
    }
}
