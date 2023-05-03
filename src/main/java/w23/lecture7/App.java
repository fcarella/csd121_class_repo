package w23.lecture7;

import java.util.ArrayList;

public class App {
    // instance variable
//    private Scanner in=new Scanner(System.in);
    public void run() {
        System.out.println("example 1");

        for(int counter=1;counter<=10;counter++){
            System.out.println("counter="+counter);
        }

        for(int counter=1;counter<=10;counter++){
            System.out.println("counter="+counter);
        }

        MedalScore[][] counts0= new MedalScore[8][3];

        int[][] counts =
                {
                        { 0, 3, 0, 1 },
                        { 0, 3, 0, 2 },
                        { 0, 0, 1, 3 },
                        { 0, 0, 1, 4 },
                        { 1, 0, 0, 5 },
                        { 0, 0, 1, 6 },
                        { 3, 1, 1, 7 },
                        { 0, 1, 0, 8 },
                        { 1, 0, 1, 9 }
                };
        for (int i = 0; i < counts.length; i++)
        {
            for (int j = 0; j < counts[0].length; j++)
            {
                System.out.printf("%8d", counts[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < 8; i++)
        {
            // Process the ith row
            for (int j = 0; j < 3; j++)
            {
                // Process the jth column in the ith row
                System.out.printf("%8d", counts[i][j]);
            }
            System.out.println(); // Start a new line at the end of the row
        }


        ArrayList<String> names= new ArrayList<>();
//        names.add(10.2);
//        names.add(true);
//        names.add(new Car());
        names.add("Joe");
        names.add("Paul");
        names.add("George");
        names.add("John");



        System.out.println(names);

        for(String name:names)
            System.out.println(name);

        ArrayList<String> names2=names;
        ArrayList<String> newNames = new ArrayList<String>(names);

    }

}