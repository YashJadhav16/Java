package yash;
import javax.swing.*;
import java.awt.*;
public class GridlayoutExample {
	    public static void main(String[] args) {
	        // Create the frame
	        JFrame frame = new JFrame("GridLayout Example");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 200);    
	        // Set the layout manager to GridLayout with 2 rows and 2 columns
	        frame.setLayout(new GridLayout(2, 2));
	        // Create and add buttons to the frame
	        frame.add(new JButton("Button 1"));
	        frame.add(new JButton("Button 2"));
	        frame.add(new JButton("Button 3"));
	        frame.add(new JButton("Button 4"));
	        // Make the frame visible
	        frame.setVisible(true);
	    }
	}
