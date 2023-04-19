package w23.lecture4.ex3;

import java.util.Scanner;

public class App {
    // instance variable
//    private Scanner in=new Scanner(System.in);
    public void run() {
        System.out.println("example 3");

        Car ford=new Car("Ford)");
        Car ford2=new Car("Ford)");
        Car ford3=ford;
        Car ford4=null;

        System.out.println(ford==ford2);
        System.out.println(ford.equals(ford2));
        System.out.println(ford==ford3);
        System.out.println(ford.equals(ford3));
        System.out.println(ford2.equals(ford3));
        System.out.println(ford4.equals(ford3));

    }
}