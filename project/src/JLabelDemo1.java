

import javax.swing.* ;

import java.awt.*;   

import java.awt.event.*;   

 
public class JLabelDemo1 extends JFrame

{

  JLabel lab1, lab2, lab3;

  public JLabelDemo1()

  {

    Container c = getContentPane();

    c.setLayout(new GridLayout(3, 1, 0, 5)); 

           // using JLabel constructor with a string argument

    lab1 = new JLabel("Hello World");                                                      

    lab1.setToolTipText("Greetings");

    c.add(lab1);                  // to add the label to the container 

	                  // using JLabel constructor with a string, icon and alignment arguments

    ImageIcon ic1 = new ImageIcon("bird4.gif");

    lab2 = new JLabel("How do you do?", ic1, SwingConstants.LEFT);

    lab2.setToolTipText("Well Wishes");

    c.add(lab2);

	                  // using JLabel constructor with no arguments. Properties are set later

    ImageIcon ic2 = new ImageIcon("bird5.gif");

    lab3 = new JLabel();

    lab3.setText("All are Okay");

    lab3.setToolTipText("Quite and Peaceful");

    lab3.setIcon(ic2);

	    

    lab3.setHorizontalTextPosition(SwingConstants.CENTER);

    lab3.setVerticalTextPosition(SwingConstants.BOTTOM);  // if kept in comments, icon and label come in one line. Now text comes below the image

    c.add(lab3);

 

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setTitle("Learning JLabel");                                               

    setSize(300,350);   

    setVisible(true); 

  }

  public static void main(String args[])

  {

    new JLabelDemo1();                                                         

  }

} 

