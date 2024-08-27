package yash;

import javax.swing.*;
import java.awt.*;

public class JFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel("Hello, World!");
        frame.add(label);
        JButton button = new JButton("Click Me");
        frame.add(button);
        frame.setVisible(true);
    }
}
