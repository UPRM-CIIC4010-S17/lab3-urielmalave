import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.BLACK);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        //Draw a border
                        //g.setColor(Color.YELLOW);
                        //g.drawRect(x1, y1, width, height);
                        
                        //Draw a border inside the window.
                        //g.setColor(Color.RED);
                        //g.drawRect(x1 + 5, y1 + 5, 290, 265);
                        
                        //Draw a diagonal line. 
                        //g.setColor(Color.WHITE);
                        //g.drawLine(x1, y1, x2, y2);
                        
                        //Draw a diagonal line from the top right corner to the bottom left corner.  
                        //g.setColor(Color.GREEN);
                        //g.drawLine(y2, y1, x1 - 100, x2 + 75);
                        
                        //Draw an oval. 
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval(125, 100, 55, 55);
            }    
} 