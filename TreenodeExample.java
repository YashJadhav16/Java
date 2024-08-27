package yash;
//p
import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  
public class TreenodeExample {  
JFrame f;  
TreenodeExample(){  
    f=new JFrame();   
    DefaultMutableTreeNode s1=new DefaultMutableTreeNode("India");  
    DefaultMutableTreeNode s2=new DefaultMutableTreeNode("Maharashtra");  
    DefaultMutableTreeNode s3=new DefaultMutableTreeNode("Gujurat");   
    DefaultMutableTreeNode s4=new DefaultMutableTreeNode("Pune");  
    DefaultMutableTreeNode s5=new DefaultMutableTreeNode("Mumbai");  
    DefaultMutableTreeNode s6=new DefaultMutableTreeNode("Nagpur");  
    DefaultMutableTreeNode s7=new DefaultMutableTreeNode("Nashik");  
    
    s1.add(s2);
    s1.add(s3);
    s2.add(s4);
    s2.add(s5);
    s2.add(s6);
    s2.add(s7);
    JTree jt=new JTree(s1);  
    f.add(jt);  
    f.setSize(200,200);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new TreenodeExample();  
}}  
