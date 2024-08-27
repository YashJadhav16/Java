package yash;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.*;

public class CheckboxExample {
    public static void main(String[] args) {
        // Create a new frame
        Frame fr = new Frame("Many Languages");
        fr.setSize(300, 300);
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
        Label l1=new Label("Select Language");
        l1.setBounds(50, 150, 150, 20);
        Checkbox b1= new  Checkbox("Marathi");
        Checkbox b2= new  Checkbox("English");
        Checkbox b3= new  Checkbox("Hindi");
        Checkbox b4= new  Checkbox("Sanskrit");
        
        fr.add(b1);
        fr.add(b2);
        fr.add(b3);
        fr.add(b4);
     
    }
}

