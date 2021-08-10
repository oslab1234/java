import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TraLights extends JFrame implements ItemListener
{
JRadioButton b1,b2,b3;
JLabel l1,l2,l3;
ButtonGroup bg;
TraLights()
{
b1=new JRadioButton("RED");
b1.setBackground(Color.RED);
b2=new JRadioButton("YELLOW");
b2.setBackground(Color.YELLOW);
b3=new JRadioButton("GREEN");
b3.setBackground(Color.GREEN);
bg=new ButtonGroup();
l1=new JLabel();
l1.setForeground(Color.RED);
l2=new JLabel();
l2.setForeground(Color.YELLOW);
l3=new JLabel();
l3.setForeground(Color.GREEN);
setLayout(new FlowLayout());
bg.add(b1);
bg.add(b2);
bg.add(b3);
add(b1);
add(l1);
add(b2);
add(l2);
add(b3);
add(l3);
b1.addItemListener(this);
b2.addItemListener(this);
b3.addItemListener(this);
setSize(500,500);
setVisible(true);
setTitle("Traffic Lights");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void itemStateChanged(ItemEvent ie)
{
if(ie.getSource()==b1)
{
l1.setText("STOP!!");
l2.setText("");
l3.setText("");
}
else if(ie.getSource()==b2)
{
l2.setText("READY..");
l1.setText("");
l3.setText("");
}
else
{
l3.setText("GO....");
l1.setText("");
l2.setText("");
}
}
}
class TrafficLights
{
public static void main(String args[])
{
new TraLights();
}
}
