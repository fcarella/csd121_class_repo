/*
 These are examples of declaring and initializing variables in java

* */
package w23.lecture2.ex1;

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

    }

    private static int add(int x, int y){
        int sum=x+y;
        return sum;
    }

}
