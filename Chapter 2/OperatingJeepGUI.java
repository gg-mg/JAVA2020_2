import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 

public class OperatingJeepGUI extends JFrame 
{ 
  private JeepPanel canvas = new JeepPanel();

  public OperatingJeepGUI()
  {
    add(canvas);
  }
  
  /** Main method */
  public static void main(String[] args) {
    OperatingJeepGUI frame = new OperatingJeepGUI();
    frame.setTitle("Operating Jeep");
    frame.setSize(700, 320);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}

class JeepPanel extends JPanel {
    private JButton leftButton; 
    private JButton rightButton; 
    private JTextField posField; 
	private MyActionHandler myHandler = new MyActionHandler();
	
    private final int MAX = 10;  // maximum face value
    private int origin = 320;
    private int x = 320;
    private int y = 100;

    private int distance  = 0;
    private int oldx = 320;
    private int oldy = 100;
    private int r = 5;

    private int delta_x = 40;
    private int delta_y = 20;
    private int wheel1_x;
    private int wheel1_y;
	
    private int wheel2_x;
    private int wheel2_y;

    private int wheel1_oldx;
    private int wheel1_oldy;
	
    private int wheel2_oldx;
    private int wheel2_oldy;
	 
    public JeepPanel()  
    { 
        // Now we will use the FlowLayout 
        setLayout(new FlowLayout()); 
        leftButton = new JButton("<"); 
        rightButton = new JButton(">"); 
		
        int offset = x - origin;
        String str = "Current Pos: " + offset; 
        posField = new JTextField(str,40); 
	  
        add(leftButton); 
        add(rightButton); 
        add(posField); 
        // Attach actions to the components 
        leftButton.addActionListener(myHandler); 
        rightButton.addActionListener(myHandler); 
        wheel1_x = x + 10;
        wheel2_x = x + delta_x - 10;
        wheel1_y = y + delta_y + 6;
        wheel2_y = y + delta_y + 6;
          
        wheel1_oldx = wheel1_x;
        wheel2_oldx = wheel2_x;
        wheel1_oldy = wheel1_y;
        wheel2_oldy = wheel2_y;
		
		repaint();
    } // end of method init()

    // Here we will show the results of our actions 
    protected void paintComponent(Graphics g) 
    { 
	    super.paintComponent(g);
		
        g.setColor(Color.white);
        g.fillRect(oldx, oldy, delta_x, delta_y); // clear the buffer
        g.fillOval(wheel1_oldx -r, wheel1_oldy-r, r*2, r*2);            // draw the circle
        g.fillOval(wheel2_oldx -r, wheel2_oldy-r, r*2, r*2);            // draw the circle
   
        g.setColor(Color.red);
   
        g.fillRect(x, y, delta_x, delta_y); 
        g.fillOval(wheel1_x -r, wheel1_y-r, r*2, r*2);            // draw the circle
        g.fillOval(wheel2_x -r, wheel2_y-r, r*2, r*2);            // draw the circle

        g.drawLine(0,y+delta_y+r*2,640, y+delta_y+r*2);

        int curPos = x - origin;
        int prevPos = oldx - origin;
	   
        String str = "Current Pos: " + curPos + ",  Move: " +  distance +  ", Previous Pos: " + prevPos;           
        posField.setText(str); 
    } // end of method paintComponent()

    // When the button is clicked this method will get automatically called 
    // This is where you specify all actions. 
    private class MyActionHandler implements ActionListener{ 
		public void actionPerformed(ActionEvent evt)  
		{ 
			// Here we will ask what component called this method 
			if (evt.getSource() == leftButton) {  
                // So it was the leftButton, then let's perform his actions 
                // Let the applet perform Paint again. 
                oldx  = x;
                wheel1_oldx =  wheel1_x;
		        wheel2_oldx =  wheel2_x;	 
		        distance = (int)(Math.random() * MAX) + 1;	 
		        distance = - distance;	 
                x = x + distance;
		        wheel1_x =  wheel1_x + distance;
		        wheel2_x =  wheel2_x + distance;
			 
                repaint(); 
			}
			else if (evt.getSource() == rightButton) {  // Actions of the rightButton
			    oldx  = x;
                wheel1_oldx =  wheel1_x;
		        wheel2_oldx =  wheel2_x;	
		        distance = (int)(Math.random() * MAX) + 1;	 	 
                x = x+ distance;
		        wheel1_x =  wheel1_x + distance;
		        wheel2_x =  wheel2_x + distance;
			
                repaint(); 
		    } 
		} // end of method actionPerformed()
    }// end of private class 
} // end of class OperatingJeepGUI
  
