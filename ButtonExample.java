package yash;

import java.awt. Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class ButtonExample {

    public static void main(String[] args) {
        // Create a new frame
        Frame fr = new Frame("Many Languages");
        fr.setSize(300, 300);
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
       
        Button b1= new   Button("OK");
        Button b2= new  Button("Cancel");
        Button b3= new  Button("Reset");
        
        fr.add(b1);
        fr.add(b2);
        fr.add(b3);
    }
}

