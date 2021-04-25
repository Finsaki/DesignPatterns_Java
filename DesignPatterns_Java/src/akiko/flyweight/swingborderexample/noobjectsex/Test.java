package akiko.flyweight.swingborderexample.noobjectsex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * Implemented "Make your apps fly" flyweight design patterns by David Geary.
 * Added timeshowcasing to show differences between no objects used, flyweight objects and heavyweight objects
 * 
 * @author David Geary, https://www.infoworld.com/article/2073632/make-your-apps-fly.html?page=2
 *
 */
public class Test extends JFrame{
	
   private static final Color colors[] = { Color.red, Color.blue,
                                           Color.yellow, Color.orange,
                                           Color.black,  Color.white };
   private static final int WINDOW_WIDTH=400,
                            WINDOW_HEIGHT=400,
                           NUMBER_OF_LINES=10000;
   
   public Test() {
	   
      Container contentPane = getContentPane();
      contentPane.setLayout(new BorderLayout());
      
      JButton button = new JButton("draw lines");
      final JPanel  panel  = new JPanel();
      final String explanation = "Drawing lines with no objects, time spent: "; //own addition
      JLabel timeSpent = new JLabel(explanation); //own addition
      contentPane.add(timeSpent, BorderLayout.NORTH); //own addition
      contentPane.add(panel,  BorderLayout.CENTER);
      contentPane.add(button, BorderLayout.SOUTH);
      setBounds(20,20,WINDOW_WIDTH,WINDOW_HEIGHT);      
      button.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent event) {
        	long start = System.currentTimeMillis(); //own addition
        	
            Graphics g = panel.getGraphics();
            for(int i=0; i < NUMBER_OF_LINES; ++i) {
               g.setColor(getRandomColor());
               g.drawLine(getRandomX(), getRandomY(), 
                          getRandomX(), getRandomY());
            }
            
            long finish = System.currentTimeMillis(); //own addition
     	   	long timeElapsed = finish - start; //own addition
     	   	timeSpent.setText(explanation + timeElapsed + " milliseconds"); //own addition
         }
      });
   }
   
   public static void main(String[] args) {
      Test test = new Test();
      test.show();
   }
   
   private int getRandomX() {
      return (int)(Math.random()*WINDOW_WIDTH);
   }
   
   private int getRandomY() {
      return (int)(Math.random()*WINDOW_HEIGHT);
   }
   
   private Color getRandomColor() {
      return colors[(int)(Math.random()*colors.length)];
   }
   
}
