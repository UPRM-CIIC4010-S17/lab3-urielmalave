import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

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
                        g.setColor(Color.WHITE);
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
                        //g.setColor(Color.LIGHT_GRAY);
                        //g.fillOval(125, 100, 55, 55);
                        
                        //Polygon p = new Polygon();
                        //p.addPoint(x1 + 5, y1 + 25);
                        //p.addPoint(x1 + 20, y1 + 10);
                        //p.addPoint(x1 + 35, y1 + 25);
                        //p.addPoint(x1 + 25, y1 + 25);
                        //p.addPoint(x1 + 25, y1 + 45);
                        //p.addPoint(x1 + 15, y1 + 45);
                        //p.addPoint(x1 + 15, y1 + 25);
                        //g.setColor(Color.YELLOW);
                        //g.fillPolygon(p);
                        
                        //Polygon p2 = new Polygon();
                        //p2.addPoint(x1 + 25, y1 + 73);
                        //p2.addPoint(x1 + 41, y1 + 73);
                        //p2.addPoint(x1 + 47, y1 + 58);
                        //p2.addPoint(x1 + 53, y1 + 73);
                        //p2.addPoint(x1 + 69, y1 + 73);
                        //p2.addPoint(x1 + 56, y1 + 83);
                        //p2.addPoint(x1 + 61, y1 + 98);
                        //p2.addPoint(x1 + 47, y1 + 88);
                        //p2.addPoint(x1 + 34, y1 + 98);
                        //p2.addPoint(x1 + 38, y1 + 83);
                        //g.setColor(Color.WHITE);
                        //g.drawPolygon(p2);
                        
                        g.setColor(Color.RED);
                        g.fillRect(25, 30, 200, 30);
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(25, 60, 200, 30);
                        
                        g.setColor(Color.RED);
                        g.fillRect(25, 90, 200, 30);
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(25, 120, 200, 30);
                        
                        g.setColor(Color.RED);
                        g.fillRect(25, 150, 200, 30);
                        
                        Polygon p = new Polygon();
                        p.addPoint(x1 + 25, y1 + 55);
                        p.addPoint(x1 + 45, y1 + 65);
                        p.addPoint(x1 + 65, y1 + 75);
                        p.addPoint(x1 + 85, y1 + 85);
                        p.addPoint(x1 + 105, y1 + 95);
                        p.addPoint(x1 + 125, y1 + 105);
                        p.addPoint(x1 + 105, y1 + 115);
                        p.addPoint(x1 + 85, y1 + 125);
                        p.addPoint(x1 + 65, y1 + 135); 
                        p.addPoint(x1 + 45, y1 + 145);
                        p.addPoint(x1 + 25, y1 + 155);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p);
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 93);
                        p2.addPoint(x1 + 41, y1 + 93);
                        p2.addPoint(x1 + 47, y1 + 78);
                        p2.addPoint(x1 + 53, y1 + 93);
                        p2.addPoint(x1 + 69, y1 + 93);
                        p2.addPoint(x1 + 56, y1 + 103);
                        p2.addPoint(x1 + 61, y1 + 118);
                        p2.addPoint(x1 + 47, y1 + 108);
                        p2.addPoint(x1 + 34, y1 + 118);
                        p2.addPoint(x1 + 38, y1 + 103);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
            }     
} 