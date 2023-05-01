package w23.textbook.ch07.code.worked_example_1;

public class DiceAnalyzer
{
   public static void main(String[] args)
   {
      final int SIDES = 6;
      Dice dice = new Dice(SIDES); 
      dice.countInputs();
      dice.printCounters();
   }
}
