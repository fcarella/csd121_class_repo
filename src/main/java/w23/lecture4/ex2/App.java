package w23.lecture4.ex2;

import java.util.Scanner;

public class App {
    // instance variable
//    private Scanner in=new Scanner(System.in);
    public void run() {
        System.out.println("Hello");
        // local variable
        int bottles = 0;
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter the number of bottles: ");
                bottles = in.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("There was a problem,try again...");
            }
            System.out.println("bottles=" + bottles);
        }

        System.out.println("real number = " + 5.0 / 3);
        System.out.printf("real numbers = %15.2f  %15.2f\n",5.0 / 3, 12.0/5);
        System.out.printf("real numbers = %15.2f  %15.2f\n",11.0 / 3, 12.0/6);

        Scanner in=new Scanner(System.in);
        System.out.print("Please enter the unit price: ");
        double unitPrice = in.nextInt();
    }
}