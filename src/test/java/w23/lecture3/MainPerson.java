package w23.lecture3;

public class MainPerson {
    public static void main(String[] args) {
        Person steph=new Person();
        Person matt=new Person();
        steph.setFirstName("Steph");
        steph.setLastName("Mattalo");
        try {
            steph.setAge(29);
        }catch(Exception e){
            System.out.println("Error setting age"+e.getMessage());
            System.out.println("Try again later");
            System.exit(0);
        }

        System.out.println("Stephs first name is: "+steph.getFirstName());
        System.out.println("Stephs last name is: "+steph.getLastName());
        System.out.println("Stephs age is: "+steph.getAge());

        matt.setFirstName("Mathew");
        matt.setLastName("Allan");
        try {
            matt.setAge(19);
        }catch(Exception e){
            System.out.println("\n===============================\nError setting age: "+e.getMessage());
            System.out.println("Try again later");
            System.exit(0);
        }

        System.out.println("Matts first name is: "+matt.getFirstName());
        System.out.println("Matts last name is: "+matt.getLastName());
        System.out.println("Matts age is: "+matt.getAge());

        Person george=new Person("George", "washington", 45);
        Person justin=new Person("George");
        Person justin2=new Person(30);


        System.out.println("There are "+Person.getCOUNT()+" people that have been created");

    }
}
