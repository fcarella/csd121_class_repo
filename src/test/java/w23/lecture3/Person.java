package w23.lecture3;

public class Person {
    // create private instance variables
    private String firstname;
    private String lastname;
    private int age;

    public Person() {
        // default no argument constructor
        firstname="no firstname set";
        lastname="no lastname set";
        age=0;
    }

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    public Person(String firstname) {
        this.firstname = firstname;
    }

    // private class variable (static makes it a class variable) called COUNT
    private static int COUNT;

    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age<=0)
            throw new Exception("Illegal Age");
        this.age = age;
    }

    public int getCount(){
        return COUNT;
    }

    public static int getCOUNT() {
        return COUNT;
    }

    public static void setCOUNT(int COUNT) {
        Person.COUNT = COUNT;
    }

    public void setFirstName(String firstname){
        // fname is a local variable.  Its visible in the setFirstName method only
        this.firstname=firstname;
    }
    public void setLastName(String lastname){
        // fname is a local variable.  Its visible in the setFirstName method only
        this.lastname=lastname;
    }


}
