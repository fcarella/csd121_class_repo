/*
 These are examples of declaring and initializing variables in java

* */
package w23.lecture2.ex1;

import java.awt.Rectangle;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
        int pi=3;
        double piD=3.14;
        float piF=3.14f;

        int y;

        String greeting="Hello, Dave";
        String name="Fred"+" Carella "+" was born in "+1960+" " + 3.14f + " "+ 3.14;
        System.out.println(name);
         String _name_of_string;// you can use _ to separate words
         String nameOfString; // use camel humps for variable names

        int z=0;
        int Z;
        String _101dalmatians;

        while(z == 0 ){
            z++;
//            Z++;
        }
        {
            int a;
        }
        {
            int a;
        }

        int sum=add(12, 5);

        String greeting2 = "Hello, World!";
        int numberOfCharacters = greeting2.length();

        String river = "Mississippi";
        String bigRiver = river.toUpperCase();
        int n=greeting2.length();
        System.out.println(greeting2.length());

//        river = river.replace("issipp", "our");
        System.out.println(river.replace("issipp", "our"));

        // construct 4 rectangles using the new operator
        Rectangle rect1 = new Rectangle(5, 10, 20, 30);
        Rectangle rect2 = new Rectangle(15, 20, 30, 40);
        Rectangle rect3 = new Rectangle(5, 10, 20, 30);
        Rectangle rect4 = new Rectangle(5, 10, 20, 30);

        Rectangle rect5=rect1;
        rect1.setLocation(100,200);


    }

    private static int add(int x, int y){
        int sum=x+y;
        return sum;
    }

}
