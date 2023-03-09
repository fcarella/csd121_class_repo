package w23.lecture3;

public class Counter {
    // create an instance variable called value of type int
    private int value=0;
    public void click(){
        value++;
//        value=value+1;
//        value+=1;
    }
    public void unclick(){
        value=value-1;
    }
    public int getValue(){
        return value;
    }
    public void reset(){
        value=0;
    }
}
