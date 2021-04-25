package akiko.flyweight.swingborderexample.heavyweightex;

import java.awt.*;

/**
 * Heavyweight Line object
 * @author David Geary
 *
 */
public class Line {
	
   private Color color = Color.black;
   private int x, y, x2, y2;
   
   public Line(Color color, int x, int y, int x2, int y2) {
      this.color = color;
      this.x = x;   this.y = y;
      this.x2 = x2; this.y2 = y2;
   }
   
   public void draw(Graphics g) {
      g.setColor(color);
      g.drawLine(x, y, x2, y2);
   }
   
}
