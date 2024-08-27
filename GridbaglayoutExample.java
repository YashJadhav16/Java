package yash;
import javax.swing.*;
import java.awt.*;
public class GridbaglayoutExample {
		public static void main(String[] args) {
	        JFrame frame = new JFrame("GridBagLayout Example");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 300);
	        frame.setLayout(new GridBagLayout());
	        GridBagConstraints gbc = new GridBagConstraints();
	        gbc.fill = GridBagConstraints.HORIZONTAL;
	        JButton button1 = new JButton("Button 1");
	        gbc.gridx = 0;
	        gbc.gridy = 0;
	        frame.add(button1, gbc);
	        JButton button2 = new JButton("Button 2");
	        gbc.gridx = 1;
	        gbc.gridy = 0;
	        frame.add(button2, gbc);
	        JButton button3 = new JButton("Button 3");
	        gbc.gridx = 0;
	        gbc.gridy = 1;
	        gbc.gridwidth = 2;
	        frame.add(button3, gbc);
	        frame.setVisible(true);
	    }
	}
