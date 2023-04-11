package w23.lecture4.ex1;

import java.util.Scanner;

public class Ex1App {

    public void run(){
        System.out.println("Lecture 4 Example 1");

        int x=0;
        int y=0;
        // adds 1 to x
        x=x+1; // 1
        y=x++; // y=1, x=2
        y=++x;
        x=x++;  //x=3
        x++; //x=4
        ++x; //x=5
        x+=1; //x=6

        x=5;
        y=2;
        int z=x/y; // z=2.5
        double r=5.0/2;
        r=5/2.0;
        r=(double)5/2; // cast an int (5) to a double

        z=5%2;
        x=1234;
        z=x%10;
        x=x/10;
        z=x%10;
        x=x/10;
        z=x%10;
        x=x/10;

        x=x;

        String x_=""+x;
        r=(double)5;

        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=keybd.nextInt();
        System.out.println("Your age is: "+age);

        x=x;





        // declare all signed integer primitive data types
        // local to the run method
        int thisIsAnInt;
        byte thisIsAByte;
        short thisIsAShort;
        long thisIsALong;

        int anotherInt=10;

        double thisIsADouble;
        float thisIsAFloat;
        char thisIsAChar;
        boolean thisIsABoolean;

        thisIsAnInt=2147483647;
        thisIsAByte=127;
        thisIsAByte=-128;
        thisIsALong=2147483648L;

        thisIsADouble=1.34;
        //thisIsAFloat=1.34; // 1.34 is treatedd asa double and will generate an error
        thisIsAFloat=1.34f;

        thisIsAChar='A';

        thisIsABoolean=true;
        thisIsABoolean=false;

        System.out.println("thisIsAChar=="+thisIsAChar);


        System.out.println("thisIsAnInt="+thisIsAnInt);

        int n = 1000000;
        System.out.println(n * n);

        final double QUARTER_VALUE = 0.25;
        //QUARTER_VALUE = 0.26;

        double change=Constants.QUARTER_VALUE;
        double dime=Constants.DIME_VALUE;

        int sn=Constants.getSerialNumber();
//        String isbn=Constants.getISBN();


    }
}
