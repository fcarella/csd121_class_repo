package w23.lecture2.frameExample;

import javax.swing.*;
import java.awt.*;

/*
   A component that draws two rectangles.
*/
public class RectangleComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      System.out.println("Im here");
      // Construct a rectangle and draw it
      Rectangle box = new Rectangle(5, 10, 20, 30);
      g2.draw(box);

      // Move rectangle 15 units to the right and 25 units down
      box.translate(15, 25);

      // Draw moved rectangle
      g2.draw(box);

      g2.setColor(Color.RED);
      Rectangle r2=new Rectangle(0, 0, 200, 200);
      g2.fill(r2);

   }
}
